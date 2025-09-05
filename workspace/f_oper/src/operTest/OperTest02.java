package operTest;

import java.util.Scanner;

public class OperTest02 {
   public static void main(String[] args) {
//      두 정수 입력받기
//	   입력할정수를 변수선언
      int number1 = 0, number2 = 0;
//      결과값 변수선언 
      int result = 0;
//      스캐너선언전 출력할 메세지 변수선언
      String message = "두 정수를 입력하세요.\n예)2 5";
//      스캐너 선언?
      Scanner scanner = new Scanner(System.in);
//      메세지 출력
      System.out.println(message);
//      숫자1,2을 입력해서 출력하도록선언
      number1 = scanner.nextInt();
      number2 = scanner.nextInt();
      
//      System.out.println(number1);
//      System.out.println(number2);
      
//      두 정수 비교
//      더 큰 값을 출력한다.
//      단, 두 수가 같을 경우 "두 수가 같습니다" 출력
//      더큰값을 출력하기위해 삼항연상자를사용해 출력
      result = number1 > number2 ? number1 : number2;
      System.out.println("더 큰 값: " + result);
            
   }
}

















