package com.gom.s2.constructor;

public class Car {

	String brand;
	public static String company="Kia";	
	int cc;
	String color;
	
	//생성자
	public Car() {//default 생성자
		this("k8");
		
		System.out.println("1--------");
		
//		this.company="kia";
//		this.brand="k9";
//		this.color="black";
//		this.cc=5000;
	}
	public Car(String brand) { //매개변수가 있음 = 기본생성자가 아님
		this(brand, "black");
//		this.company="kia";
//		this.brand=brand;
//		this.color="black";
//		this.cc=5000;
		System.out.println("2---------");
	}
	public Car(String brand, String color) {
		this(brand, color, 5000);
//		this.company="kia";
//		this.brand=brand;
//		this.color=color;
//		this.cc=5000;
		System.out.println("3---------");
	}
	public Car(String brand, String color, int cc) {

		this.brand=brand;
		this.color=color;
		this.cc=cc;
		System.out.println("4---------");
	}
	
	
	//멤버메서드
	public void info() {
		System.out.println("멤버메서드");
		System.out.println(Car.company);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.cc);
	}
	
	
	
	
}
