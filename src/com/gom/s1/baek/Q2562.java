package com.gom.s1.baek;

import java.util.Scanner;

public class Q2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max=0;
		int i;
		for( i=1;i<10;i++) {
			int s = sc.nextInt();
			if(max%100<s) {
				max=100*i+s;
			}
		}
		System.out.println(max%100);
		System.out.println(max/100);
	}

}