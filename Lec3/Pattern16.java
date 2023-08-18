package Lec3;
import java.util.*;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row =1;
		int star=n;
		int space=n-1;
			while(row<=n*2-1) {
				int i=1;
				//space
				while(i<=space) {
					System.out.print("  ");
					i++;
				}//star
				int j=1;
				while(j<=star) {
					System.out.print("* ");
					j++;
				}
				//next line preparation
				if(row<n) {
					space--;
					star--;
				}else {
					space++;
					star++;
				}
				row++;
				System.out.println();
				
				}
			}

	}


