package Lec10;

public class Array_Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,1,2,8,9,10};
		Reverse(arr,2,6);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Reverse(int [] arr,int i,int j) {
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}

	}

}
