package inputTesk03;

import java.util.Scanner;

public class InputTesk03 {

	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 결과 출력
//		nextInt() 사용하기
//		nextInt 앞에 출력할 문자열 선언
		String numberMessge="정수 3개를 입력하세요";
//      정수 3개 변수로 선언
 		int num1=0; int num2=0; int num3=0;
//		3개를 곱해서 나올 결과값을 변수로 선언 
 		int result=0;
// 		결과값전에 문자열 출력 
		System.out.println(numberMessge);
//		scanner 선언 
		Scanner sc =new Scanner(System.in);
//		각정수 nexInt로 선언? 
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
//		결과값을 3개를곱한 결과값을 변수로 선언
		result=(num1+num2+num3);
//		결과값 출력
		System.out.println(result);
		
//		과제 예제
//		사용자로부터 국어, 영어, 수학 점수를 각각 입력받고,
//		이 세 과목의 총점과 평균을 출력하는 프로그램을 작성하세요.
//		단, 평균은 소수점 한 자리까지만 출력하도록 하세요

		String pradeMessge="3과목 합의 평균은";
		int language = 0; int math = 0; int english = 0;
		double result1 = 0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println(pradeMessge);
		
		language=sc.nextInt();
		math=sc.nextInt();
		english=sc.nextInt();
		
		result1=((language+math+english)/3.0);
		
		System.out.println(result1);
		// 소수점 나오게 표기하고싶으나 앞에 더블붙어도 안되네요
		
		
		
	}

}
