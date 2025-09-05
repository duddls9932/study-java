package student1;
//🎯 목표

import java.util.ArrayList;
import java.util.stream.Collectors;



//여러 타입의 학생(예: 일반학생 / 장학생)을 관리하는 시스템을 만든다.
//
//각 학생은 자신만의 점수 계산 방식을 가진다.
//
//학생의 평균, 우수학생 목록, 전체 학생 점수 출력 등을 구현한다.
//
//인터페이스와 상속을 활용해 다형성 있는 구조로 설계한다.
//
//📦 구성 클래스 및 인터페이스
//✅ ScoreCalculable (인터페이스)
//int calculateScore();
//→ 학생 클래스가 점수를 계산할 수 있게 함.
//
//✅ Student (추상 클래스 또는 클래스)
//String name, List<Integer> scores
//생성자: Student(String name, List<Integer> scores)
//메서드: getName(), getScores(), toString() 등
//✅ RegularStudent implements ScoreCalculable
//기본 점수 계산: 평균 점수 반환
//✅ ScholarshipStudent implements ScoreCalculable
//보너스 점수 포함 계산 (예: 평균 + 10점)
//✅ StudentService
//List<ScoreCalculable> students 저장
//
//기능:
//
//전체 학생 출력
//
//90점 이상 학생 필터링 후 이름 대문자로 출력
//
//평균 계산
//
//학생 종류별 통계
//
//🛠 구현 포인트
//map, filter, forEach 모두 사용
//
//instanceof 또는 클래스 분리로 다형성 활용
//
//보정 점수도 stream 기반으로 출력
//
//필요하면 테스트용 Page.java도 만들고
//"장학생: 이름, 점수 3개", "일반학생: 이름, 점수 3개" 정도 입력해서 돌려보면 돼.

public class StudentService {
	ArrayList<Student> students = new ArrayList<Student>();
	
	void addStudent(String name,int score,boolean  goodStudent) {
		if (score > 100) {
			System.out.println("학생점수는 100점을 초과할수 없습니다.");
		} else {
			students.add(new Student(name, score,goodStudent));
		}
		
	}
	
	void goodStudentAddScore(){
		for(Student s : students) {
			if(s.isGoodStudent()) {
				s.setScore(s.getScore()+10);
			}
		}
		
	}
	//90점 이상 학생 필터링 후 이름 대문자로 출력
	void findPassingScore() {
		students.stream().filter(s->s.getScore()>=90).map(s -> s.getName().toUpperCase()).forEach(s -> System.out.println(s));
			}
	//평균 계산
	void FindAverageScore() {
		int reslut=0;
		for(Student s : students) {
			reslut+=s.getScore();
		}
		System.out.println(reslut/students.size());
	}
	
	//학생 종류별 통계
	void studentStatistics() {
		int goodStAddScore = 0;
		int goodStCount=0;
		int goodStudentAv=0;
		int normalStAddScore=0;
		int normalStCount=0;
		int normalStudentAv=0;
		for(Student s : students) {
		if(s.isGoodStudent()) {
			goodStAddScore+=s.getScore();
			goodStCount++;
		}
		else {
			normalStAddScore+=s.getScore();
			normalStCount++;	
		}
		}
		goodStudentAv=goodStAddScore/goodStCount;
		normalStudentAv=normalStAddScore/normalStCount;
		System.out.println("장학생은 "+goodStCount+"명 평균점수는"+goodStudentAv);
		System.out.println("일반학생은 "+normalStCount+"명 평균점수는"+normalStudentAv);
	}


}
