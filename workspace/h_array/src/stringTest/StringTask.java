







package stringTest;

import java.util.Scanner;

public class StringTask {
   public static void main(String[] args) {
//      사용자에게 입력받은 문자열 중
//      소문자는 모두 대문자로, 대문자는 모두 소문자로 변경한다.
//      소문자 범위: 97 ~ 122
//      대문자 범위: 65 ~ 90
//	    입력받기전 출력할 문자열 선언
      String message = "문자열: ";
      String data = null, result = "";
//      스캐너 실행
      Scanner scanner = new Scanner(System.in);
//      메세지 출력
      System.out.print(message);
//      data 라는 문자열 입력받기 
      data = scanner.nextLine();
//      data의 길이만큼 반복하는 반복문선언 data의 각 배열??을 c에담아서 아스키코드 이용하여 대문자는 소문자로 소문자는 대문자로 변경
      for (int i = 0; i < data.length(); i++) {
         char c = data.charAt(i);
         
         if(c >= 97 && c <= 122) {
//            소문자일 때
            result += (char)(c - 32);
//            
         }else if(c >= 65 && c <= 90) {
//           대문자일 때
            result += (char)(c + 32);
//            
         }else {
//            알파벳이 아닐 때
            result += c;
         }
      }
//      
      System.out.println(result);
      
//      사용자에게 입력받은 문자열 중
//      소문자의 총 개수를 출력한다.
//      입력받기전 출력할 문자열 선언
      String message1 = "문자열: ";
//      입력받을 문자열 선언
      String data1 = null;
      Scanner scanner1 = new Scanner(System.in);
//      문자열 선언후 스캐너로 입력받기 
      System.out.print(message1);
      data1 = scanner1.nextLine();
//      셀 변수 선언 
      int count = 0;
//      입력받을 문자열 길이만큼 반복하고 각 문자별로 문자빼서 c에넣고 아스키코드 97~122사이일때마다  카운트가 1개씩 증가 
      for (int i = 0; i < data.length(); i++) {
//         
         char c = data1.charAt(i);
//         
         if(c >= 97 && c <= 122) {
//            소문자일 때
//            count += 1;
            count++;
         }
      }
//      
      System.out.println(count);
      
//      아래의 주소에서 "/samsung"만 분리하여 출력한다.
//      www.naver.com/baseball/samsung
//      주소를 변수에선언 
      String url = "www.naver.com/baseball/samsung";
//      url의 마지막/이쓰인곳의 위치를찾고 그뒤로 출력하기 
      int fromIndex = url.lastIndexOf("/");
      System.out.println(url.substring(fromIndex));
      
//      아래의 주소들을 배열에 담고, 마지막 경로가 samsung인 것만 출력한다.
//      www.naver.com/baseball/samsung
//      www.naver.com/baseball/lg
//      www.naver.com/baseball/lotte
//      www.naver.com/baseball/kt
//      www.naver.com/phone/samsung
	   
//     당신은 3칸 방이 있는 건물주이다.
//     각 방에는 세입자가 살고있다.
//     방마다 월세를 받아서 총 월세와 평균 월세를 구해주는 프로그램을 만들고자 한다.
//	   Scanner scanner = new Scanner(System.in);
//	   방이 3개니 3칸으로 나뉜 배열선언
	   int arData[]=new int[3];
//	   입력받기 이전 출력할 메세지 선언
	   String payMessge="월세를 입력하세요:";
//	   메세지 출력
	   System.out.println(payMessge);
//	   월세의 합 변수선언
	   int payAgreement=0;
//	   
//	   배열수만큼 반복하는 반복문 선언후 페이를 입력받는다 각 배열에 각각의 페이를 넣고 페이의합 또한 반복문으로 계산
	   for (int i = 0; i < arData.length; i++) {
		   int pay=scanner.nextInt();
		   arData[i]=pay;
		   payAgreement += pay;
		   System.out.println(pay);	   
	}
//	   월세의 합과 평균을 출력한다 .
	   double payAverage= (double)payAgreement/3;
	   System.out.println("월세의 합은 : "+ payAgreement);
	   System.out.println("월세의 평균은 : "+ payAverage);
	   
//	   5개의 칸을가진 정수의 배열을 선언
	   int[] arOriginalData = { 9, 1, 9, 2, 9 };
//	   5칸의 칸을가진 참거짓?의 배열을 선언
       boolean[] arCheck = new boolean[5];
//       arData를 선언
       int[] arData1 = null;
//       값과 index를 선언 
       int count1 = 0, index = 0;

//      
//       
       for (int i = 0; i < arOriginalData.length - 1; i++) {
          for (int j = i + 1; j < arOriginalData.length; j++) {
             if (arOriginalData[i] == arOriginalData[j]) {
            	 count1++;
            	 
             arCheck[i] = true;
                break;
             }
          }
       }
//       
       arData = new int[arOriginalData.length - count];
       for (int i = 0; i < arCheck.length; i++) {
          if(!arCheck[i]) {
             arData[index++] = arOriginalData[i];
          }
       }
       
       for (int i = 0; i < arData.length; i++) {
          System.out.println(arData[i]);
       }
	   
	   }
   
}








































