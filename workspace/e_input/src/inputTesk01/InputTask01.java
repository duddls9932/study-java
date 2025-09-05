package inputTesk01;

import java.util.Scanner;

public class InputTask01 {

	public static void main(String[] args) {
//		반려동물 이름을 입력받고 출력하기
//		반려동물의 이름을표현하는 문자열을 변수로선언한다 
		String dogMessege="강아지의 이름은:";
//		아직 입력받기 이전이므로 공백으로 선언
		String dogName="";
//		sc를 선언? 한다?
		Scanner sc=new Scanner(System.in);
		
//		문자열을 선언한다
		System.out.print(dogMessege);
//		강아지이름부분을 sc로 선언?한다? (입력하면 그값으로 나오게하는것)	
		dogName=sc.next();
//		새로운 변수를 선언해 문장? 을 완성한다
		String result=dogMessege+dogName;
//		완성된 문장을 출력한다 
		System.out.println(result);
		

	}

}
