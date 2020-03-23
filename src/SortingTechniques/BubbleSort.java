package SortingTechniques;

public class BubbleSort 
{
	static int arr[] = {34,23,53,12,9,4};
	public static void main(String[] args) {
		
		System.out.println("Before : \n");
		BubbleSort.printArray(arr);
		
		BubbleSort.sort(arr);
		System.out.println("After : \n");
		BubbleSort.printArray(arr);
		
	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	private static void sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j = 0; j<arr.length-1;j++) 
			{
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
