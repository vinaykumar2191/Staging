package staging_area.Array_Problems;

import java.util.Scanner;

public class RotatedArray {

	
	public static void rotateArr(int[] arr, int k) {
		int n = arr.length;
		k = k%n;
		
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
	}
	
	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements into array : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter number of rotations : ");
		int k = sc.nextInt();
		
		rotateArr(arr, k);
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		sc.close();
	}
}
