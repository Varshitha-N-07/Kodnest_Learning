package gradeCheck;

import java.util.Scanner;

public class Main {
	public static void checkGrade(int grade)

	{

	if (grade > 50)
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}		

	}

	public static void main(String[] args)

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the grade of student ");
		int grade = scan.nextInt();
		checkGrade(grade);
		
	}
}
