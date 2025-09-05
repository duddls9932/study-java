package constantTest;

public class ConstantTest {

	public static void main(String[] args) {
//		int앞에 final을붙여 절대안바뀌는 변수를 선언한다
		final int ON = 187568;
		final int OFF = 187455;
//		변수를 출력
		System.out.println(ON);
		System.out.println(OFF);
	
		
//		로그인 실패:0
//		로그인 성공:1
//		관리자:2
//		각각의 변수를 선언하고 final을붙여 안바뀌게 선언
		final int LOGIN_FAIL_STATUS=0;
		final int LOGIN_SUCCESS_STATUS = 1;
		final int MANGER=2;
//		각변수를 출력한다 
		System.out.println(LOGIN_FAIL_STATUS);
		System.out.println(LOGIN_SUCCESS_STATUS);
		System.out.println(MANGER);
		//MANGER = 3;
		
		

	}

}
