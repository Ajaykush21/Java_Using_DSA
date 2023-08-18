package Lec3;

import java.util.*;

public class For_loop33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int val = num - i + 1;
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (i == 1) {
					System.out.print(0 + " ");
				} else {
					if (k <= (2 * i - 1) / 2) {
						System.out.print(val + " ");
						val++;
					}

					if (k == ((2 * i - 1) / 2) + 1) {

						System.out.print(0 + " ");
						val--;
					}
					if (k > ((2 * i - 1) / 2) + 1) {
						System.out.print(val + " ");
						val--;
					}

				}

			}
			System.out.println();
		}

	}
}
