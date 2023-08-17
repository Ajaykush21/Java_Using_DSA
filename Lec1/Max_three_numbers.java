package Lec1;

public class Max_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=90;
		int b=89;
		int c=98;
		if(a>=b && a>=c ) {
			System.out.println("a is gtreater");
		}
		else {                          
			if(b>=c && b>=a) {
				System.out.println("b is greater");
			}
			else {
				System.out.println("c is greater");
			}
		}

	}

}
