package pharmacyProject;

import java.util.Scanner;

public class CustomerInterface {
	public static void customerInterfaceMethod() {
		int customerInput = 0, customerAge = 0, customerAdvice, budget = 0;
		String customerName, customerGender;
		boolean exitLoop = true, exitTry = false;
		Scanner customerIn = new Scanner(System.in);

		System.out.println(".......................................");
		System.out.print("\nWelcome to the virtual assistant! \n");
		Customer newCustomer = new Customer();
			System.out.println("Please enter your name >> "); // user name
			customerName = customerIn.next();
			newCustomer.setName(customerName);
			do
			{
			try {
				Scanner customerIn1 = new Scanner(System.in);
			System.out.println("please enter your age >> "); // user age
			customerAge = customerIn1.nextInt();
			newCustomer.setAge(customerAge);
			exitTry = false;
			} catch (Exception  e) {
				System.err.println("Please enter valid number!!");
				exitTry = true;
			}}while(exitTry);
			System.out.println("Please enter your gender >> "); // user gender
			customerGender = customerIn.next();
			newCustomer.setGender(customerGender);
		System.out.println();
		boolean exit = newCustomer.customerInformation(); // check the age
		if (exit) {
			System.out.println("Welocme " + newCustomer.getName() + "!\n");
			do {
				System.out.println("Do you need.. ");
				System.out.println("1.Medical Advice.");
				System.out.println("2.Inquiries about medicine.");
				System.out.println("3.Contact with doctor.");
				System.out.println("4.Go back to Main Menu..\n>> ");
				customerInput = customerIn.nextInt(); // user input

				if (customerInput == 4) { // the forth option
					exitLoop = false;
					System.out.println("Main Menu");
					break;
				} // to end the system
				else if (customerInput > 4 || customerInput < 1) {
					exitLoop = true;
					System.out.println("Please enter a valid option!!");
					continue;
				}

				if (customerInput == 1) {
					do {
						System.out.println("\nDo you want medical advice in:\n");
						System.out.println("1.Hypertensive");
						System.out.println("2.Hyperglycemia");
						System.out.println("3.Covid-19");
						System.out.println("4.Sorethroat");
						System.out.println("5.Headache");
						System.out.println("6.Gerd\n");
						customerAdvice = customerIn.nextInt(); // user input
						if (customerAdvice == 1) {
							Advice.hypertensive();
							userRate();
							exit = false;
						} else if (customerAdvice == 2) {
							Advice.hyperglycemia();
							userRate();
							exit = false;
						} else if (customerAdvice == 3) {
							Advice.covid();
							userRate();
							exit = false;
						} else if (customerAdvice == 4) {
							Advice.sorethoroat();
							userRate();
							exit = false;

						} else if (customerAdvice == 5) {
							Advice.headache();
							userRate();
							exit = false;
						} else if (customerAdvice == 6) {
							Advice.gerd();
							userRate();
							exit = false;
						} else {
							System.out.println("Enter a valid option!");
							exit = true;
						}
					} while (exit);

				}

				else if (customerInput == 2) {
					exit = true;
					do {
						// Medicine
						System.out.println("         **Medicine Page**");
						System.out.println("Do you want advice about medication for..");
						System.out.println("1.Headache");//
						System.out.println("2.Flu");
						System.out.println("3.Allergic");
						System.out.println("4.Fever");
						System.out.println("5.sinus");
						System.out.println("6.Joint Pain");
						System.out.println("7.Gut");
						System.out.println("8.Cough");
						System.out.println(
								"*NOTE:There are the most common diseases now, If you hava an exceptoinal case you can call the doctor's number from the Main Menu!");
						System.out.println(">> ");

						customerAdvice = customerIn.nextInt(); // user input

						switch (customerAdvice) {
						case 1:
							budget = userBudget();
							if (budget != 0)
								Medicine.headache(budget);
							else
								Medicine.headache();
							userRate();
							exit = false;
							break;

						case 2:
							budget = userBudget();
							if (budget != 0)
								Medicine.headache(budget);
							else
								Medicine.flu();
							userRate();
							exit = false;
							break;

						case 3:
							budget = userBudget();
							if (budget != 0)
								Medicine.headache(budget);
							else
								Medicine.allergic();
							userRate();
							exit = false;
							break;

						case 4:
							budget = userBudget();
							if (budget != 0)
								Medicine.headache(budget);
							else
								Medicine.fever();
							userRate();
							exit = false;
							break;

						case 5:
							budget = userBudget();
							if (budget != 0)
								Medicine.headache(budget);
							else
								Medicine.sinus();
							userRate();
							exit = false;
							break;

						case 6:
							budget = userBudget();
							if (budget != 0)
								Medicine.headache(budget);
							else
								Medicine.jointPain();
							userRate();
							exit = false;
							break;

						case 7:
							budget = userBudget();
							if (budget != 0)
								Medicine.headache(budget);
							else
								Medicine.gerd();
							userRate();
							exit = false;
							break;

						case 8:
							budget = userBudget();
							if (budget != 0)
								Medicine.headache(budget);
							else
								Medicine.cough();
							userRate();
							exit = false;
							break;

						default:
							System.out.println("Error!");
							break;
						}
					} while (exit);
				} else
					System.out.println("\nDr.Ahmad | Phone Number = 0096279548923 | gmail : drahmad2@gmail.com\n");

			} while (exitLoop);
		}
	}

	static void userRate() {
		boolean exitDo = true;
		int customerRate = 0;
		System.out.print("Please rate our system form 5/..");

		do {
			try {
				Scanner customerIn = new Scanner(System.in);
				exitDo = false;
				customerRate = customerIn.nextInt();
				if (customerRate > 5 || customerRate < 1) {
					exitDo = true;
					System.out.println("\n*Please enter number between 1-5!");
					System.out.println(">> ");
					continue;
				}
			} catch (Exception e) {
				exitDo = true;
				System.out.println("\nPlease enter interger input without any characters!\n");
			}
		} while (exitDo == true);
		CustomerRate.allRating(customerRate);

	}

	public static int userBudget() {
		int budget = 0, yesOrNo = 0;
		boolean exitWhile = true;
		do {
			try {
				Scanner customerBudget = new Scanner(System.in);
				System.out.println("Do you hava a certain budget? ");
				System.out.println("1.YES\n2.NO");
				exitWhile = false;
				yesOrNo = customerBudget.nextInt();
				if (yesOrNo == 1) {
					System.out.println("Please enter your budget(USD): ");
					budget = customerBudget.nextInt();
					exitWhile = false;
				} else if (yesOrNo == 2) {
					budget = 0;
					exitWhile = false;
				} else
					exitWhile = false;
			} catch (Exception e) {
				exitWhile = true;
				System.err.println("\nPlease enter intergeres without any characters!");
			}
		} while (exitWhile);
		return budget;
	}
}
