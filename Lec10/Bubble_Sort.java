package Lec10;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,0,1,0,1,0,1};
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}

	}
	public static void Sort(int [] arr) {
		for(int i=1;i<arr.length;i++) {// number of turn
			//working
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}

}
