package Sept;
import java.util.Scanner;

public class scannerTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);//syntax
		System.out.println("Enter your org name");
		String empname=sc.nextLine();
	
		System.out.println("Your org name is" +empname);
		System.out.println();
		System.out.println("Enter your Salary");
		double salary = sc.nextDouble();
		System.out.println("Your salary is " +salary);
		System.out.println();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Yourage is " +age);
		System.out.println();
		System.out.println("Enter your initial");
		char initial = sc.next().charAt(0);
		System.out.println("Your initial is " +initial);
		System.out.println();
		

	}

}
