package day2_array;

import java.util.Arrays;

public class Sorting_Array {

	public static void main(String[] args) {
		int arr[] = { 12, 31, 10, 22, 10, 23, 43, 56, 99, 21, 2 };
		int temp=0;
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		//Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			i+=count-1;
			System.out.println(arr[i]+"  "+count);
		}
	}
	


}
