package Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;

public class GradingProblem 
{
	public static List<Integer> gradingStudents(List<Integer> grades) {
		
		for(int i=0;i<grades.size();i++) {
			if(grades.get(i)>=38) {
				int a = grades.get(i)/5;
				int b = grades.get(i)%5;
				int temp = 5*(a+1);
				if(Math.abs(grades.get(i)-temp)<3) {
					grades.set(i, temp);
				}
			}
		}
		return grades;
	 

	    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = GradingProblem.gradingStudents(grades);

        for(int res : result) {
        	System.out.println(res);
        }
        
        bufferedReader.close();
	}
}
