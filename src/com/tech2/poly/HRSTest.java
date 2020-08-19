package com.tech2.poly;

abstract class Employee extends Object{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
	}

	class Salesman extends Employee{
		int annual_sales;
		public void calcSalary() {
			System.out.println("Salesman 급여=기본급+판매수당");
		}
	public void calcBonus() {
		System.out.println("Salesman 보너스=기본급*12*4");
	}
	class Consultant extends Employee{
		int num_project;
		public void calcSalary() {
			System.out.println("Consultant 급여=기본급+컨설던팅 특별 수당");
		}
	public void calcBonus() {
		System.out.println("Consultant 보너스=기본급*12*4");	
	}
	}
	
	abstract class Manager extends Employee{
		int num_team;
		public void ccalcSalary() {
			System.out.println("Manager 급여=기본급+팀성과수당");
		}
	}
	class Director extends Manager{
		public void calcBonus() {
			System.out.println("Direcror 보너스=기본급*12*6");
		}
	}
	public class HRSTest{
	public static void calTax(Employee e) {
//		System.out.println("소득세를 계산합니다.");
		System.out.println("Saleman 비교:"+(e instanceof Salesman));
		if (e instanceof Salesman) {
			Salesman s=(Salesman)e;
			s.annual_sales=65000000;
			System.out.println("saleman 입니다."+s.annual_sales);
			
		}else if(e instanceof Manager) {
			Manager m=(Manager)e;
			m.num_team=5;
			System.out.println("Manager 입니다."+m.num_team);

		}else if(e instanceof Consultant) {
			Consultant c=(Consultant)e;
			c.num_project=35;
			System.out.println("Manager 입니다."+c.num_project);
		}
		
		
	}
		public static void main(String[] args) {
			
		Salesman s=new Salesman();
			Consultant c=new Consultant();
			Director d=new Director();
			Employee arr[]=new Employee[3];
			
			arr[0]=s;
			arr[1]=c;
			arr[2]=d;
			calTax(s);
//			calTax(arr[0]);
//			calTax(arr[1]);
//			calTax(arr[2]);
//			for (Employee object : arr) {
//				calTax(object);
//			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			
//			s.calcBonus();
//			c.calcBonus();
//			d.calcBonus();
//			System.out.println(s.toString());
//			System.out.println(c.toString());
//			System.out.println(d.toString());
			Salesman s2=s;
			if(s.equals(c)) {
				System.out.println("동일");
			}else {
				System.out.println("에해");
			}
			
			calTax(s);
			calTax(c);
			calTax(d);
		}
		}
	}