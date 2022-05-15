package systemByJaber;

import employee.FullTime;
import employee.PartTime;
import salaryCalculator.BasicSalary;

public class Main {

	public static void main(String[] args) {

		int firstEmployeeSalary = 0, secondEmployeeSalary = 0; // to calculate the salary
		// First employee(Full time)
		FullTime firstEmployee = new FullTime(5);  
		BasicSalary employeeOneSalary = new BasicSalary();
		
		firstEmployeeSalary = employeeOneSalary.claSalary(firstEmployee.getHour(), firstEmployee.getRate()); // full time employee without over time
		System.out.println("Full time employee his salary is without overtime = " + firstEmployeeSalary);
		
		firstEmployeeSalary = employeeOneSalary.claSalary(firstEmployee.getHour(), firstEmployee.getRate(), true, 7); // full time employee without time
		System.out.println("Full time employee his salary is with overtime = " + firstEmployeeSalary);

		//second employee(Part Time)
		PartTime secondEmployee = new PartTime(9);
		BasicSalary employeeTwoSalary = new BasicSalary();
		
		secondEmployeeSalary = employeeTwoSalary.claSalary(secondEmployee.getHour(), secondEmployee.getRate()); // part time employee without over time
		System.out.println("Part time employee his salary is without overtime = " + firstEmployeeSalary);
		
		secondEmployeeSalary = employeeTwoSalary.claSalary(secondEmployee.getHour(), secondEmployee.getRate(), true, 3); // part time employee with over time
		System.out.println("Part time employee his salary is with overtime = " + firstEmployeeSalary);

	}

}
