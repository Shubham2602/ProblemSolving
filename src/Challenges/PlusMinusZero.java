package Challenges;
import java.math.*;
import java.util.*;

public class PlusMinusZero 
{
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	int plus=0,minus=0,zeros=0;
    	
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>0) plus++;
    		else if(arr[i]<0) minus++;
    		else zeros++;
    	}
    	
    	BigDecimal bd1 = new BigDecimal(Double.toString((double)plus/arr.length));
        bd1 = bd1.setScale(6, RoundingMode.HALF_UP);
    	System.out.println(bd1);
    	BigDecimal bd2 = new BigDecimal(Double.toString((double)minus/arr.length));
        bd2 = bd2.setScale(6, RoundingMode.HALF_UP);
    	System.out.println(bd2);
    	BigDecimal bd3 = new BigDecimal(Double.toString((double)zeros/arr.length));
        bd3 = bd3.setScale(6, RoundingMode.HALF_UP);
    	System.out.println(bd3);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Start : ");
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        PlusMinusZero.plusMinus(arr);

        scanner.close();
    }
}
