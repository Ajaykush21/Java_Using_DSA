package Lec4;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int reverse = 0;
		while (n != 0) {
			int rem = n % 10;
			reverse =(reverse*10)+rem;
			
			n = n / 10;
		}
		System.out.println(reverse);
	}

}
