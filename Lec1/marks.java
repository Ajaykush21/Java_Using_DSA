package Lec1;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=66;
		if(marks>=75) {
			System.out.println("A grade");
		}
		else if( marks>=65 && marks<75) {
			System.out.println("B grade");
		}
		else if(marks>=55 && marks<65) {
			System.out.println("C grade");
		}
		else if (marks>=45 && marks<55) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
 
	}

}
