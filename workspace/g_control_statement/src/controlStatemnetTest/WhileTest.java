package controlStatemnetTest;

public class WhileTest {
   public static void main(String[] args) {
//      이름 10번 출력하기
      
//      이런 상황에서 while문을 사용하는 것은 옳지 않다.
//	   반복횟수를선언
      int count = 0;
//      10이될때까지 10번반복
      while(count != 10) {
         System.out.println(count + ".한동석");
         count++;
      }
//      for반복문을 사용하면 훨신 쉽게 사용가능하다 
      for (int i = 0; i < 10; i++) {
         System.out.println(i + ".한동석");
      }
   }
}
