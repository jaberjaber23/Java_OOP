package pharmacyProject;

import java.util.Scanner;
import pharmacyProjectGUI.IdealWeightCalculator;

public class PharmacyProject {

	public static void main(String[] args) {
		CustomerRate userRate = new CustomerRate();
		int userInput = 0;
		boolean exitLoop = true, exitWhile = true;

		System.out.println("Welcome to Virtual Medical Advice Provider!\n");
		System.out.println("Main Menu");
		do {
			mainMenu();

			do {
				try {
					Scanner user = new Scanner(System.in);
					exitWhile = false;
					userInput = user.nextInt();
				} catch (Exception e) {
					exitWhile = true;
					System.out.println("\nPlease enter intergeres without characters!");
					mainMenu();
				}
			} while (exitWhile == true);

			if (userInput == 3) {
				int userRateResult = userRate.getRateResult();
				if (userRateResult != 0)
					System.out.println("\nYour avarage rates is 5/" + userRateResult);
				System.out.println("\nthe program has been exited!!");
				return;
			} else if (userInput > 3 || userInput < 1) {
				exitLoop = true;
				System.out.println("\nPlease enter a valid option!!");
			} else
				exitLoop = false;

			if (userInput == 1) {
				CustomerInterface.customerInterfaceMethod();
				exitLoop = true;
			} else if (userInput == 2)
				IdealWeightCalculator.GUI();
		} while (exitLoop);
	}

	static void mainMenu() {
		System.out.println("1.Start..");
		System.out.println("2.Ideal Weight Calculator..");
		System.out.println("3.Exit..");
		System.out.print(">>");
	}

}
