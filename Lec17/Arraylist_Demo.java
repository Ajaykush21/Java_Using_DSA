package Lec17;

import java.util.ArrayList;

public class Arraylist_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
//add
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		// add at index
		ll.add(1, 50);//index ka range 0 to size
		System.out.println(ll);
//size
		System.out.println(ll.size());
		// get
		System.out.println(ll.get(2));//index ka range 0 to size -1
		//remove
		System.out.println(ll.remove(2));
		System.out.println(ll);
		//update
		ll.set(1, -1);
		System.out.println(ll);
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		// for each loop//
		for(int i : ll) {
			System.out.print(i+" ");
			
		}
		

	}

}
