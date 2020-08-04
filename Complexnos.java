package java30;

import java.util.Scanner;

public class Complexnos {

	double real,img;
	public Complexnos(double d, double e) {
		// TODO Auto-generated constructor stub
		real= d;
		img=e;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,d;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the real part of first no");
		a=scan.nextDouble();
		System.out.println("Enter the img part of first no");
		b=scan.nextDouble();
		System.out.println("Enter the real part of second no");
		c=scan.nextDouble();
		System.out.println("Enter the img part of second no");
		d=scan.nextDouble();
		Complexnos c1= new Complexnos(a,b);
		Complexnos c2= new Complexnos(c,d);
		Complexnos temp=sum(c1,c2);
		System.out.println("the sum of the complex nos is " +temp.real+"+"+temp.img+"i");
	    scan.close();
	}



	private static Complexnos sum(Complexnos c1, Complexnos c2) {
		// TODO Auto-generated method stub
		Complexnos temp1= new Complexnos(0,0);
		 temp1.real =c1.real+ c2.real;
		 temp1.img=c1.img+c2.img;
		return temp1;
	}

}
