package controlStatemnetTest;

import java.util.Scanner;

public class IfTask {
public static void main(String[] args) {
//  심리 테스트
//  
//  Q. 당신이 좋아하는 색을 선택하세요.
//  1. 빨간색
//  2. 노란색
//  3. 검은색
//  4. 흰색
//  
//  빨간색 : 불같고 열정적이고 적극적이다.
//  노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//  검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//  흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
//	스캐너실행
	Scanner scanner = new Scanner(System.in);
//	결과멘트 변수선언
	String reslut="";
//	입력받기전 문자열선언
	String numberMessge="좋아하는 색을 고르시오";
//	입력받을 정수선언 
	int number=0;
//	문자열출력
	System.out.println(numberMessge);
//	변수에 스캐너실행
		number=scanner.nextInt();
//		if반복문사용하여 각값의 문자열을 선언후 출력 
	if (number<2) {
		reslut="불같고 열정적이고 적극적이다";
		}
	else if(number<3){
		reslut="발랄하고 밝고 귀엽고 개성있고 착하다";		
	}
	else if(number<4) {
		reslut="묵묵하고 든든하고 냉철하고 멋지다";
	}
	else{
		reslut="천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
	}
	
	System.out.println(reslut);
	
	

	}

}
