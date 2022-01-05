package com.gom.s1.student;

public class StudentView {

	public void viewStudents(Student[] stus) {		
		for(int i=0;i<2;i++) {
		System.out.println("이름 : "+stus[i].name);
		System.out.println("번호 : "+stus[i].num);
		System.out.println("국어 : "+stus[i].kor);
		System.out.println("영어 : "+stus[i].eng);
		System.out.println("수학 : "+stus[i].math);
		System.out.println("총점 : +"+stus[i].total);
		System.out.println("평균 : +"+stus[i].avg);
		
		//for(int i=0;i<students.length;i++){
		//this.viewStudents(stus[i]);}
		}		
	}
	
	public void search(Student stu) {
		System.out.println("이름 : "+stu.name);
		System.out.println("번호 : "+stu.num);
		System.out.println("국어 : "+stu.kor);
		System.out.println("영어 : "+stu.eng);
		System.out.println("수학 : "+stu.math);
		System.out.println("총점 : +"+stu.total);
		System.out.println("평균 : +"+stu.avg);
	
	}
	
	public void viewMessage(String message) {
		
		System.out.println("------------------");
		System.out.println(message);
		System.out.println("------------------");
		
	}
	
	
	
}
