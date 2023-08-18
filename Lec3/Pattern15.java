package Lec3;
import java.util.*;
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int space=0;
		int row=1;
		while(row<=n*2-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<n) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}

	}

}
