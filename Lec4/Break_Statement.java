package Lec4;

import java.util.Scanner;

public class Break_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = sc.nextInt();
		int i = 2;
		int count = 0;
		while (i < n) {
			if (n % i == 0) {
				count++;
				break;
			}
			i++;
		}
		if (count == 0) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
	}

}
