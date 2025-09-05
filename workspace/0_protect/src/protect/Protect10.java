package protect;

import java.lang.module.ResolutionException;

//출력 예시:
//켜짐: 모니터 - 해상도: 4K
//꺼짐: 프린터 - 잉크상태: 부족
//켜짐: 스캐너 - 스캔해상도: 1200dpi
//	알고리즘
//  1.부모 클래스생성

class Device1{
	public Device1() {
	}
//	2.생성자 만들기?
	String name;
	Boolean power;
	public Device1(String name, Boolean power) {
		super();
		this.name = name;
		this.power = power;
	}
//	3.전원 ~ 이름 메소드만들기
	void status() {
		System.out.print(power ? "켜짐:":"꺼짐:");
		System.out.print(name+"-");
	}
	void finalStatus(Device1 dev) {
		status();
		if (dev instanceof Monitor) {
//		자식에있는 변수를 부모껄로 형변환 ? 다운캐스팅?
			Monitor m = (Monitor) dev ;
			System.out.println("해상도:"+m.resolution);
		}
		else if (dev instanceof Printer) {
			Printer p = (Printer) dev;
			System.out.print("잉크상태:");
			if (p.ink==0) {
				System.out.println(" 부족");
			}
			else System.out.println(p.ink+"ml있습니다");
		}
		else if (dev instanceof Scanner) {
			Scanner s = (Scanner) dev;
			System.out.println("스캔해상도: "+ s.scanResolution);
		}
		
	}
}
//	4.자식 클래스 생성+ 생성자 만들기

//	5.자식 클래스에 생성된걸 포함한 메소드 만들기
class Monitor extends Device1{
	public Monitor() {
	}
	String resolution;
	public Monitor(String name, Boolean power, String resolution) {
		super(name, power);
		this.resolution = resolution;
	}
	
	
}

class Printer extends Device1{
	public Printer() {
	}
	
	int ink;
	public Printer(String name, Boolean power, int inkml) {
		super(name, power);
		this.ink = inkml;
	}
	
	
	
}
class Scanner extends Device1{
	public Scanner() {
	}
	String scanResolution;
	public Scanner(String name, Boolean power, String scanResolution) {
		super(name, power);
		this.scanResolution = scanResolution;
	}
	
	
}
public class Protect10 {

	public static void main(String[] args) {
//		이게업캐스팅 ?
		Device1 mm = new Monitor("모니터", true, "4K");
		Device1 pp = new Printer("프린터", false, 0);
		Device1 ss = new Scanner("스캐너", true, "1200dpi");
		mm.finalStatus(mm);
		pp.finalStatus(pp);
		ss.finalStatus(ss);
//		왜 맨밑에 얘네는 이름이이런가 ?
	}

}
