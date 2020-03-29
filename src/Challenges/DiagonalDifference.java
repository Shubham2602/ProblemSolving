package Challenges;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class DiagonalDifference 
{
	public static int diagonalDifference(List<List<Integer>> arr) {
		
			int primaryDiag =0;
			int secondaryDiag = 0;
			int size = arr.size();
			for(int i=0;i<size;i++) {
				primaryDiag += arr.get(i).get(i);
				secondaryDiag += arr.get(i).get(size-i-1);
			}
	        return Math.abs(primaryDiag-secondaryDiag);
    }
	public static void main(String[] args) throws IOException {
		System.out.println("Enter number of lines : ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = DiagonalDifference.diagonalDifference(arr);

        System.out.println("Result : " + result);
        bufferedReader.close();
   
    }
}
