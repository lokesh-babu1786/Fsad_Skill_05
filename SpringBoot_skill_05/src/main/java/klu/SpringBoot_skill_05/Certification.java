package klu.SpringBoot_skill_05;

import org.springframework.stereotype.Component;

@Component
public class Certification {

	private int id = 32702;
	private String name = "FSAD";
	private int marks = 30;

	public void displayCertification() {

		System.out.println("Certification ID: " + id);
		System.out.println("Certification Name: " + name);
		System.out.println("Marks: " + marks);
	}
}