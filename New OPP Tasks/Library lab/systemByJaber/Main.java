package systemByJaber;

import employee.FullTime;

import java.util.ArrayList;
import java.util.Date;
import employee.PartTime;
import salaryCalculator.BasicSalary;

public class Main {

	public static void main(String[] args) {

		Date date = new Date(); // to get the date
		int firstEmployeeSalary = 0, secondEmployeeSalary = 0; // to calculate the salary
		// First employee(Full time)
		FullTime firstEmployee = new FullTime(5);  
		BasicSalary employeeOneSalary = new BasicSalary();
		
		String fullPartName = FullTime.nameClass(); // user should enter his name here
		
		
		firstEmployeeSalary = employeeOneSalary.claSalary(firstEmployee.getHour(), firstEmployee.getRate()); // full time employee without over time
		System.out.println("Full time employee his salary is without overtime = " + firstEmployeeSalary);
		
		firstEmployeeSalary = employeeOneSalary.claSalary(firstEmployee.getHour(), firstEmployee.getRate(), true, 7); // full time employee without time
		System.out.println("Full time employee his salary is with overtime = " + firstEmployeeSalary);

		//second employee(Part Time)
		PartTime secondEmployee = new PartTime(9);
		BasicSalary employeeTwoSalary = new BasicSalary();
		
		String partTimeName = PartTime.nameClass(); // user should enter his name here
		
		secondEmployeeSalary = employeeTwoSalary.claSalary(secondEmployee.getHour(), secondEmployee.getRate()); // part time employee without over time
		System.out.println("Part time employee his salary is without overtime = " + firstEmployeeSalary);
		
		secondEmployeeSalary = employeeTwoSalary.claSalary(secondEmployee.getHour(), secondEmployee.getRate(), true, 3); // part time employee with over time
		System.out.println("Part time employee his salary is with overtime = " + firstEmployeeSalary);
		
        System.out.println(); // space 

		// compared between part time salary and full time salary
		System.out.println("The maximam between " + fullPartName + " salary and "+ partTimeName +" salary is : " + Math.max(firstEmployeeSalary, secondEmployeeSalary) + " JDs");
        System.out.println("The date of the salary report : " + date);
        
        System.out.println(); // space 
        
        // employee Array names
        ArrayList<String> arrName = new ArrayList<String>();
        arrName.add(fullPartName); // to add first name to the list(Array)
        arrName.add(partTimeName); // to add second name to the list(Array)
    	System.out.println("The name list of employees are : ");
        for(String arr : arrName) // to print all the name in the array
        {
        	System.out.println(arr);
        }
	}
	
}
