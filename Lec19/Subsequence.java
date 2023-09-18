package Lec19;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		PrintSubseq(str, "");

	}

	public static void PrintSubseq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = ques.charAt(0);// a
		PrintSubseq(ques.substring(1), ans);
		PrintSubseq(ques.substring(1), ans + ch);

	}

}
