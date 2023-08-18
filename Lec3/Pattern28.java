package Lec3;
import java.util.*;
public class Pattern28 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			int num=1;
			int space=n-1;
			int row=1;
			
			while(row<=n) {
				int i=1;
				//space
				while(i<=space) {
					System.out.print("  ");
					i++;
				}
				//num
				int j=1;
				int count=row;
				while(j<=num) {
					System.out.print(count +" ");
					if(j<(num/2)+1) {
						count++;
					}
					else {
						count--;
					}
					j++;
				
					}
				
				num+=2;
				space--;
				row++;
				System.out.println();
				}
				
				
				
			}
		}


