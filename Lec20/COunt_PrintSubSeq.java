package Lec20;

public class COunt_PrintSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		PrintSubseq(str, "");
		//
		System.out.println(count);

	}
     static int count=0;
	public static void PrintSubseq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		char ch = ques.charAt(0);// a
		PrintSubseq(ques.substring(1), ans);
		PrintSubseq(ques.substring(1), ans + ch);


	}

}
