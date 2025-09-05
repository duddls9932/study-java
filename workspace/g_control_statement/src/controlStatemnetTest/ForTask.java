
package controlStatemnetTest;

import java.util.Scanner;

public class ForTask {
   public static void main(String[] args) {
//      반복의 핵심은 반복횟수 최소화이다.

//      브론즈
//      1 ~ 100까지 출력
//	    100회 반복하는 반복문 선언 반복횟수1부터 출력하는 반복문 출력 
      for (int i = 0; i < 100; i++) {
         System.out.println(i + 1);
      }

//      100 ~ 1까지 출력
//      100회 반복하는 반복문 선언 100-i선언하여 100~1까지 출력하는 반복문 출력
      for (int i = 0; i < 100; i++) {
         System.out.println(100 - i);
      }

//      1 ~ 100까지 중 짝수만 출력
//      50번 반복하는 반복문 선언 짝수만선언하기위해 i*2를 선언 
      for (int i = 0; i < 50; i++) {
         System.out.println((i + 1) * 2);
      }

//      짝수: 2의 배수다
//      홀수: 2의 배수가 아니다
//      2의 배수란, 2로 나누었을 때 나머지가 0인 수이다.
//      나머지 연산자: %(모듈러스)
//      예시) 10 % 3 == 1
//      System.out.println(10 % 3);
//      System.out.println(11 % 2 == 0);
//      100회반복되는 반복문중에 몫이 0인 i만 출력하여 짝수만 출력
      for (int i = 0; i < 100; i++) {
         if((i + 1) % 2 == 0) {
            System.out.println(i + 1);
         }
      }

//      실버
//      1 ~ 10까지 합 출력
//      결과값 선언
      int result = 0;
//      결과값+반복횟수를 계속더해 1~10의합을 출력 
      for (int i = 0; i < 10; i++) {
//         result = result + i + 1;
//         첫 번째 반복: result = 0 + 1
//         두 번째 반복: result = (0 + 1) + 2
//         세 번째 반복: result = (0 + 1 + 2) + 3
//         네 번째 반복: result = (0 + 1 + 2 + 3) + 4
         result += i + 1;
      }
//      
      System.out.println(result);

//      1 ~ n까지 합 출력(n은 사용자에게 입력받는다)
//      스캐너 실행
      Scanner scanner = new Scanner(System.in);
//      입력전 출력할 메세지 선언
      String message = "1~n까지의 합\nn: ";
//       결과값과 입력할값 변수선언
      int end = 0, result1 = 0;
//       입력전 출력할 메세지 출력
      System.out.print(message);
//      스캐너 실행 
      end = scanner.nextInt();
//      사용자가 입력한값까지의 합을 더하는 반복문 선언후 출력
      for (int i = 0; i < end; i++) {
         result1 += i + 1;
      }
      System.out.println(result1);

//      골드
//      A ~ F까지 출력
//       강제형변환하여 반복문을사용해 문자를 출력
      for (int i = 0; i < 6; i++) {
         char c = (char)(65 + i);
         System.out.println(c);
      }

//      A ~ F까지 중 C 제외하고 출력
//      C를 제외하기위해  삼항연산자를 이용해 출력
      for (int i = 0; i < 5; i++) {
         System.out.println((char)((i > 1 ? 66 : 65) + i));
      }

//      다이아
//      0 1 2 3 0 1 2 3 0 1 2 3 출력
      
//      12번 반복하는 반복문에서 i의 나머지를구하여 0~3만 4번반복하는 반복문 선언 
      for (int i = 0; i < 12; i++) {
         System.out.print(i % 4 + " ");
      }
      System.out.println();

//      aBcDeFgH...Z 출력
//      대문자 소문자를 반복하여 출력하기위해 삼항연산자사용하여 반복문출력 
      for (int i = 0; i < 26; i++) {
         int target = i % 2 == 0 ? 97 : 65;
         System.out.print((char)(i + target));
      }
      System.out.println();
   }
}















