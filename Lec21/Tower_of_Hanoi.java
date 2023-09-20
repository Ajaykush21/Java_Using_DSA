package Lec21;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		printstep(n,"A","B","C");

	}
	public static void printstep(int n,String s,String h,String d) {
		if(n==0) {
			return ;
			
		}
		printstep(n-1,s,d,h);
		System.out.println("Move "+n+"th disc from "+s+" to "+d);
		printstep(n-1,h,s,d);
	}

}
