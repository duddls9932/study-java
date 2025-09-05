package protect;

//	요구사항:
//
//		학생은 이름, 나이, 학번(studentId)을 가진다.
//
//		자기소개 메서드 introduce()를 만든다.

class Student {
	String name;
	int ige;
	int studentId;

	public Student(String name, int ige, int studentId) {

		this.name = name;
		this.ige = ige;
		this.studentId = studentId;
	}

	String introduce() {
		String introduceMessge = "안녕 내이름은" + name + "나이는" + ige + "그리고" + studentId + "학번이야";

		return introduceMessge;
	}

}

public class Protect {

	public static void main(String[] args) {

		Student minsu = new Student("민수", 21, 20);
		Student gagmin= new Student("강민",35, 19);

//		System.out.println(minsu.introduce());
		minsu.introduce();
		gagmin.introduce();
//		질문 모음
		
//		minsu.introduce();만 실행해도 intro..messge가 출력되려면 어캐해야할까 해결완료 
		
		
//		메인에서 출력할때가있고 메소드에서 출력해서 메인올때가있는데 무슨차이일까 ?
	}

}
