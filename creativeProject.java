package day9;

import java.util.Scanner;

public class creativeProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner project = new Scanner(System.in);
		
		int basics = 10;
		boolean blue = true;
		double twins = 1.2;
		float pie = 3.14f;
		long money = 100l;
		String pull = "";
		String name = "";
		boolean yellow = true;
		long pink = 200;
		
		System.out.println("welcome to my creative project");
		
		System.out.println("what is your name?");
		name= project.next();//string 
		
		System.out.println("whats your favorite color?");
		pull= project.next();//string
		
		System.out.println("whats your favorite number");
		money= project.nextInt();//number
	
		System.out.println("how old are you?");
		basics = project.nextInt();//number 
		
		System.out.println( name + " favorite color is " + pull);
		System.out.println("her favorite number is " + money);
		System.out.println("she/he is " + basics + " years old ");
		
		long color = money+basics;
		long green = money*basics;
		long purple = money/basics;
		long pink1 = money-basics;
		
		System.out.println("these are your lucky numbers: "
				+color + ", " + green + ", " + purple + ", " + pink1 + "!");
		
		System.out.println("true or false question");
		System.out.println(" do you like sports");
		yellow = project.next() != null;
		
	System.out.println("is our program better");
	yellow = project.next() != null;
		
		System.out.println("enter a number to see a magic trick");
		int color1= project.nextInt();
	 
	  
		for (int x=color1; x<100; x++) {
			
			if (color1>2) {
				System.out.println(x);
			
				
		project.close();
				
				
				
				
				
			}
		}
		
			
			
				
				
				
			}
			
		
		
		
		
				
	
		
		
		
		
		
		
	}


