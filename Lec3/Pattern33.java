
package Lec3;
import java.util.*;
public class Pattern33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space = n - 1;
		int row = 1;
		int num = n;
		while (row <= n) {
			int csp = 1;
			while (csp <= space) {
				System.out.print("  ");
				csp++;
			}
			int cst = 1;
			int val = num - row + 1;     // (10-2+1=9) isilye num-row+1 lenge
			while (cst <= star) {
				if (row == 1) {
					System.out.print("0 ");
					break;
				} else {
					if (cst <= star / 2) {
						System.out.print(val+" ");
						val++;
					}
					if(cst==star/2 +1) {
					val--;
					System.out.print(0+" ");
					}
					if (cst > star / 2+1) {
						System.out.print(val+" ");
						val--;
					}
					cst++;
				}
			}
			System.out.println();
			star += 2;
			space--;
			row++;
		}

	}

}
