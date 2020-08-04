package java30;

import java.util.Scanner;

public class QuoandRem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,quo,rem;
		System.out.println("Enter the first number");
		Scanner scan =new Scanner(System.in);
		a= scan.nextInt();
		System.out.println("Enter the second number");
		b=scan.nextInt();
		quo= a/b;
		rem=a%b;
		System.out.println("the quotient of the given nos are" + quo);
		System.out.println("the reminder of the given nos are" + rem);
		scan.close();
		
	}

}
