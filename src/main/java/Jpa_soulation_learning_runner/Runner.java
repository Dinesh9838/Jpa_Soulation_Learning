package Jpa_soulation_learning_runner;
import java.util.List;

import Jpa_soulation_learning.dao.StudentRepo;
import Jpa_soulation_learning.entity.Student;


public class Runner {
	static StudentRepo stuRepo = new StudentRepo();
	public static void main(String[] args) {
		
//		save();
		List<Student> findAll = stuRepo.findByCriteria();
		findAll.forEach(System.out::println);
		System.out.println("Operation completed");
		
	}

	private static void save() {
		Student stu1 = new Student("Mukul",2400,24);
		Student stu2 = new Student("Neet",2500,25);
		Student stu3 = new Student("Heetesh",2600,26);
		stuRepo.persist(stu1);
		System.out.println("Successully save in db" + stu1);
		stuRepo.persist(stu2);
		System.out.println("Successully save in db" + stu2);
		stuRepo.persist(stu3);
		System.out.println("Successully save in db" + stu3);
	}
		
		


}
