package Lec16;

public class Compare_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Kunal";
		String s2="Komal";
		System.out.println(compare(s1,s2));
		System.out.println(s1.compareTo(s2));//inbuilt compare function

	}
	public static int compare(String s1,String s2) {
		
		int min=Math.min(s1.length(), s2.length());
		for(int i=0;i<min;i++){
			if(s1.charAt(i) > s2.charAt(i)) {
				return s1.charAt(i)- s2.charAt(i) ;
				
			}
			else if(s1.charAt(i) < s2.charAt(i)) {
				return s1.charAt(i)- s2.charAt(i) ;
			}
		}
		return s1.length()-s2.length();
		
	}

}
