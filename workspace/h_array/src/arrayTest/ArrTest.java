package arrayTest;

public class ArrTest {
   public static void main(String[] args) {
      int[][] arrData = { { 3, 4, 5 }, { 7, 8, 9 } };
//     	2차원 배열 
//      행과 열로 각배열의 위치값을 입력하여 출력한다.
//      int rowLength = arrData.length;
//      int colLength = arrData[0].length;
//      int length = rowLength * colLength;

//      for (int i = 0; i < length; i++) {
//         System.out.println(arrData[i / 3][i % 3]);
//      }
//      매번 위처럼 하지말고 변수를 두개 선언하여 쉽게 출력 
      for (int i = 0; i < arrData.length; i++) {
         for(int j = 0; j < arrData[i].length; j++) {
            System.out.println(arrData[i][j]);
         }
      }
   }
}
