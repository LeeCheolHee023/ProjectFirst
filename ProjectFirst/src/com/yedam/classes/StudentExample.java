package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "Hong";
		stu.age = 20;
		stu.height = 178.4;
		stu.weight = 70.5;
		stu.study();
		stu.eat("banana");
		System.out.println("이름은: " + stu.name + ", 나이는: " + stu.age + ", 키는 : " + stu.height);
		
		
		Student stu1 = new Student();
		stu1.name = "Park";
		stu1.age = 20;
		stu1.height = 178.4;
		stu1.weight = 70.5;
		stu1.study();
		stu1.eat("banana");
		System.out.println("이름은: " + stu1.name + ", 나이는: " + stu1.age + ", 키는 : " + stu1.height);
	
		
		Student stu2 = new Student();
		stu2.name = "Choi";
		stu2.age = 20;
		stu2.height = 178.4;
		stu2.weight = 70.5;
		stu2.study();
		stu2.eat("banana");
		System.out.println("이름은: " + stu2.name + ", 나이는: " + stu2.age + ", 키는 : " + stu2.height);
		
		Student[] s1 = new Student[3];
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;
		
		String inputStr = new String("Choi");
		for(Student stud : s1) {
			System.out.println(stud.name + "/" + stud.age);
			if(stud.name.equals(inputStr)) {
				System.out.println(inputStr);
			}
		}
	}
}
