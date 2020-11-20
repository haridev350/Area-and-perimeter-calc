//calc.java
//@author haridev350
package com.hari.apcalc;
import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v;
		System.out.println("Welcome to Area and Perimeter Calc v1.3");
		System.out.println("How do you wish to calculate? 1(normal number) 2(Decimal number)");
		v = sc.nextInt();
		if (v == 1)
		{
			int a, b,c,d;
			System.out.println("Enter your choice : 1(area) , 2(perimeter)");
			a =sc.nextInt();
			if (a == 1)
			{
				System.out.println("Enter length :");
				b = sc.nextInt();
				System.out.println("Enter breadth :");
				c =sc.nextInt();
				d = b*c;
				System.out.println("The area is : " + d+"cm");
			}
			else if (a == 2)
			{
				System.out.println("Enter length :");
				b = sc.nextInt();
				System.out.println("Enter breadth :");
				c =sc.nextInt();
				d = 2*(b+c);
				System.out.println("The perimeter is : " + d+ "cm");
			}
			else 
			{
				System.out.println("Wrong Choice. Please enter the correct one!");
			}
		}
		else if (v == 2)
		{
			
			int a;
			double b,c,d;
			System.out.println("Enter your choice : 1(area) , 2(perimeter)");
			a =sc.nextInt();
			if (a == 1)
			{
				System.out.println("Enter length :");
				b = sc.nextDouble();
				System.out.println("Enter breadth :");
				c =sc.nextDouble();
				d = b*c;
				System.out.println("The area is : " + d+"cm");
			}
			else if (a == 2)
			{
				System.out.println("Enter length :");
				b = sc.nextDouble();
				System.out.println("Enter breadth :");
				c =sc.nextDouble();
				d = 2*(b+c);
				System.out.println("The perimeter is : " + d+ "cm");
			}
			else 
			{
				System.out.println("Wrong Choice . Please enter the correct one!");
			}
		}
		else
		{
			System.out.println("Wrong Choice. Please enter the correct one!");
		}
		
		sc.close();

	}

}
