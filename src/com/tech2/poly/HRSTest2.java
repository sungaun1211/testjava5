package com.tech2.poly;

public class HRSTest2 {
public static void calcTax(Employee e) {
	System.out.println("�ҵ漼�� ����մϴ�");
}

public static void main(String[] args) {
	Salesman s=new Salesman();
	Consultant c=new Consultant();
	Director d=new Director();
	
	calcTax(s);
	calcTax(c);
	calcTax(d);
	
	
	
}
}