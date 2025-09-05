package inputTesk02;

import java.util.Scanner;

public class InputTesk02 {

	public static void main(String[] args) {
//		두 정수를 입력받은뒤 곱셈 결과를 출력한다.
//		단, nexInt()가 아닌 next()로 사용한다.
//		숫자앞 넣을 문자열을 선언
		String numbername="정수의값은";
//		두정수를 선언 아직미정이므로 0으로선언
		int num1 = 0; int num2=0;
//		sc를 선언?
		Scanner sc=new Scanner(System.in);
//      숫자앞에 넣을 문자열 출력
		System.out.println(numbername);
		
//		next()로표현하려면
//		number1=Integer.parseInt(scanner.next())
//		각숫자를 입력하여 출력하게 선언
		num1=sc.nextInt();
		num2=sc.nextInt();
//		결과값을 새로운 변수로 선언
		int result=(num1*num2);
//		결과값을 출력
		System.out.println(result);
		
		

	}

}
