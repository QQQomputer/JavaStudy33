package com.gom.s1.student;

public class Student {

	String name;
	int num;
	int kor;
	int eng;
	int math;

	int total;
	double avg; // 멤버 변수

	public void makeTotal() {
		int total = 0;
		System.out.println("참조변수 this");
		System.out.println("참조변수 this : " + this);
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}

	public void hello() { // 멤버 메서드
		System.out.println("안녕하세요");

	}

}