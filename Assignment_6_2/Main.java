package Assignment_6_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO code application logic here
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter total number of students");
		int TotalStudents=scanner.nextInt();
		for(int i=0;i<TotalStudents;i++)
		{
			System.out.println("\nEnter which semester Student's Info:");
			int sem=scanner.nextInt();
		System.out.println("enter roll No : ");
		
		int roll=scanner.nextInt();
		System.out.println("enter registration No : ");
		int reg=scanner.nextInt();
		System.out.println("enter student name ");
		String name=scanner.next();
		FirstSemester std1 = new FirstSemester( roll, reg,name);
		
		System.out.println("enter students marks in Subject 1");
		int marks1=scanner.nextInt();
		System.out.println("enter students marks in Subject 2");
		int marks2=scanner.nextInt();
		std1.setMarks(marks1,marks2);
		System.out.println("\nStudent's Info of " +sem +" Semester");
		std1.getSubject();
		std1.showResult();

		}
		scanner.close();
		}
}
