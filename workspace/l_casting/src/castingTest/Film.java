package castingTest;

public class Film extends Netflix {
public Film() {
	// TODO Auto-generated constructor stub
}

public Film(String name, int length) {
	super(name, length);
}
void service() {
	System.out.println("4D지원");
}
}
