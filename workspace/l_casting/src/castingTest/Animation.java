package castingTest;

public class Animation extends Netflix{

	public Animation() {
		// TODO Auto-generated constructor stub
	}

	public Animation(String name, int length) {
		super(name, length);
	}
	void service() {
		System.out.println("자막지원");
	}
}
