package Lec5;

import java.util.*;

public class Dec_to_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1;
		int sum = 0;

		while (n > 0) {
			int rem = n % 2;
			sum = sum + (rem * mul);
			mul = mul * 10;
			n = n / 2;
		}
		System.out.println(sum);

	}

}
