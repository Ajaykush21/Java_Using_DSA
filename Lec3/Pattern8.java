package Lec3;
import java.util.*;
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int space1=0;
		int space2=n-2;
		int star=1;
		int row=1;
		while(row<=n){
			//space 1
			int i=1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			//star
			System.out.print("* ");
			int j=1;
			while(j<=space2) {
				System.out.print("  ");
				j++;
			}
			if(row==(n/2)+1) {
			System.out.print("  ");
			}
			else {
				System.out.print("* ");
			}
            if(row<=(n/2)) {
            	space1++;
    			space2-=2;
			}else {
				space1--;
				space2+=2;
			}
			row++;
			System.out.println();
			
		}
		

	}

}
