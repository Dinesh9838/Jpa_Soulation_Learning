package Jpa_soulation_learning.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


	@Entity
	public class Student {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(name="s_name")
		private String name;
		
		@Column(name="s_fees")
		private int fees;
		
		@Column(name="s_age")
		private int age;
		
		public Student() {
			super();
		}

		public Student(String name, int fees, int age) {
			super();
			this.name = name;
			this.fees = fees;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", fees=" + fees + ", age=" + age + "]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getFees() {
			return fees;
		}

		public void setFees(int fees) {
			this.fees = fees;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
}
