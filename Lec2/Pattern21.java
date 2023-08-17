package Lec2;
import java.util.*;
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=(2*n-3);
		int row=1;
		while(row<=n) {
			// star
			int j=1;
			while(j<=star) {
			System.out.print("* ");
			j++;
						}
			
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			
			}
			// star
			
			int k=1;
			if(row==n) {
				 k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			row++;
			space-=2;
			star++;
			System.out.println();
			
		}

	}

}
