package student;
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

import java.util.Objects;

public class Student {
	public Student() {;}
	private String name;
	private int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && score == other.score;
	}
	
	
	

}
