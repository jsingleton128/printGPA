import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		greeting();
		//Get user inputs
		Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter a student record: " );
		
		//Assign inputs to variables
		String studentName = console.next();
		int scoreCount = console.nextInt();
		int scoreSum = 0;
		for (int i = 0; i < scoreCount; i++) {
			scoreSum = scoreSum + console.nextInt();
		}
		
		//Pass inputs into printGPA method
		printGPA(studentName, scoreCount, scoreSum);
		
		console.close();
		
	}
	
	public static void printGPA(String studentName, int scoreCount, int scoreSum) {//Calculates average of scores and prints to screen
		double gpa = (double)scoreSum / (double) scoreCount;
		System.out.println();
		System.out.println(studentName + "'s grade is " + gpa);
	}
	
	public static void greeting() { //prints greeting to screen
		System.out.println("This program will calculate a student's GPA based on user entered data.");
		System.out.println();
		System.out.println("Please enter the following information in one entry (exclude commas):");
		System.out.println("Student Name, number of scores, and individual scores, all separated by spaces.");
	}
}
