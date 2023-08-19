package Lec4;

import java.util.*;

public class Prime_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				fact++;
			}

		}
		if (fact == 0) {
			System.out.print("Prime");
		} else {
			System.out.print("Not Prime");
		}

	}

}
