package salaryCalculator;

public class OverTimeSalary {

	public static int salaryCount;
	 static int calOverTimeSalary(int sum , int overTime)
	{
	 salaryCount = sum + (overTime * 8);
		return salaryCount;
	}
}
