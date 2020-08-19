package katacom;

public class Train extends Trans {
	private int tDan;
	public Train(int cusCnt, int dis,int tDan) {
		super(cusCnt, dis);
		this.tDan=tDan;
	}

	
	public int getCharge() {
		return cusCnt*dis*tDan;
	}
}
