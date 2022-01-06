package com.gom.s1.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		// 출력 전용
		//viewStudents - 여러명의 학생의 모든 정보를 출력		
		//viewStudent - 학생의 모든 정보를 출력
//		Scanner sc = new Scanner(System.in);
//		StudentUtil su = new StudentUtil();
//		StudentView sv = new StudentView();
//		Student stu = new Student();
		StudentController stuc = new StudentController();
//		su.initUtil();
//		stu.name="iu";
//		stu.kor=10;
//		stu.eng=20;
//		stu.math=30;
//
//		stu.makeTotal();
	
		
		stuc.start();
		Student stu = new Student();/////
		
								
		System.out.println("종료");
		
	}

}