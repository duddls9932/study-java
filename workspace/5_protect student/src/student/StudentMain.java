package student;

public class StudentMain {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		service.addStudent("현수", 100);
		service.addStudent("민수", 70);
		service.addStudent("영수", 38);
		service.addStudent("유성", 92);
		service.addStudent("영훈", 57);
		System.out.println(service.students);
//		System.out.println(service.fixScore("현수", 90));
//		service.getAverageScore();
//		System.out.println(service.findScore("유성"));
//		service.seeAllStudent();
		System.out.println(service.overScore(70)); 
		service.countStudent();
		System.out.println(service.findBestStudent());
		System.out.println(service.findWorstStudent());
		System.out.println(service.findTargetScore(50));
		
		
	}

}
