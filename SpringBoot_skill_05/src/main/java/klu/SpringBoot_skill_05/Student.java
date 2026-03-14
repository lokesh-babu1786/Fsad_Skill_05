package klu.SpringBoot_skill_05;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id = 32702;
	private String name = "Lokesh";
	private String gender = "Male";

	@Autowired
	private Certification certification;

	public void displayStudent() {

		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("----- Certification Details -----");

		certification.displayCertification();
	}
}