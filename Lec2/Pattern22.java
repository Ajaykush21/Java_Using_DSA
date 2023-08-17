package Lec2;
import java.util.*;
public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		int space=-1;
		
		while(row<=n) {
			//star
			int k=1;
			
			while(k<=star) {
				System.out.print("* ");
				k++;
				
			}//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			
			}//star
			int j=1;
			if(row==1) {
				j=2;
			}
			while(j<=star) {
				System.out.print("* ");
				j++;
			}//next line prepration
			row++;
			star--;
			space+=2;
			System.out.println();
		}

	}

}
