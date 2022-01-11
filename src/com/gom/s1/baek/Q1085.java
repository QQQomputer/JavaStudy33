package com.gom.s1.baek;

import java.util.Scanner;

public class Q1085 {
//직사각형에서 탈출
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();	
		int w = sc.nextInt();	
		int h = sc.nextInt();	
		int a = x;
		if(w-x<x) {
			a=w-x;
		}		
		
		if(h-y<y) {
			if(h-y<a) {
				a=h-y;
			}		
		}else {
			if(y<a) {
				a=y;
			}
		}

		System.out.println(a);
	}

}
