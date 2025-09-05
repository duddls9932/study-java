package classTest;

public class Company {
	int id;
	String name;
	Department[] arDepartment;

	int total;
	double average;
	
	public Company(int id, String name, Department[] arDepartment) {
		this.id = id;
		this.name = name;
		this.arDepartment = arDepartment;
		for (int i = 0; i < arDepartment.length; i++) {
			total += arDepartment[i].income;
		}
		this.average = (double)total / arDepartment.length;
	}
	
	
}
