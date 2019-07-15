package day6;

import java.util.Scanner;

public class operation {

	private static int color;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sncr = new Scanner(System.in); 
		
		
		int color = 15;
		int blue = 14;
		int yellow = 12;
		
		double bananna = 1.2;
		double computer = 1.5;
		double basics = 1.1;
		
		System.out.println("welcome to coding");
		
		System.out.println("enter a number");
		
		
		color = sncr.nextInt();
		System.out.println("enter a number");
		
		blue = sncr.nextInt();
		yellow = color+ blue;
		System.out.println(yellow);
		
		System.out.println("this the differnce");
		color = blue - yellow;
		System.out.println(blue);
		
		 System.out.println("this is the quotion");
		 color= yellow/blue;
		System.out.println(color);
		
		System.out.println("this is the product");
		blue= color*yellow;
		System.out.println(blue);
	
		System.out.println("enter a number");
		bananna = sncr.nextDouble();
		
		System.out.println("enter a number");
		computer = sncr.nextDouble();
		
		bananna = computer+ basics;
		System.out.println(bananna);
		
		System.out.println("this is the difference");
		computer= basics+ bananna;
		System.out.println(basics);
		
		System.out.println("this is the quotion");
		basics= computer/ bananna;
		System.out.println(basics);
		
		System.out.println("this is the product");
		computer= bananna* basics;
		System.out.println(computer);
		sncr.close();
		
				
		
		
		
		
				
		
		
				
		
	
		
		
		
	}

}
