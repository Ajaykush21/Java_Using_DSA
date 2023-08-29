package Lec13;
import java.util.*;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int []arr= {2,5,8,9,12,14,15,16,17};
		System.out.println(Search(arr,15));

	}
	public static int Search(int []arr,int item) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]<item) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}

}
