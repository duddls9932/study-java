package controlStatemnetTest;

import java.util.Scanner;

public class DowhileTest {
   public static void main(String[] args) {
//	   입력받기전 출력할 메세지 선언
      String message = "1.통신 요금 조회\n2.번호 변경\n3.통신사 변경\n0.상담원 연결";
//      스캐너실행
      Scanner scanner = new Scanner(System.in);
//      번호 선언
      int choice = 0;
//    두와일 반복문을사용해 메세지 출력
      do {
         System.out.println(message);
         choice = scanner.nextInt();
      } while(choice != 0);
   }
}
