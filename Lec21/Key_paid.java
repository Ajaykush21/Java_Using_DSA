package Lec21;

public class Key_paid {
static String [] key = {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="129";
		keypaid(str,"");

	}
	public static void keypaid(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return ;
		}
		
		char ch = ques.charAt(0);//'1'
		String s=key[ch-48];
		for(int i=0;i<s.length();i++) {
			keypaid(ques.substring(1),ans+s.charAt(i));
		}
		
		}

}
