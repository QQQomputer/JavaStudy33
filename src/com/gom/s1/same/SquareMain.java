package com.gom.s1.same;

public class SquareMain {

	public static void main(String[] args) {

		//멤버변수 garo랑 매개변수로 받은 객체의 garo같고
		//멤버변수 sero랑 매개변수로 받은 객체의 sero같으면 true 리턴
		//하나라도 틀리면 false를 리턴
		//매개변수
		
		Square s1 = new Square(); // 멤버변수 선언하고 써주려면 new로 객체생성을 해줘야함
		
		s1.garo=4;
		s1.sero=5;
		
		Square s2 = new Square();
		s2.garo=4;
		s2.sero=5;
		
		boolean check = s1 == s2;
		
		System.out.println(check);
		
		boolean j = s1.same(s2);
		System.out.println(j);
		j = s2.same(s1);
		System.out.println(j);
		
		
	}

}
