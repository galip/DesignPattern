package builder;

public class Student {

	public String city;
	public String postCode;
	public String address;

	public String schoolName;
	public String favouriteLecture;
	public int averageGrade;

	@Override
	public String toString() {
		return "Student [city=" + city + ", postCode=" + postCode + ", address=" + address + ", schoolName="
				+ schoolName + ", favouriteLecture=" + favouriteLecture + ", averageGrade=" + averageGrade + "]";
	}

}
