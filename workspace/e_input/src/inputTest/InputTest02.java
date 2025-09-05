package inputTest;

import java.util.Scanner;

public class InputTest02 {
   public static void main(String[] args) {
//	   스캐너를선언
      Scanner scanner = new Scanner(System.in);
//     나이를 선언
      int age = 0;
//     입력전에 입력할 메세지들과 선언 입력할때 사용할 문자열을 선언  
      String message = "이름을 입력해주세요.";
      String ageMessage = "나이를 입력해주세요.";
      String name = "";
//      입력전에 나올 메세지 출력
      System.out.println(ageMessage);
//      나이를 입력값을 받게선언
      age = scanner.nextInt();

//      nextLine()은 앞에서의 엔터(\n)를 먹기 때문에
//      기존 입력 알고리즘에 문제가 생길 수 있다.
//      따라서 nextLine()으로 입력받기 전 다른 입력이 실행되었다면,
//      반드시 \n을 먹어줄 nextLine()을 사용해준다.
      scanner.nextLine();
//      입력전에 나올 메세지 출력
      System.out.println(message);
//      이름을 직접입력하게 선언
      name = scanner.nextLine();
//      입력한 이름 출력
      System.out.println(name);
//      입력한 나이를 출력 
      System.out.println(age + "살");
   }
}












