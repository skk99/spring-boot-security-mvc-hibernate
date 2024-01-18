package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudents(studentDAO);

//			readStudent(studentDAO);

//			queryForStudents(studentDAO);

//			queryForStudentsByLastName(studentDAO);

//			updateStudent(studentDAO);

//			deleteStudent(studentDAO);

//			deleteAllStudent(studentDAO);

		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Total no of rows deleted "+ numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 2;
		System.out.println("Deleting student with id: "+ studentId);

		studentDAO.delete(studentId);

	}

	private void updateStudent(StudentDAO studentDAO) {

		// retrieve student based on the id: primary key
		int studentId = 1;
		System.out.println("Getting student with id: "+ studentId);
		Student myStudent = studentDAO.findById(studentId);

		// change first name to "John"
		System.out.println("Updating student...");
		myStudent.setFirstName("Paul");

		// update the student
		studentDAO.update(myStudent);

		// display the updated student
		System.out.println("Update student: "+ myStudent);

	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Duck");

		// display list of students
		for (Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for (Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		// Create a student object
		System.out.println("Creating new Student object...");
		Student tempStudent = new Student("Daff", "Duck", "daffy@luv2code.com");

		// save the student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved Student. Generated ID: "+ theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving Student with id: "+ theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: "+ myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// create multiple students
		System.out.println("Creating new Student objects...");
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

		// save the student objects
		System.out.println("Saving the Students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}


	private void createStudent(StudentDAO studentDAO) {
		// create the Student object
		System.out.println("Creating new Student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");

		// save the student object
		System.out.println("Saving the Student...");
		studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved Student. Generated ID: " + tempStudent.getId());
	}


}
