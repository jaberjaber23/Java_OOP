package employee;

public class FullTime {

	private int hour;
	private int rate;
	// constructor
	public FullTime() {
		rate = 10;
	}
	
	public FullTime(int hour) {
		this.hour = hour;
		rate = 10;
	}
	public FullTime(int hour, int rate) {
		this.hour = hour;
		this.rate = rate;
	}
	
	
	//encapsulation
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
}
