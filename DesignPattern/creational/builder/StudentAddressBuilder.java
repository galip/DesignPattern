package builder;

public class StudentAddressBuilder  extends StudentBuilder {
	
	public StudentAddressBuilder(Student student) {
		this.student = student;
	}
	
	public StudentAddressBuilder in(String city) {
		student.city = city;
		return this;
	}
	
	public StudentAddressBuilder at(String address) {
		student.address = address;
		return this;
	}
	
	public StudentAddressBuilder postCode(String postCode) {
		student.postCode = postCode;
		return this;
	}
	
}
