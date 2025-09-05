package student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//🎯 목표
//학생들의 이름과 점수를 저장한 후, 다음 작업을 수행하세요:
//
//학생 전체 명단과 점수 출력
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

public class StudentService {

	private List<Student> students = new ArrayList<>();
//	Student s = new Student();

	void addStudent(String name, int score) {
		if (score > 100) {
			System.out.println("학생점수는 100점을 초과할수 없습니다.");
		} else {
			students.add(new Student(name, score));
		}

	}

	public List<Student> getStudents() {
		return students;
	}

	// 60점 이상인 학생만 추출해 출력 (합격자)

	Stream<Student> findPassStudent() {
//		students.stream().filter(s -> s.getScore() >= 60)
//				.forEach(s -> System.out.println(s.getName() + " 학생 합격 (점수: " + s.getScore() + ")"));
		return students.stream().filter(s -> s.getScore() >= 60).collect(Collectors.toList()).stream();
	}

	// 합격자의 이름을 대문자로 바꾸고 출력

//	void upperCasePassStudent() {
//		students.stream().filter(s -> s.getScore() >= 60)
//				.forEach(s -> System.out.println(s.getName().toUpperCase() + " 학생 합격 (점수: " + s.getScore() + ")"));
//	}
	
	void upperCasePassStudent() {
		findPassStudent().map((s) -> s.getName().toUpperCase()).forEach((name) -> System.out.println(name + " 학생 합격"));
	}
	
	//모든 학생의 점수에 +5점을 더한 후 출력 (보정 점수)
	

	
	void bonusScore1() {
		for (Student s : students) {
			if (s.getScore()<94) {
		s.setScore(s.getScore()+5);
		System.out.println(s.getName()+"의 보정점수는 "+s.getScore());
		s.setScore(s.getScore()-5);
			}
			else {
				System.out.println(s.getName()+"님의 점수는 보정이 불가능한 점수입니다!");
		}
	}
	
	
}
	
}
