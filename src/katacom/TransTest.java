package katacom;

public class TransTest {
	public static void printCharge(Trans tran) {
		System.out.println("=================");
		System.out.println(tran);
		System.out.println("-----------------");
		
		System.out.println("���ұݾ�:"+tran.getCharge());
		
		System.out.println("-----------------");
	}
	
	public static void main(String[] args) {
		
		Trans[] trans=new Trans[4];
		trans[0]=new Train(5,100,200);
		trans[1]=new Express(10,100,100);
		trans[2]=new Taxi(2,10,500);
		trans[3]=new Train(1,100,300);
//		for (Trans tran : trans) {
//			printCharge(trans[0]);
//			
//		}
		for (int i = 0; i < trans.length; i++) {
			printCharge(trans[i]);
		}
		Express ex=new Express(1,10,500);
		System.out.println(ex.getStartStation());
		System.out.println(ex.getEndStation());
		
	}
}
