package Lec3;

import java.util.*;

public class hackr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		int space = n - 1;
		while (row <= n * 2 - 1) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;

			}
			int j = 1;
			int count = row;
			int m = count;
			if (row > n) {
				count = 2 * n - row;
			}
			while (j <= star) {
				System.out.print(count + " ");

				if (j >= star / 2 + 1) {
					count--;

				} else {
					count++;

				}

				j++;

			}
			if (row < n) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}
			row++;
			System.out.println();
		}

	}

}
