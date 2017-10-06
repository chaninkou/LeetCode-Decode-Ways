package example23;

import java.util.Scanner;

/*   
    Author: Chan In Kou
    Purpose: The Display show the advanced math tutor menu
*/
public class Example23 
{
	public static void main(String[] args) 
	{
		// Create a Scanner
		Scanner in = new Scanner(System.in);

		// Declare variables
		final int addition = 1;
		final int subtraction = 2;
		final int multiplication = 3;
		final int random = 4;
		int randomNumber1 = 0 + (int) (Math.random() * ((100 - 0) + 1));
		int randomNumber2 = 0 + (int) (Math.random() * ((100 - 0) + 1));
		int randomValue = 1 + (int) (Math.random() * ((3 - 1) + 1));

		// generate two random values between 0 and 100
		System.out.println(
				"The two random values between 0 and 100 will be " + randomNumber1 + " and " + randomNumber2 + ".");

		System.out.println("");

		// Present the following menu to your user
		String mathMenu = "Math Tutor Menu\n" + "1. Addition Problem\n" + "2. Subtraction Problem\n"
				+ "3. Multiplication Problem\n" + "4. Random Problem\n" + "Enter your choice: \n";

		// ask them what kind of problem they want to solve
		System.out.print(mathMenu);
		int userProblem = in.nextInt();

		// presenting the answer to the solution
		switch (userProblem) 
		{
		case addition:
			System.out.println(randomNumber1 + " + " + randomNumber2 + " = ?");
			System.out.println("Enter your solution: ");
			int userAnswer = in.nextInt();
			System.out.println("Your solution for the sum of the two numbers was " + userAnswer);
			int adding = randomNumber1 + randomNumber2;
			System.out.println("The correct answer will be " + adding);
			break;
		// ask the user for the differenceof the two numbers. Display whether or
		// not the user got the question correct
		case subtraction:
			System.out.println(randomNumber1 + " - " + randomNumber2 + " = ?");
			System.out.println("Enter your solution: ");
			int userAnswer1 = in.nextInt();
			System.out.println("Your solution for the difference of the two numbers was " + userAnswer1);
			int subtract = randomNumber1 - randomNumber2;
			System.out.println("The correct answer will be " + subtract);
			break;
		// ask the user for the product of the two numbers. Display whether or
		// not the user got the question correct
		case multiplication:
			System.out.println(randomNumber1 + " * " + randomNumber2 + " = ?");
			System.out.println("Enter your solution: ");
			int userAnswer2 = in.nextInt();
			System.out.println("Your solution for the product of the two numbers was " + userAnswer2);
			int multiply = randomNumber1 * randomNumber2;
			System.out.println("The correct answer will be " + multiply);
			break;
		// randomly choose which math operation (addition, subtraction, or
		// multiplication) to perform on those two numbers
		case random:
			switch (randomValue) {
			case 1:
				int add = randomNumber1 + randomNumber2;
				System.out.println(randomNumber1 + " + "+ randomNumber2 + " = " + add);
				break;
			case 2:
				int subt = randomNumber1 - randomNumber2;
				System.out.println(randomNumber1 + " - "+ randomNumber2 + " = " + subt);
				break;
			case 3:
				int mult = randomNumber1 * randomNumber2;
				System.out.println(randomNumber1 + " * "+ randomNumber2 + " = " + mult);
				break;
			}
		}
	}
}
