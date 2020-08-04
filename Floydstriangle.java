package java30;

import java.util.Scanner;

public class Floydstriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int input,rows=7,count;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the input no");
   input= scan.nextInt();
   System.out.println("Floyds triangle");
   System.out.println("***************");
   for(count=1;count<=rows;count++)
   {
	   for(int j=1;j<=count;j++)
	   {
	   System.out.print(input + " ");
	   input++;
   }
	   System.out.println();
	   scan.close();
   }
   
   
    
		
	}

}
