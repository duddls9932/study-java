package methodTest;

import java.util.Iterator;
import java.util.Scanner;

public class MethodTask {
//   1 ~ 10까지 println()으로 출력하는 메소드
   void printFrom1To10(){
//      10번반복하는 반복문 선언하여 1~10 까지 출력 
      for (int i = 0; i < 10; i++) {
         System.out.println(i + 1);
      }
   }
   
//   "홍길동"을 n번 println()으로 출력하는 메소드
   void printHong(int n){
//      매체변수값만큼 반복하는 선언문 으로 홍길동을 n번출력
      for (int i = 0; i < n; i++) {
         System.out.println("홍길동");
      }
   }
   
//   이름을 n번 println()으로 출력하는 메소드
   void printName(String name, int n){
//      이름,횟수를 매체변수로 선언하여 n 번반복하여 입력한 name 을 출력
      for (int i = 0; i < n; i++) {
         System.out.println(name);
      }
   }
   
//   세 정수의 뺄셈 메소드
//   매체변수 3개를 선언하여 1-2-3을 리턴한다 
   int subtract(int number1, int number2, int number3){
      return number1 - number2 - number3;
   }
//   배열을사용하여 뺄셈해보기
//   매체변수의갯수를 모를때 배열 선언
   int subtract(int[] arNumber){
//      결과에담을 변수선언
      int result = 0;
//    첫번째배열에들어갈값에 -1을곱한다 왜냐하면 result가0으로시작하기때문에 
      arNumber[0] *= -1;
//      0에서 [0]을 양수로바꾼후 그뒤에껄 계속빼는 반복문 선언 후 result를 출력
      for (int i = 0; i < arNumber.length; i++) {
         result -= arNumber[i];
      }
      return result;
   }
   
//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//   return 값은 반드시 1개만 가능하다.
//   두정수의 나눗셈을 하기위하여 두개의 매체변수 선언
   int[] divide(int number1, int number2){
//      배열에담기
      int[] arResult = new int[2];
//      나누는값이 0이아닐경우 0에는몫 1에는 나머지가 들어간다 
      if(number2 != 0) {
         arResult[0] = number1 / number2;
         arResult[1] = number1 % number2;
         return arResult;
      }
//      나누는값이 0일경우엔 null을 출력
      return null;
   }
   
//   1 ~ n까지의 합을 구해주는 메소드
//   n을입력받을 매체변수 선언
   int getTotal(int n){
//      변수선언
      int result = 0;
//      n번만큼 반복되는 반복문선언 i는 1부터시작
      for (int i = 0; i < n; i++) {
         result += i + 1;
      }
      return result;
   }
   
//   문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//   입력받을 문자열 선언
   String changeABC(String content){
//      결과값 선언 
      String result = "";
//      문자열길이만큼 반복하는 반복문선언 
      for (int i = 0; i < content.length(); i++) {
//         문자열의 첫글자의 위치부터 아스키코드로 비교하여 대문자면 소문자로 소문자면 대문자로 그외특수기호들은 그대로출력
         char c = content.charAt(i);
         
         if(c >= 97 && c <= 122) {
            result += (char)(c - 32);
            
         }else if(c >= 65 && c <= 90) {
            result += (char)(c + 32);
            
         }else {
            result += c;
         }
      }
      
      return result;
   }
   
//   한글을 정수로 바꿔주는 메소드
//   일공이사 -> 1024
//   입력받을 문자열선언
   int changeToInteger(String data){
//      출력에쓸 문자열선언 
      String hangeul = "공일이삼사오육칠팔구";
      String temp = "";
//      문자열의 길이만큼 반복하는 반복문 선언후 data의i번째문자가 한글에서 몇번째인지 찾은후 temp랑연결하여 출력
      for (int i = 0; i < data.length(); i++) {
         temp += hangeul.indexOf(data.charAt(i));
      }
      
      return Integer.parseInt(temp);
   }
   
//   정수를 한글로 바꿔주는 메소드
//   1024 -> 일공이사
//   입력받을 변수선언
   String changeToHangeul(int number){
//      출력에쓸 문자열선언
      String hangeul = "공일이삼사오육칠팔구";
      String result = "";
//      넘버를 10으로나누어 자릿수에맞게 hangeul 에서 각자릿수별로 넣을 문자를 넣고 number가 0이될때까지 10으로 나누어 반복
      while(number != 0) {
         result = hangeul.charAt(number % 10) + result;
         number /= 10;
      }
      
      return result;
   }
   
//   문자열과 문자를 입력받고 해당 문자가 몇 개 있는지 구하기
//   입력 예) banana, a
//   출력 예) 3
//   입력받을 문자열과 문자를 선언
   int getCount(String content, char c){
//      숫자가같을때마다 증가하는 변수선언
      int count = 0;
//      글자수 만큼 반복하는데 content 문자열에서 각 문자를 빼서 c와비교해 같을때마다 count가 증가하는 반복문 선언 
      for (int i = 0; i < content.length(); i++) {
         if(content.charAt(i) == c) {
            count ++;
         }
      }
      return count;
   }
   
//   1~100을 입력받고 짝수만 리턴하는 메소드
//   넘어려워서 집에서 해보기 
   int[] getEven(int[] arData){
      int[] arEven = new int[50];
      for (int i = 0; i < arEven.length; i++) {
         arEven[i] = arData[i * 2 + 1];
      }
      return arEven;
   }
   
//   숙제
//   문제 5개 만들어서 풀어오기
   
//   숙제 1  
//   짝수인지 홀수인지 판별하는 메소드

//   입력: 정수 하나

//   출력: "짝수" 또는 "홀수" 문자열 반환
      String ouput(int input){
            String result="";
            if(input==0) {
               result="0입니다.";
            }
            else if(input%2==1) {
               result="홀수입니다.";
            }
            else {
               result="짝수입니다";
            }
            return result;
               
            
         }
     
   
//   숙제2
//   배열에서 최대값 찾는 메소드

//   입력: 정수 배열

//   출력: 배열 안에서 가장 큰 값 반환
//   배열값은 입력받아야하고 배열크기도모름 
//      null 을사용하려했으나 문법상 맞지않음 int
      int max(int[] input1){
         int result1=0;
         for (int i = 0; i < input1.length; i++) {
            if(input1[i]>result1) {
               result1=input1[i];
               }         
      }
      return result1;
      }
      
   
//   숙제 3
//   4번. 자리수 합 구하기
//   설명: 정수의 각 자리수를 더한 값을 출력하는 메소드 만들기
      int bout(int num) {
         int result2=0;
         while (num!=0) {
            result2 += num%10;
                num /= 10;
         }
      return result2;
            
      }
   
//   숙제 4
//   
//   ✅ 8번. 문자열에서 대문자만 출력
//   설명: 문자열 중 대문자만 골라서 출력하는 메소드 만들기
  String    str(String messge){
     String result3 = "";
     for (int i = 0; i <messge.length(); i++) {
        char c=messge.charAt(i);
        if (c >= 65 && c <= 90) 
           result3+=c;
      
   }
        return result3;
     }
      

//   숙제5  
//   11번. 문자열 거꾸로 출력
//   설명: 입력된 문자열을 반대로 출력하는 메소드 만들기
//  0에 length 가들어가야하고 1에 length-1이들어가야함 
  String   rts(String messgea){
           String result4="";
           for (int i = messgea.length()-1;i>=0; i--) {
              result4 += messgea.charAt(i);
            
         }
           return result4;
        }
  
//  5개의 정수를 입력받고 최대값과 최소값을 구하는 메소드 

 void getMaxAndMin2(int[] arData, int[] result){
      
      for (int i = 0; i < result.length; i++) {
         result[i] = arData[0];
      }
      
      for (int i = 1; i < arData.length; i++) {
         if(result[0] < arData[i]) {
            result[0] = arData[i];
         }if(result[1] > arData[i]) {
             result[1] = arData[i];
          }
       }
    }
    
  


   public static void main(String[] args) {
//      메소드를 선언했다면, 반드시 사용해서 테스트한다.
      
      Scanner scanner = new Scanner(System.in);
//      숙제 1.
      MethodTask methodTask = new MethodTask();
      
//      System.out.println(methodTask.ouput(0));
//      숙제 2.
//      int [] abc= {1,2,4,6,7};
//      System.out.println(methodTask.max(abc)); //왜입력받질 못할까 ?
//         int numberCount=0;
//         System.out.println("입력받을 정수의 갯수를 입력하세요");
//         numberCount=scanner.nextInt();
//         int[] nuData=new int[numberCount];
//         System.out.println("정수를 입력하세요");
//         for (int i = 0; i < nuData.length; i++) {
//         nuData[i]=scanner.nextInt();
//      }
//         methodTask.max(nuData);
//         System.out.println(methodTask.max(nuData));
//      
//       숙제 3.
//      System.out.println(methodTask.bout(3294));
      
//      숙제 4. 
//      System.out.println(methodTask.str("ERroR"));
//      숙제 5.
         System.out.println(methodTask.rts("adfqert"));
      
      
//      methodTask.printFrom1To10();
//      methodTask.printHong(10);
      
//      String message = "이름: ";
//      System.out.print(message);
//      methodTask.printName(scanner.next(), 5);
      
//      int[] arNumber = {3, 4, 1};
//      int result = methodTask.subtract(arNumber);
//      System.out.println(result);
      
//      int[] arResult = methodTask.divide(10, 3);
//      
//      if(arResult == null) {
//         System.out.println("0으로 나눌 수 없습니다.");
//      }else {
//         System.out.println("몫: " + arResult[0]);
//         System.out.println("나머지: " + arResult[1]);
//      }
      
//      int result = methodTask.getTotal(10);
//      System.out.println(result);
      
//      String result = methodTask.changeABC("aBcDefff!@#!@#123");
//      System.out.println(result);
      
//      int result = methodTask.changeToInteger("공공공공공공공일");
//      System.out.println(result);
      
//      String data = methodTask.changeToHangeul(48125750);
//      System.out.println(data);
      
//      int count = methodTask.getCount("banana", 'z');
//      System.out.println(count);
      
//      int[] arData = new int[100];
//      int[] arEven = null;
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }
//      
//      arEven = methodTask.getEven(arData);
//      
//      for (int i = 0; i < arEven.length; i++) {
//         System.out.println(arEven[i]);
//      }
      
   }
}
















