package castingTest;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스

// 사용자가 선택한 영상이
// 1. 애니메이션이라면, "자막 지원" 기능 사용
// 2. 영화라면, "4D" 기능 사용
// 3. 드라마라면, "굿즈" 기능 사용

// 위의 기능들은 각 클래스에 메소드로 선언하여 해당 문자열을 출력하라는 뜻이다.
class Netflix{
	public Netflix() {
		// TODO Auto-generated constructor stub
	}
	String name;
	int length;
	public Netflix(String name, int length) {
		super();
		this.name = name;
		this.length = length;
	}
	
	
	
	
}
public class CastingTask {
	
//	아래의 getService 메소드 1개로
//	영상 1개를 전달받아서
//	애니메이션인지, 영화인지, 드라마인지 검사한 뒤
//	그 고유 기능을 사용할 수 있게 구현한다.
//	반드시, up casting과 down casting을 활용한다.
	public void getService(Netflix nex) {
		if (nex instanceof Animation) {
//			다운캐스팅
		Animation ani = (Animation) nex;
		ani.service();
	}
		else if(nex instanceof Drama) {
		Drama dra = (Drama) nex;
		dra.service();
			
		}
		else if(nex instanceof Film) {
			Film fil = (Film)nex;
			fil.service();
		}
	}
		

	public static void main(String[] args) {
		Netflix a = new Animation("원피스", 25);
		Netflix b = new Film("극한직업", 150);
		Netflix c = new Drama("재벌집 막내아들", 50);
		CastingTask task = new CastingTask();
		task.getService(a);
		task.getService(b);
		task.getService(c);
	
		
	}
}
