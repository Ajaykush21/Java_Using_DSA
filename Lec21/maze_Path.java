package Lec21;

public class maze_Path {
	static int count =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int m=3;
		
		printpath(0,0,n-1,m-1,"");
		System.out.println("\n"+count);
		

	}
	public static void printpath(int cr ,int cc, int er ,int ec ,String ans) {
		
		if(cr==er && ec==cc) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		if(cr>er || cc>ec) {
			return ;
		}
		
		printpath(cr+1,cc,er,ec,ans+"V");
		printpath(cr,cc+1,er,ec,ans+"H");
		
		
	}

}
