package operTest;

public class OperTest01 {
   public static void main(String[] args) {
//      isTrue라는 변수를 선언
      boolean isTrue = 10 == 11;
//     isTrue 그리고 and가 20보다 작아야 결과값이 true
      boolean result = isTrue && 10 <= 20;
//      결과값 출력해보기
      System.out.println(10 == 11);
      System.out.println(10 > 3);
      System.out.println(isTrue);
      System.out.println(result);
      
//      isTrue && 10 <= 20의 결과를 true 가 나오도록 변경하기
//      단, 숫자는 변경하지 않는다. 
//     isTrue앞에 !를붙여 참으로만들기
      boolean result1= !isTrue && 10 <= 20;
//      &&대신||를 사용해 참으로만들기
      boolean result2= isTrue|| 10<= 20;
//      결과 출력
      System.out.println(result1);
      System.out.println(result2);
      
   }
}