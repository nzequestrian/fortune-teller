import java.util.Scanner;

public class FortuneTellerApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Kia Ora! (\"Hello\")\nBy answering a few questions I can tell you your fortune! \nWhat is your first name?");
		//Kia Ora is Maori for Hello
		String firstName = input.next();
		if (firstName.equalsIgnoreCase("Quit")) {
			System.out.println("Nobody likes a quitter!");
			System.exit(0);
		}

		System.out.println("Kia Ora, " + firstName + "! What is your last name?");
		String lastName = input.next();
		if (lastName.equalsIgnoreCase("Quit")) {
			System.out.println("Nobody likes a quitter!");
			System.exit(0);
		}

		boolean ageIsNotAnInteger = true;
		int age = 0;
		while (ageIsNotAnInteger) {
			System.out.println("Nice to meet you " + firstName + " " + lastName + "! What is your age?");
			String ageInput = input.next();
			if (ageInput.equalsIgnoreCase("Quit")) {
				System.out.println("Nobody likes a quitter!");
				System.exit(0); // I would like to talk more about this
			}
			try {
				age = Integer.parseInt(String.valueOf(ageInput));
				ageIsNotAnInteger = false;

			} catch (Exception e) {
				System.out.println("You did not enter a number, please try again\n");
				ageIsNotAnInteger = true;
			} // I got this off the internet.
				// https://stackoverflow.com/questions/19925047/how-to-check-the-input-is-an-integer-or-not-in-java?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa(Java
				// Please show me an easier way to do this.
		}

		String response = "";

		if (age % 2 == 0) {
			response = "Ahh, my phychic abilities tell me you will retire in 12 years";
			System.out.println(response);

		} else {
			response = "Ohh, my phychic abilities tell me you will retire in 17 years";
			System.out.println(response);
		}

		String vacation = "";
		boolean siblingsIsNotAnInteger = true;
		int siblings = 0;
		while (siblingsIsNotAnInteger) {
			System.out.println("\n" + firstName + " How many siblings do you have?");
			String siblingsInput = input.next();
			if (siblingsInput.equalsIgnoreCase("Quit")) {
				System.out.println("Nobody likes a quitter!");
				System.exit(0);
			}
			try {
				siblings = Integer.parseInt(String.valueOf(siblingsInput));
				siblingsIsNotAnInteger = false;

			} catch (Exception e) {
				System.out.println("You did not enter a number, please try again\n");
				siblingsIsNotAnInteger = true;
			}
		}

		if (siblings == 0) {
			vacation = "Rome, Italy!";

		} else if (siblings == 1) {
			vacation = "Las Vegas, NV!";

		} else if (siblings == 2) {
			vacation = "Long Island, NY!";

		} else if (siblings == 3) {
			vacation = "Waikanae, New Zealand!";

		} else if (siblings > 3) {
			vacation = "be tenting in the back yard!";

		} else {
			vacation = "burn in Hell!!!";
		}
		System.out.println("You have " + siblings + " siblings. You are going to " + vacation);

		boolean monthIsNotAnInteger = true;
		int month = 0;
		while (monthIsNotAnInteger) {
			System.out.println("\n" + firstName + " please enter your birth month 1 - 12");
			String inputMonth = input.next();
			if (inputMonth.equalsIgnoreCase("Quit")) {
				System.out.println("Nobody likes a quitter!");
				System.exit(0);
			}
			try {
				month = Integer.parseInt(String.valueOf(inputMonth));
				monthIsNotAnInteger = false;

			} catch (Exception e) {
				System.out.println("You did not enter a number, please try again\n");
				monthIsNotAnInteger = true;
			}
		}
		String dinero = "";
		String monthName = "";

		if (month == 1) {
			monthName = "January!";
			dinero = " $ 5,000.00 ";
		} else if (month == 2) {
			monthName = "Febuary!";
			dinero = " $ 10,000,000.00 ";
		} else if (month == 3) {
			monthName = "March!";
			dinero = "$ 5,000.00 ";
		} else if (month == 4) {
			monthName = "April!";
			dinero = "$ 5,000.00 ";
		} else if (month == 5) {
			monthName = "May!";
			dinero = "$ 57,000.01 ";
		} else if (month == 6) {
			monthName = "June!";
			dinero = "$ 57,000.01 ";
		} else if (month == 7) {
			monthName = "July!";
			dinero = "$ 57,000.01 ";
		} else if (month == 8) {
			monthName = "August!";
			dinero = "$ 57,000.01 ";
		} else if (month == 9) {
			monthName = "September!";
			dinero = "$5,575,575.57 ";
		} else if (month == 10) {
			monthName = "October!";
			dinero = "$5,575,575.57 ";
		} else if (month == 11) {
			monthName = "November!";
			dinero = "Unlimited funds"; // You can tell when my Birthday is!
		} else if (month == 12) {
			monthName = "December!";
			dinero = "$5,575,575.57 ";
		} else {
			System.out.println("You will receive nothing");
		}
		System.out.println(
				"You were born in " + monthName + "\n" + "When you retire you will have " + dinero + " in the bank");
		String color = "";
		String color2 = "";
		String carMake = "";

		boolean help = true;
		while (help) {
			System.out.println("\nWhat is your favorite color? Use ROYGBIV; type Help for assistance?");
			color = input.next();
			color2 = color.toLowerCase();

			switch (color2) {
			case "quit":
				System.out.println("Nobody likes a quitter!");
				System.exit(0);

			case "red":
				carMake = "Jeep Cherokee";
				help = false;
				break;
			case "orange":
				carMake = "Hyundai Tuscon";
				help = false;
				break;
			case "yellow":
				carMake = "Ford F-150";
				help = false;
				break;
			case "green":
				carMake = "Subaru Outback";
				help = false;
				break;
			case "blue":
				carMake = "Honda CX-5";
				help = false;
				break;
			case "indigo":
				carMake = "Audi A6";
				help = false;
				break;
			case "violet":
				carMake = "Chevy HD Dually 3500";
				help = false;
				break;

			case "help":
				System.out.println("Your color choices are red, orange, yellow, green, blue, indigo or violet");
			}
		}
		if (color2 != "help") {
			System.out.println("I like " + color + " too! I see a " + carMake + " in the near future!");
		}
		System.out.println("\n" + firstName + " " + lastName + ", " + response + " \nwith " + dinero
				+ " in the bank and will own a brand new " + color + " " + carMake);

		input.close();
		System.out.println("\n\nEnjoy your fortune!");
		System.exit(0);
	}
}
