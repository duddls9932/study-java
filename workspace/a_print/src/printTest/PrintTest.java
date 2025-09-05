package printTest;

public class PrintTest {
   public static void main(String[] args) {
//      주석(CTRL + /)
//      1. 소스코드에 설명글을 작성할 때
//      2. 지금 당장 사용하지 않는 코드를 번역하고 싶지 않을 때
      
//      범위 주석(CTRL + SHIFT + /, CTRL + SHIFT + \)
      /*
       * 코드 중간에 있는 부분을 주석처리 할 때 사용한다.
       */
      
//      이름을 출력하는 부분
       System.out.println("한동석");
//      나이를 출력하는 부분
       System.out.println("20살");
//	    서식문자 
	   
//	   %d 10진수 정수 
//	   %o 8진수 정수
//	   %h 16진수 정수
//	   %f 실수
//	   %c 문자
//	   %s 문자열
//	   반드시 따옴표 안에서 작성한다.
//	   이름은 문자열이므로 String 타입으로 선언
	   String name= "한동석";
//     나이는 정수이므로 int타입으로 선언 
	   int age = 20;
//     선언한 이름과 나이를 서식문자를 응용해 출력한다 
	   System.out.printf("이름:%s\n",name);
	   System.out.printf("나이:%d\n",age);
	   System.out.printf("이름:%s\n나이:%d",name,age);
	   System.out.println();

	//	   과제 예제 내가가진카드 트럼프카드 하트 6을 출력하라
       String suit = "heart";
       int cardNumber =6;
       System.out.println("내가 가진 카드에 문양은 "+suit+" 이고 숫자는 "+cardNumber);
      
      
   }
}






