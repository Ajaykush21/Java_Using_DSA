package Lec14;
import java.util.*;
public class Ques_Wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [] [] arr={
		 *                {1,2, 3,4},
		 *                {5,6,7,8},
		 *                {9,10,11,12}};*/
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][] arr=new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();				
			}
		}



	}
	public static void Wave(int [][]arr) {
		for(int i=0;i<arr[0].length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[j][i]+", ");		
				}
				
			}
			else {
				for(int j=arr.length-1;j>=0;j--) {
					System.out.print(arr[j][i]+", ");		
				}
				
			}
			
			
		}
		System.out.print("END");

		
	}

}
