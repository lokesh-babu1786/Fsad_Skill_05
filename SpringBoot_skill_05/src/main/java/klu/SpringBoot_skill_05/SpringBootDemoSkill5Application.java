package klu.SpringBoot_skill_05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootDemoSkill5Application {

	@Autowired
	private Student student;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoSkill5Application.class, args);
	}

	@PostConstruct
	public void run() {
		student.displayStudent();
	}
}