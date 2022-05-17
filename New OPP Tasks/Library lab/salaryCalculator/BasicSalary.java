package salaryCalculator;

public class BasicSalary {

	public  int sum;
	 public  int claSalary(int hour, int rate)
	{	
		return rate*hour;		
	}
	public  int claSalary(int hour, int rate,boolean overTime, int OverTimeCount)
	{
		 sum = hour*rate;
		if(overTime)
		{
			return OverTimeSalary.calOverTimeSalary(sum, OverTimeCount);
		}
		return sum;
			
	}
}
