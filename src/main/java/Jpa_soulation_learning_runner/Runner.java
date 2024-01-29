package Jpa_soulation_learning_runner;
import java.util.List;

import Jpa_soulation_learning.dao.StudentRepo;
import Jpa_soulation_learning.entity.Student;


public class Runner {
	static StudentRepo stuRepo = new StudentRepo();
	public static void main(String[] args) {
		
		save();
//		stuRepo.findAndUpdate(1);
//		stuRepo.findAndDelete(3);
//		System.out.println("Operation completed");
//		
		List<Student> findAll = stuRepo.findAll();
//		findAll.forEach(System.out::println);
//		
		for (Student student : findAll) {
			System.out.println(student);
		}
//		stuRepo.findAndUpdate(1);
//		stuRepo.findAndDelete(1);
		System.out.println("..........");
	}

	private static void save() {
		Student stu1 = new Student("Raghav",2400,54);
		Student stu2 = new Student("Aditya",2500,25);
		Student stu3 = new Student("Aman",2600,20);
		stuRepo.persist(stu1);
		System.out.println("Successully save in db" + stu1);
		stuRepo.persist(stu2);
		System.out.println("Successully save in db" + stu2);
		stuRepo.persist(stu3);
		System.out.println("Successully save in db" + stu3);
	}
		
		


}
