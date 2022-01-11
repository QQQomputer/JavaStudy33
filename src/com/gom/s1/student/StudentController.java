package com.gom.s1.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentUtil su = new StudentUtil();
		StudentView sv = new StudentView();
		Student[] stus = null;
		Student stu=null;

		while (check) {

			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생정보 검색 출력");
			System.out.println("4. 프 로 그 램  종료");

			int select = sc.nextInt();

			switch (select) {

			case 1:
				System.out.println("입력");
				stus = su.makeStudents();
				break;
			case 2:

				if (stus != null) {
					System.out.println("출력");
					sv.viewStudents(stus);
					break;
				} else {
					sv.viewMessage("학생정보를 먼저 입력하세요");
				}
				break;

			case 3:
				if (stus == null) {
					sv.viewMessage("학생 정보가 없습니다.");
					continue;
				}
				stu = su.search(stus);
				if (stu != null) {
					System.out.println("검색");
					sv.search(stu);
					break;
				} else {
					sv.viewMessage("학생정보를 먼저 입력하세요");
				}
				break;

//				boolean flag = true;
//				System.out.println("검색할 학생의 번호를 입력하세요");
//				int num = sc.nextInt();
//				for(int i=0; i<stus.length;)	{
//					if(stus[i].num == num) {
//						sv.search(stus[i]);
//						flag = false;
//					}
//				}
//				if(flag) {
//					System.out.println("검색하신 번호는 없는 학생번호입니다.");
//				}					
			case 4:
				System.out.println("4. 프로그램 종료를 선택하셨습니다.");
				check = !check;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}// switch case 끝

		}

	}

}
//for(int i = 0;i<stus.length;i++) {
//	System.out.println(i+1+"번째 학생의 이름을 입력해주세요");
//	stu.name = sc.next();
//	System.out.println(i+1+"번째 학생의 번호를 입력해주세요");
//	stu.num = sc.nextInt();
//	System.out.println(i+1+"번째 학생의 국어점수를 입력해주세요");
//	stu.kor = sc.nextInt();
//	System.out.println(i+1+"번째 학생의 영어점수를 입력해주세요");
//	stu.eng = sc.nextInt();	
//	System.out.println(i+1+"번째 학생의 수학점수를 입력해주세요");
//	stu.math = sc.nextInt();
//	stus[i] = stu;			