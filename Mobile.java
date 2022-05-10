package Lab;

public class Mobile {

	private String brand;
	private String color;
	private int yearOfProduction;
	
	Mobile()
	{
		
	}
	
	Mobile(String brand, String color, int yearOfProduction)
	{
		this.brand=brand;
		this.color=color;
		this.yearOfProduction = yearOfProduction;
	}
	
	 void setBrand(String brand)
	{
		this.brand = brand;
	}	
	
	 String getBrand()
	{
		return brand;
	}
	
	 void setColor(String color)
	{
		this.color=color;
	}
	
	 String getColor()
	{
		return color;
	}
	
	 void setYear(int yearOfProduction)
	{
		this.yearOfProduction = yearOfProduction;
	}
	
	 int getyear()
	{
		return yearOfProduction;
	}
	
	 void dialNumber(int mobileNumber)
	{
		System.out.println("diallng "+ mobileNumber);
	}
	
	static void getCall(String callerName)
	{
		System.out.println( callerName + " is calling you");
	}
	
	void answeredb(boolean answered)
	{
		if(answered)
		    System.out.println("the call answered");
		else if(answered = false)
			System.out.println("The call is not answered");
	}
}
