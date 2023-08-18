package Lec3;
import java.util.*;
public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int num=n;
		
		while(row<=n) {
			int i=1;
			int count=n;
			while(i<=num) {
				
				System.out.print(count + " ");
				i++;
				count--;
			}
			row++;
			System.out.println();
			
		}
		

	}

}
