package rotatestring;

import java.util.Scanner;

public class RotateString {

	// scanner object to use throughout class
    static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Please enter a string of characters: "); // prompt for any string of chars
		String string1 = input.nextLine(); // store user input into string 1 variable
		newString(string1, validateInput(string1)); // validate input and create new string
	} // end main
	
	// method to validate user input for rotation value
	public static int validateInput(String string1) {
		while (true) {
			System.out.print("\nPlease enter a degree for rotation: ");
			String initialInput = input.nextLine(); // store initial input as a string
			try {
				int index = Integer.parseInt(initialInput); // try to convert to integer
				if (index >= 0 && index < string1.length()) return index; // cannot be negative or out of range
			} catch (NumberFormatException exception) {}
			System.out.print("\nPlease only enter positive integers within range.");
		}
	} // end validateInput
	
	// method to "rotate", re-join, and print string
	public static void newString(String string1, int index) {
		index = string1.length() - index; // rotate characters from the end of the string
		String string2 = string1.substring(0, index); // cut string from beginning at 'index'
		string1 = string1.substring(index); // store remainder of string
		string1 = string1.concat(string2); // concatenate the parts
		System.out.printf("%n%s %s", "Your new string is now:", string1); // print new string
	} // end newString
	
} // end class RotateString

