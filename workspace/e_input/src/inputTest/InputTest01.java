package inputTest;

import java.util.Scanner;

public class InputTest01 {
   public static void main(String[] args) {
//      이름을 입력받고 출력하기
//	    이름앞에 넣을 문자열을 선언
      String nameMessage = "이름: ";
//      이름을 정하기 이전이므로 공백으로 선언
      String name = "";
//      scanner를 선언? 
      Scanner scanner = new Scanner(System.in);
//      이름앞에 넣을 문자열 출력
      System.out.println(nameMessage);
//      이름을 입력하여 출력하는 문장 선언
      name = scanner.next();
//      입력하여 출력하는 실행문 종
      System.out.println(name);
      
   }
}

