package com.springmongo.StudentResult;

import com.springmongo.StudentResult.model.Student;
import com.springmongo.StudentResult.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentResultApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentResultApplication.class, args);
	}

	@Autowired
	private IStudentService studentService;

	@Override
	public void run(String... args) throws Exception {


		/*
		Student student=new Student("Arnav",2,"Doon",95,95,95);
		studentService.addStudent(student);

		Student student2=new Student("Arvind",3,"JNV",92,98,100);
		studentService.addStudent(student2);

		Student student3=new Student("Thakur Rawal Singh",4,"Venus",70,80,90);
		studentService.addStudent(student3);
*/
		System.out.println("All Student List");
		studentService.getAllStudents().forEach(System.out::println);

		System.out.println("Student by Roll Number");
		Student student4=studentService.getByRollNumber(2);
		System.out.println("Student -> "+student4);

		System.out.println("Update Student");
		student4.setMathsMarks(100);
		studentService.updateStudent(student4);


		/*
		System.out.println("Delete Student");
		studentService.deleteStudent(4);
*/
		System.out.println("Search by School");
		studentService.getBySchool("Doon");

		System.out.println("Search by Physics marks");
		studentService.getByPhysicsMarks(90).forEach(System.out::println);

		System.out.println("Search by Chemsitry marks");
		studentService.getByChemistryMarks(90).forEach(System.out::println);

		System.out.println("Search by Mathematics marks");
		studentService.getByMathsMarks(90).forEach(System.out::println);






	}
}
