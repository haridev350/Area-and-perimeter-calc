package com.hari.apcalc;
import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		double b,c,d;
		System.out.println("Welcome to Area and perimeter calc v1.1");
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
			System.out.println("Wrong Choice");
		}

	}

}
