
import java.util.Scanner;

public class NamePlay {

	public static void main(String[] args) {
		
// Ask for full name
		System.out.println("Please enter your full name: ");

		Scanner kbd = new Scanner(System.in);
		
// Record the string
		String fullName = kbd.nextLine();

// Find position of first space
	  int firstSpace = fullName.indexOf(" ");

// Get first name
		String firstName = fullName.substring(0, firstSpace);

// Print first name
		System.out.println("Your first name is: " + firstName);

// Find position of second space
	  int secondSpace = fullName.lastIndexOf(" ");

// Get middle name
		String middleName = fullName.substring(firstSpace + 1, secondSpace);

// Print middle name
			System.out.println("Your middle name is: " + middleName);

// Get last name
		String lastName = fullName.substring(secondSpace);

// Print last name
			System.out.println("Your last name is: " + lastName);

// Get initials

	char firstInit = fullName.charAt(0);
	char secondInit = fullName.charAt(firstSpace + 1);
	char thirdInit = fullName.charAt(secondSpace + 1);

// Print initials
			System.out.println("Your initials are: " + firstInit + secondInit + thirdInit);

// Get last character of first name
	char lastLetterFirstname = fullName.charAt(firstSpace - 1);

// Get last character of second name
	char lastLetterSecondname = fullName.charAt(secondSpace - 1);

// Get last character of last name
		String lastLetter = fullName.substring(fullName.length() - 1);

// String length
	int fullNameLength = fullName.length();

// Print password
			System.out.println("Your temporary password is: " + lastLetterFirstname + lastLetterSecondname + lastLetter
				+ fullNameLength);
			
// Print last name, first and second initials
			System.out.println(lastName.toUpperCase() + "," + " " + firstName + " " + secondInit + ".");

			kbd.close();

	}

}
