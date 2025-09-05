package protect;
//출력 예시:
//켜짐: 전등 - 밝기: 75
//꺼짐: 온도조절기 - 온도: 22.5
//켜짐: 전등 - 밝기: 100

//요구사항
//1. 기기(Device)라는 인터페이스를 만든다.  
// 켜기(turnOn), 끄기(turnOff), 상태출력(status) 메서드를 가진다.

//2. 전등(Light) 클래스는 Device를 구현하고,
// 밝기(brightness, 0~100)를 상태로 가진다.

//3. 온도조절기(Thermostat) 클래스는 Device를 구현하고,
// 온도(temperature)를 상태로 가진다.

//4. 메인에서 전등과 온도조절기를 만들고,
// 상태를 출력한다.
// 일부 기기는 켜고, 일부는 끈 상태로 출력한다.

//조건:  
//- turnOn 호출하면 상태는 '켜짐', turnOff면 '꺼짐'.
//- status() 출력 형식은 위 출력 예시를 따른다.

class Device{
	public Device() {
		// TODO Auto-generated constructor stub
	}
	boolean power;
	String name;
	String performance;
	
	


	public Device(boolean power, String name, String performance) {
		super();
		this.power = power;
		this.name = name;
		this.performance = performance;
	}
	void trunOn() {
		if (!power) System.out.println("켜짐:");
	}
	void trunOff() {
		if (power) System.out.println("꺼짐:");
	}
	void status() {
		if (power) System.out.println("기계가 켜져있습니다.");
		else System.out.println("기계가 꺼져있습니다");
	}
	void statusOutPut() {
		if (power)
		System.out.print("켜짐: "+name+"-"+performance+":");
		if (!power)
			System.out.print("꺼짐: "+name+"-"+performance+":");
		
	}
	
}

class Light extends Device{
	public Light() {
		// TODO Auto-generated constructor stub
	}
	
	int brightness;

	public Light(boolean power, String name, String performance, int brightness) {
		super(power, "전등", "밝기");
		this.brightness = brightness;
	}
	@Override
	void statusOutPut() {
		// TODO Auto-generated method stub
		super.statusOutPut();
		System.out.println(brightness);
	}




	
	
}
class Thermostat extends Device{
	public Thermostat() {
		// TODO Auto-generated constructor stub
	}
	double temperature;
	public Thermostat(boolean power, String name, String performance, double temperature) {
		super(power, "온도조절기", "온도");
		this.temperature = temperature;
		
	}
	@Override
	void statusOutPut() {
		// TODO Auto-generated method stub
		super.statusOutPut();
		System.out.println(temperature);
	}


	
	

	
}

public class Protect09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device device1 = new Light(true, null, null, 75);
		Device device2 = new Thermostat(false, null, null,22.5);
		Device device3 = new Light(true, null, null, 100);
		
		device1.statusOutPut();
		device2.statusOutPut();
		device3.statusOutPut();

	}

}
