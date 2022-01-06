package com.gom.s1.same;

public class Square {

	int garo;
	int sero;
	
	
	
	public boolean same(Square s) {			
		//멤버변수 garo랑 매개변수로 받은 객체의 garo같고
		//멤버변수 sero랑 매개변수로 받은 객체의 sero같으면 true 리턴
		//하나라도 틀리면 false를 리턴
		//매개변수
		boolean i = false;
		if(s.garo == this.garo && s.sero == this.sero) {
			i=true;
		}
	
		return i;
	}
	
//	public void samesero(Square s1) {	
//		
//		this.total = kor + eng + math;
//		this.avg = this.total/3.0;
//	}
	
	
	
}
