package Lec14;
import java.util.Scanner;
public class Search_a_2D_Matrix_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
	        int m = scn.nextInt();
	        int n = scn.nextInt();
	        int[][] arr=new int[m][n];
	        for (int i=0; i<m; i++){
	               for(int j=0; j<n; j++){
	                     arr[i][j]=scn.nextInt();
	                }
	         }
	         int k = scn.nextInt();
		System.out.println(Search(arr, k));

	}

	public static boolean Search(int[][] arr, int item) {
		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {
			if (arr[row][col] == item) {
				return true;
			} else if (arr[row][col] > item) {
				col--;
			} else {
				row++;
			}
		}
		return false;
	}
}
