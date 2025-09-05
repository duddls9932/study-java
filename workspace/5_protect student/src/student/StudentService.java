package student;
//해야 할 기능(메소드) 목록

//1.학생 등록 (학생 객체 생성 후 내부 리스트에 추가)
//2.학생 이름으로 점수 수정
//3.전체 학생 평균 점수 계산
//4.학생 이름으로 점수 조회
//5.전체 학생 목록 화면에 출력
//6.특정 점수 이상인 학생 목록 반환
//7.학생 수 화면에 출력
//8.가장 높은 점수를 가진 학생 반환
//9.가장 낮은 점수를 가진 학생 반환
//10.점수가 특정 값인 학생 수 반환

import java.util.ArrayList;

public class StudentService {
	ArrayList<Student> students = new ArrayList<Student>();

	// 1.학생 등록 (학생 객체 생성 후 내부 리스트에 추가)
	public Student addStudent(String name, int score) {
		if (score < 0) {
			System.out.println("점수 등록 오류");
			return null;
		}
		Student student = new Student(name, score);
		students.add(student);
		return student;
	}

	// 2.학생 이름으로 점수 수정
	public Student fixScore(String name, int fixscore) {
		if (students.isEmpty()) {
			System.out.println("등록된 학생이없습니다");
			return null;
		}
		for (Student s : students) {
			if (name.equals(s.getName())) {
				s.setScore(fixscore);
				return s;
			}
		}
		System.out.println("해당 이름의 학생이 없습니다");
		return null;

	}

	// 3.전체 학생 평균 점수 계산
	void getAverageScore() {
		int total = 0;
		for (Student s : students) {
			total += s.getScore();
		}
		double averageScore = (double) total / students.size();
		System.out.println(averageScore);
	}

	// 4.학생 이름으로 점수 조회
	public int findScore(String name) {
		if (students.isEmpty()) {
			System.out.println("등록된 학생이없습니다");
			return -1;
		}
		for (Student s : students) {
			if (name.equals(s.getName())) {
				return s.getScore();
			}

		}
		System.out.println("등록된 학생이없습니다");
		return -1;

	}

	// 5.전체 학생 목록 화면에 출력
	void seeAllStudent() {
		System.out.println(students);
	}

	// 6.특정 점수 이상인 학생 목록 반환
	public ArrayList<Student> overScore(int cutScore) {
		ArrayList<Student> over = new ArrayList<Student>();
		if (students.isEmpty()) {
			System.out.println("등록된 학생이없습니다");
		}
		for (Student s : students) {
			if (s.getScore() >= cutScore) {
				over.add(s);
			}
		}
		return over;
	}

	// 7.학생 수 화면에 출력
	void countStudent() {
		int count = 0;
		for (Student s : students) {
			count++;
		}
		System.out.println("현재 학생 수:" + count);
	}

	// 8.가장 높은 점수를 가진 학생 반환
	public Student findBestStudent() {
		if (students.isEmpty())
			return null;
		Student bestStudent = students.get(0);
		for (Student s : students) {
			if (s.getScore() > bestStudent.getScore()) {
				bestStudent = s;
			}
		}
		return bestStudent;
	}
	//9.가장 낮은 점수를 가진 학생 반환
	public Student findWorstStudent() {
		if (students.isEmpty())
			return null;
		Student worstStudent = students.get(0);
		for (Student s : students) {
			if (s.getScore() < worstStudent.getScore()) {
				worstStudent = s;
			}
		}
		return worstStudent;
	}
	//10.점수가 특정 값인 학생 수 반환
	public int findTargetScore(int targetScore) {
		int count=0;
		if (students.isEmpty())
			return -1;
		for (Student s : students) {
			if(targetScore==s.getScore()) {
				count++;
			}
			
		}
		return count;
		
	}
}
