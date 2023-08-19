package Lec4;

import java.util.*;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;
//		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}

		}
		if (count == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
