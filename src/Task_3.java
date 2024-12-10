import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Task_3 {
	// Sorry I went a bit crazy on that task

	public static void main(String[] args) {
		int mainMenuSelection = 1;
		Scanner inScanner = new Scanner(System.in);

		while (mainMenuSelection > 0) {  // Showing main menu where you can choose between Vector or stack demo
			System.out.println("Please choose what you want to do : ");
			System.out.println("1. See Vector at work");
			System.out.println("2. See Stack at work");
			System.out.println("0. Exit");
			if (inScanner.hasNextInt()) { // Make sure the user entered an integer
				mainMenuSelection = inScanner.nextInt();
				if (mainMenuSelection == 1) {
					demoVector(inScanner);
				}
				else if(mainMenuSelection == 2) {
					demoStack(inScanner);
				}
				else if (mainMenuSelection == 0) {
					System.out.println("Exiting....");
					return;
				}
				else {
					System.out.println(mainMenuSelection + " was not one of the options");
				}
			} else {
				System.out.println("Wrong, try again!!!!!");
				inScanner.next();
			}
			

		}
		
		inScanner.close();

	}

	private static void demoStack(Scanner inScanner) {
		int quit = 1;


		
		Stack<Integer> demoNumber = new Stack<Integer>();


		int userInput;
		while ( quit > 0) {
			int[] numberList = randomArray(10, 20);
			for (int i = 0; i < 10; i++) {
				demoNumber.add(numberList[i]);
			}
			System.out.println("Here is a list of 10 random numbers : ");
			printStack(demoNumber);
			System.out.print("Please enter a number to add to the list :");
			if (inScanner.hasNextInt()) {
				userInput = inScanner.nextInt();
			}
			else {
				System.out.println("Please enter a valid number");
				continue;
			}
			demoNumber.push(userInput);
			printStack(demoNumber);
			System.out.println("Removing this number with a pop operation : " + demoNumber.pop() );
			printStack(demoNumber);
			System.out.println("Removing this number with a remove first operation : " + demoNumber.removeFirst());
			printStack(demoNumber);
			System.out.println("Emptying stack");
			demoNumber.clear();
			printStack(demoNumber);
			System.out.println("-------------------------");
			System.out.println("Type anything to go to main menu or 1 to try again");
			if (inScanner.hasNextInt()) {
				if (inScanner.nextInt() == 1) {
					continue;
				}
			}
			quit = 0;
	
		}
		
	}


	private static void demoVector(Scanner inScanner) {
		int result ;
		int[] numberList = randomArray(50, 100);

		Vector<Integer> numbers = new Vector<Integer>();
		do  {
			System.out.println("Enter a number from 1 to 50 to see the capacity and size of a vector");
			System.out.println("Enter 0 to go back to the main menu");
			try {

				result = inScanner.nextInt();
				if (result < 0 || result > 50) {
					System.out.println("Please only enter a number from 1 to 50, try again");
					result = 1;
					continue;
				}
				if(result == 0) {
					System.out.println("Back to main menu");
					continue;
				}
				
				for (int i = 0; i < result; i++) {
					numbers.add(numberList[i]);
				}
				System.out.print("Here is a list of random generated numbers : ");
				for (int number: numbers) {
					System.out.print(number + " ");
				}
				System.out.println("\n Capacity of vector :" + numbers.capacity());
				System.out.println(" Size of vector :" + numbers.size());
				System.out.println("-----------------------------------");
				numbers.clear();
			}
			catch (InputMismatchException e) {
				System.out.println("\nWrong input, only integer from 1 to 50 are allowed");
				result = 1;
				inScanner.next();
			}
		} while (result > 0);

	}
	private static <E> void  printStack(Stack<E> toPrint) {
		for (E number: toPrint) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
	private static int[] randomArray(int size, int range) {
		int[] numberList = new int[size];
		Random random = new Random();
		for (int i=0; i<size; i++) {
			numberList[i] = random.nextInt(range);
		}
		return numberList;
	}

}
