package pharmacyProject;

public class Customer {

	private String name;
	private int age;
	private String gender;

	Customer() {

	}


	Customer(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;

	}


	public boolean customerInformation() {
		if (age > 18 && age < 60) {
			System.out.println("Your name : " + name + " | your age : " + age + " | your gender : " + gender);
			return true;
		} else if (age > 60) {
			System.out.println("Sorry, we can't help you!");
			System.out.println("you should visit your doctor to give you accurate medical advice!\n");
			System.out.println("Wishing you a good day <3");
			System.out.println("Main Menu");
			return false;
		} else {
			System.out.println("\nYou should be over 18 to give you permission to use our system!!\n");
			System.out.println("Main Menu");
			return false;
		}
	}

	public static void userRate(int rate) {
		if (rate >= 4)
			System.out.println("\nThanks you for your rate, we like that you liked it:)\n");
		else if (rate == 3)
			System.out.println("\nThanks you for your rate, we will make the system better <3\n");
		else {
			System.out.println("\nWe will do our best to improve the system.\n");

		}
	}

}
