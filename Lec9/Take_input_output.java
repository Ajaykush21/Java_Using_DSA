package Lec9;

import java.util.*;

public class Take_input_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];// creation of array
		// input
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}
