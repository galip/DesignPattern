package builder;

public class StudentBuilder {
	
	protected Student student = new Student();
	
	public StudentAddressBuilder lives() {
		return new StudentAddressBuilder(student);
	}
	
	public StudentSchoolBuilder studies() {
		return new StudentSchoolBuilder(student);
	}
	
	public Student build() {
		return student;
	}

}
