

package controlStatemnetTest;

import java.util.Scanner;

public class IfTest {
   public static void main(String[] args) {
//      두 정수 입력받기
//	   두정수 변수선언
//	   스캐너실행
	   Scanner scanner = new Scanner(System.in);
      int number1 = 0, number2 = 0;
//      반복문에서 선언할문자열 
      String result = "";
//      입력받기전 출력할 문자열선언
      String message = "두 정수를 입력하세요.\n예)2 5";
//      문자열 실행후 스캐너실행
      System.out.println(message);
      number1 = scanner.nextInt();
      number2 = scanner.nextInt();
//      if 반복문사용하여 큰값+숫자가 뜨는 출력값  
      if(number1 > number2) {
         result = "큰 값: " + number1;
         
      }else if(number1 < number2) {
         result = "큰 값: " + number2;
         
      }else {
         result = "두 수는 같습니다.";
         
      }
      
      System.out.println(result);
   }
}














