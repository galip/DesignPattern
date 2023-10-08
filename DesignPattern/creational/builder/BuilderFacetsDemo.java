package builder;

public class BuilderFacetsDemo {
	public static void main(String args[]) {

		StudentBuilder studentBuilder = new StudentBuilder();
		Student student = studentBuilder.lives()
											.in("İstanbul")
											.at("Abcd Street 12")
											.postCode("1905")
										.studies()
											.at("Best school")
											.grade(5)
											.postCode("AA12345")
										.build();

		System.out.println(student);

	}
}
