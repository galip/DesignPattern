package builder;

public class StudentSchoolBuilder  extends StudentBuilder {
	
	public StudentSchoolBuilder(Student student) {
		this.student = student;
	}
	
	public StudentSchoolBuilder at(String schoolName) {
		student.schoolName = schoolName;
		return this;
	}
	
	public StudentSchoolBuilder grade(Integer grade) {
		student.averageGrade = grade;
		return this;
	}
	
	public StudentSchoolBuilder postCode(String favouriteLecture) {
		student.favouriteLecture = favouriteLecture;
		return this;
	}
	
}
