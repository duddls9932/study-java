package arrayTest;

public class ArTest {
   public static void main(String[] args) {
//	  배열 선언후 출력 
      int[] arData = { 2, 4, 5, 6, 8 };

      System.out.println(arData);
      System.out.println(arData[0]);

      for (int i = 0; i < arData.length; i++) {
         arData[i] = i + 1;
      }
      
      for (int i = 0; i < arData.length; i++) {
         System.out.println(arData[i]);
      }
      
//      5칸 배열 선언 후, 5, 4, 3, 2, 1 넣고 출력

      int[] arData2 = {5, 4, 3, 2, 1};
      for (int i = 0; i < arData2.length; i++) {
         System.out.println(arData2[i]);
      }
//      5칸짜리 배열선언
      int[] arData1 = new int[5];
//      각배열의값을 []안의값을 5-i로선언
      for (int i = 0; i < arData1.length; i++) {
         arData[i] = 5 - i;
      }
//      각값출력 
      for (int i = 0; i < arData1.length; i++) {
         System.out.println(arData[i]);
      }
  }
}

















