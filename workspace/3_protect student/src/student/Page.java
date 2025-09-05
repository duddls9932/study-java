package student;

//🎯 목표
//학생들의 이름과 점수를 저장한 후, 다음 작업을 수행하세요:
//
//학생 전체 명단과 점수 출

//
//60점 이상인 학생만 추출해 출력 (합격자)
//
//합격자의 이름을 대문자로 바꾸고 출력
//
//모든 학생의 점수에 +5점을 더한 후 출력 (보정 점수)
//
//🔢 요구사항
//Student 클래스는 이름(String)과 점수(int)을 필드로 가집니다.
//
//ArrayList<Student>를 사용해 학생 리스트를 저장하세요.
//
//forEach(), map(), filter()를 각각 최소 1회 이상 활용하세요.
//
//출력은 System.out.println()을 사용하세요.

// 		보통 메소드는 어디다적지??


public class Page {
	
	public static void main(String[] args) {
		StudentService student = new StudentService();
		student.addStudent("minsu", 80);
		student.addStudent("halin", 56);
		student.addStudent("chogag", 100);
		student.addStudent("mujin", 42);
		
		
		System.out.println(student.getStudents());
		
//		//60점 이상인 학생만 추출해 출력 (합격자)
		student.findPassStudent();
		
		//합격자의 이름을 대문자로 바꾸고 출력
		student.upperCasePassStudent();
		
//		//모든 학생의 점수에 +5점을 더한 후 출력 (보정 점수)
		
		
		
		student.bonusScore1();
		
		
		
		
		
		
		
	}

}
