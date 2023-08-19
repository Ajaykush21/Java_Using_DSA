package Lec4;

import java.util.*;

public class Fibbonaci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int i=1;
		while (i <= n) {
			int c = b + a;
			a = b;
			b = c;
			i++;
			System.out.print(a);
		}
		
		

	}

}
