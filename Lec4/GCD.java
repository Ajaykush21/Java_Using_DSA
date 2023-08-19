package Lec4;

import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int divident = sc.nextInt();
		System.out.print("Enter Second number: ");
		int divisor = sc.nextInt();
		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;

		}
		System.out.println("The GCD of two numbers :" + divisor);

	}

}
