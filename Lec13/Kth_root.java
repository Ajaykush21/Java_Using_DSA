package Lec13;
import java.util.*;
public class Kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int k=3;
//		int N=126;
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			int N=sc.nextInt();
			int k=sc.nextInt();
			System.out.println(Kthroot(N,k));
		}
		
		
		
	}
	public static int Kthroot(int N,int k) {
		int low=1;
		int high=N;
		int ans=0;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(Math.pow(mid,k)<=N) {
				ans=mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
		}
		return ans;
	}

}
