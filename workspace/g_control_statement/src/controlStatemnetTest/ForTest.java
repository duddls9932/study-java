package controlStatemnetTest;

public class ForTest {

	public static void main(String[] args){
//		10번반복하는 반복문 실행해보기 
		for(int i=1;i<11;i+=1) {
			System.out.println("이름은 조영인"+(i+1));
		}
		
//		이름 10번 출력
//		대신 i는 10~1까지 역순으로 출력한다
//		10번 반복하는 반복문실행해보기
		for (int i=10;i>0;i--) {
			System.out.println(i+"1조영인");
		}

	}

}
