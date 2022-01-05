package com.gom.s1.student;

import java.util.Scanner;

public class StudentUtil {
	//학생 객체를 생성하고 정보를 입력 받는 곳
	//Scanner sc = new Scanner(System.in);//이렇게 써도 되는데 현장에서 이렇게 잘 안씀
										//멋이 안남 무조건 스캐너 써야하는데 다른 라이브러리에 쓰고싶을때?..	
	Scanner sc;
	
	public void initUtil() {
		this.sc= new Scanner(System.in);
	}
	
	
	public Student[] makeStudents() {

		//검색할 학생의 번호를 입력
		//입력 받은 번호와 일치하는 학생을 찾아서 리턴

		System.out.println("학생수는 몇명입니까?");
		int num = sc.nextInt();
		Student [] stus = new Student[num];
		
		for(int i =0; i<stus.length;i++) {
			Student stu = new Student();
			stus[i]=stu;
			System.out.println("이름을 입력해주세요");
			stus[i].name = sc.next();
			System.out.println("번호를 입력해주세요");
			stus[i].num = sc.nextInt();
			System.out.println("국어점수를 입력해주세요");
			stus[i].kor = sc.nextInt();
			System.out.println("영어점수를 입력해주세요");
			stus[i].eng = sc.nextInt();
			System.out.println("수학점수를 입력해주세요");
			stus[i].math = sc.nextInt();
			stu.makeTotal();
				
		}
		return stus;		
	}		
		////////////////void 씀
	public Student search(Student [] stus) {		
		StudentView sv = new StudentView();
		Student stu = null;			/////////////////////////////////////////?
		
		System.out.println("검색하실 학생의 번호를 입력해주세요");
		int num = sc.nextInt();
		boolean flag = true;
		
		for(int i=0;i<stus.length;i++) {
			if(stus[i].num == num) {
				stu = stus[i];
				System.out.println("find");
				flag = false;
				break;
			}		
		}
		if(flag) {
			System.out.println("입력하신 학생번호가 존재하지 않습니다.");
		}
		
		return stu;///////////////
	}
	
	
	
}