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
			System.out.println("Salesman �޿�=�⺻��+�Ǹż���");
		}
	public void calcBonus() {
		System.out.println("Salesman ���ʽ�=�⺻��*12*4");
	}
	class Consultant extends Employee{
		int num_project;
		public void calcSalary() {
			System.out.println("Consultant �޿�=�⺻��+�������� Ư�� ����");
		}
	public void calcBonus() {
		System.out.println("Consultant ���ʽ�=�⺻��*12*4");	
	}
	}
	
	abstract class Manager extends Employee{
		int num_team;
		public void ccalcSalary() {
			System.out.println("Manager �޿�=�⺻��+����������");
		}
	}
	class Director extends Manager{
		public void calcBonus() {
			System.out.println("Direcror ���ʽ�=�⺻��*12*6");
		}
	}
	public class HRSTest{
	public static void calTax(Employee e) {
//		System.out.println("�ҵ漼�� ����մϴ�.");
		System.out.println("Saleman ��:"+(e instanceof Salesman));
		if (e instanceof Salesman) {
			Salesman s=(Salesman)e;
			s.annual_sales=65000000;
			System.out.println("saleman �Դϴ�."+s.annual_sales);
			
		}else if(e instanceof Manager) {
			Manager m=(Manager)e;
			m.num_team=5;
			System.out.println("Manager �Դϴ�."+m.num_team);

		}else if(e instanceof Consultant) {
			Consultant c=(Consultant)e;
			c.num_project=35;
			System.out.println("Manager �Դϴ�."+c.num_project);
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
				System.out.println("����");
			}else {
				System.out.println("����");
			}
			
			calTax(s);
			calTax(c);
			calTax(d);
		}
		}
	}