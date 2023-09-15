package Lec16;

public class Print_Substring_lengthWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="7182";
		Print(s);

	}
	public static void Print(String s) {
		for(int len=1;len<=s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				int i=j-len;
				System.out.println(s.substring(i,j));
				
			}
			
		}
		
		
	}

}
