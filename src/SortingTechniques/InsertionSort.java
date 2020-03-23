package SortingTechniques;

import java.util.Random;

public class InsertionSort 
{
	public static Integer[] sort(Integer[] arr)
	{
		int length = arr.length;
		
		for(int i=1;i<length;i++)
		{
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
		
		return arr;
	}
	
	public static void main(String args[])
	{
		Random random = new Random();
		Integer arr[] = new Integer[100];
		for(int i=0;i<100;i++)
		{
			arr[i] = random.nextInt(100);
		}
		/*for(int i = 0;i<100;i++)
		{
			System.out.print(arr[i]+ " ");
		}*/
		
		
		Integer sortedArr[] = sort(arr);
		
		for(int i =0;i<sortedArr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
