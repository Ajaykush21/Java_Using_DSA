package Lec12;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, 1 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			InsertPosition(arr, i);
		}

	}

	public static void InsertPosition(int[] arr, int j) {
		int item = arr[j];
		int i = j - 1;
		while (i >= 0 && arr[i] >= item) {
			arr[i + 1] = arr[i];
			i--;
		}
		i++;
		arr[i] = item;

	}

}
