package Lec18;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		System.out.println(Power(a, b));
	}

	public static int Power(int a, int b) {
		if (b == 0 ) {
			return 1;
		}
		int p = Power(a, b - 1);
		return p * a;

	}
}
