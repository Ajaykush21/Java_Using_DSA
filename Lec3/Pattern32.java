package Lec3;
import java.util.*;
public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int num=1;
		int count=1;
		while(row<=n*2-1) {
			int i=1;
			
			while(i<=num) {
				if(i%2==0) {
					System.out.print("* ");
				}else {
					System.out.print(count+ " ");
				}
				
				i++;
			}
			System.out.println();
			row++;
			
			if(row<=n) {
				num+=2;
				count++;
			}
			else {
				num-=2;
				count--;
			}
			
		}
		
		}

}
