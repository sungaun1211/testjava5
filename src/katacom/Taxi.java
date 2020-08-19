package katacom;

public class Taxi extends Trans{
	private int xDan;
	public Taxi(int cusCnt, int dis,int xDan) {
		super(cusCnt, dis);
		this.xDan=xDan;
	}

	
	public int getCharge() {
		return cusCnt*dis*xDan;
	}
}
