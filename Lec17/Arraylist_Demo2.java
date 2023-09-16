package Lec17;
import java.util.*;

public class Arraylist_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		//arraylist input
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<2;i++) {
			ll.add(sc.nextInt());
		}
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
	}

}
