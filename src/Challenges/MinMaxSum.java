package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum 
{
	
	static void miniMaxSum(int[] arr) {
		long min=0,max=0;
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		for(int i=0;i<arr.length;i++) {System.out.print(arr[i] + " ");}
		System.out.println();
		for(int i=0;i<arr.length-1;i++) {
			min = min + arr[i];
			System.out.println(min);
			
		}
		for(int i=1;i<arr.length;i++) {
			max= max + arr[i];
			System.out.println(max);
			
		}
			
		System.out.println(min + " " + max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
