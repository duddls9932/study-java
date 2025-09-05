package protect;

//멍멍!
//이름: 바둑이, 나이: 3, 품종: 말티즈
//
//야옹~
//이름: 나비, 나이: 2, 색상: 회색
//
//멍멍!
//이름: 초코, 나이: 5, 품종: 푸들
//   클래스,상속을활용하여 저렇게 출력되게 작성하기
class Animal {
	public Animal() {

	}

	String name;
	int age;
	String cryingSound;
	public Animal(String name, int age, String cryingSound) {
		super();
		this.name = name;
		this.age = age;
		this.cryingSound = cryingSound;
		
	}
	void cry() {
		System.out.println(cryingSound);
	}
	void introduction() {
		System.out.print("이름:"+name+",나이:"+age);
		
	}
	
	
	

	
	
	
}
class Dog extends Animal{
public Dog() {
	// TODO Auto-generated constructor stub
}
	String breed;
	public Dog(String name, int age, String cryingSound, String breed) {
		super(name, age, cryingSound);
		this.breed = breed;
	}
	@Override
		void introduction() {
			// TODO Auto-generated method stub
			super.introduction();
			System.out.println("품종"+breed);
		}
	
	
		
}
class Cat extends Animal{
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	String color;
	public Cat(String name, int age, String cryingSound, String color) {
		super(name, age, cryingSound);
		this.color = color;
	}
	@Override
	void introduction() {
		// TODO Auto-generated method stub
		super.introduction();
		System.out.println("색상"+color);
	}
	
}
public class Protect08 {
	
	public static void main(String[] args) {
		Animal rion = new Animal("어흥이", 4, "어흥");
		Animal baduk = new Dog("바둑이", 3, "멍멍!", "말티즈");
		Animal choco = new Dog("초코", 5, "멍멍!","푸들" );
		Animal nabi = new Cat("나비", 2, "야옹~", "회색");
		rion.introduction();
		System.out.println();
		baduk.cry();
		baduk.introduction();
		nabi.cry();
		nabi.introduction();
		choco.cry();
		choco.introduction();
		
	}
		
	}





