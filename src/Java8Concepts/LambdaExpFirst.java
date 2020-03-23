package Java8Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LambdaExpFirst 
{
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("for");
		list.add("Apple");
		
		list.forEach(word -> System.out.print(word + " "));
		
		list.forEach(item -> {
			System.out.print(item);
			System.out.print("gap");;
		});
		
		ComparableExample();
		
	}
	
	public static LambdaExpFirst printAnswer()
	{
		System.out.println("Successfully prints answer using basic version of method passed as argument.");
		return new LambdaExpFirst();
	}
	
	public static void comparatorWithLambda()
	{
		String[] words = {"Bye","Adios","Hi","Aloha"};
		
	//	Arrays.sort(words,(s1,s2)-> Integer.compare(arg0, arg1));
	}
	
	public static void ComparableExample(){
		
		int[] intArr = {65,67,66,68};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
	}
}
