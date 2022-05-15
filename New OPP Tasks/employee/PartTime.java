package employee;

public class PartTime {

	private int hour;
	private int rate;
	
	// constructor
	public PartTime() {
	rate = 5;
	}
	
	public PartTime(int hour) {
		this.hour=hour;
		rate = 5;
		}
	
	public PartTime(int hour, int rate) {
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
