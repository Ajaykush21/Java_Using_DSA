package Lec15;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Bye";
		String str1="Bye";
		System.out.print(equals(str,str1));

	}
	public static boolean equals(String str, String str1) {
		if(str==str1) {
			return true;
		}
		if(str.length()!=str1.length()) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str1.charAt(i)) {
				return false;
			}
		}
		return true;
		
	}

}
