package controlStatemnetTest;

public class OperTest {
   public static void main(String[] args) {
//      1 ~ 10까지 중 4까지만 출력한다.
//	    10번반복하는 반복문이지만 i가3이되는순간 반복문을탈출하여 4번만출력한다
      for (int i = 0; i < 10; i++) {
         System.out.println(i + 1); // a
         if (i == 3) {
            break;
         }
         System.out.println(i + 1); // b
      }

//      1 ~ 10까지 중 4를 제외하고 출력한다.
//      i가3일때만 건너뛰는 반복문을 출력한다
      for (int i = 0; i < 10; i++) {
         if(i == 3) {
            continue;
         }
         System.out.println(i + 1);
      }
   }
}
















