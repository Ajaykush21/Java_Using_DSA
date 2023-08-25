package Lec9;
import java.util.*;
public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		//
		//int arr[]=null;
		//int []arr;
		int arr[]=new int[5];
		System.out.println(a);
		System.out.println(arr);
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
			}
		//print
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		//System.out.println(arr[3]);
		//System.out.println(arr[4]);
		System.out.println("***********");
		//update
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		//System.out.println(arr[3]);
		//System.out.println(arr[4]);
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
			}
		
		
		
	}

}
