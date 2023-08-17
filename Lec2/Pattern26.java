package Lec2;
import java.util.*;
public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int num=1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
			System.out.print("  ");
			i++;
			
		}
		int j=1;
		while(j<=num) {
			System.out.print(j+" ");
			j++;
		}
		row++;
		space--;
		num+=2;
		System.out.println();
		

	}

}}
