package variableTest;

public class VariableTest {
	public static void main(String[] args) {
//		정수형, 변수명은 a, 값은 10, 단, 기본형으로 선언한다
//		실수형, 변수명은 b, 값은 10.1563, 단, float으로 선언한다
//		실수형, 변수명은 c, 값은 10.1563, 단, double로 선언한다
//		문자형, 변수명은 d, 값은 A, 단, 기본형으로 선언한다
//		문자열, 변수명은 e, 값은 ABC, 단, 기본형으로 선언한다
//      a의값은 정수이므로 int 타입으로 선언
		int age= 10;
//      b의값은 실수인데 flaot형으로 선언해야하니 값에 F를붙여 선언
		float floatNumber=10.1563F;
//		c의값은 실수이므로 double 타입으로 선언 
		double doubleNumber=10.1563;
//		d의값은 문자이므로 char로 선언
		char d ='A';
//		e의값은 문자열이므로 String을사용하여 선언한다 
		String data ="ABC";
//		앞에 자료형이거나 대입연산자가있어서 선언 
//		선언한 변수들을 출력한다 
		System.out.println(age);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(d);
		System.out.println(data);
		
		
		
//		과제 예제
//		정수형, 변수명은 price, 값은 5800, 단, 기본형으로 선언한다
//		실수형, 변수명은 length, 값은 10.1563, 단, float으로 선언한다
//		실수형, 변수명은 weight, 값은 10.1563, 단, double로 선언한다
//		문자형, 변수명은 grade, 값은 S, 단, 기본형으로 선언한다
//		문자열, 변수명은 name, 값은 조영인, 단, 기본형으로 선언한다
		int price = 5800;
		float length= 10.1563F;
		double weight=10.1563;
		char grade = 'S';
		String name="조영인";
		
		System.out.println(price);
		System.out.println(length);
		System.out.println(weight);
		System.out.println(grade);
		System.out.println(name);
		
		
		
		
		
	}

}
