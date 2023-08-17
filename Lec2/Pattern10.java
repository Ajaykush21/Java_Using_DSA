package Lec2;
import java.util.*;
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int star=n+4;
		int space= 0;
		while(row<=n) {
			int i=1;
			//star
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			space+=1;
			star-=2;
			System.out.println();
			row++;
			
			
		}
		

	}

}
