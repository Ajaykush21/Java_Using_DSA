package Lec9;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,1,17,5,8};
		System.out.print(max(arr));

	}
	public static int max(int []arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
		
	}

}
