package employee;

import java.util.Scanner;

public class FullTime {
	static Scanner sc = new Scanner(System.in);

	private int hour;
	private int rate;
   private static String name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static String nameClass()
	{
		System.out.println("Please enter your name: ");
		name = sc.next();
		if(name.contains("A") || name.contains("a"))
		{
			System.out.println("You got a bouns 20JDS!!");
		}
		if(name.charAt(0)=='U')
		{
			System.out.println("You are unique");
		}
		return name;
	}
	
}
