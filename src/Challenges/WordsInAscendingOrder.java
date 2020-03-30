package Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class WordsInAscendingOrder 
{
	public static String arrange(String sentence) {
        sentence = sentence.replace(".", "").trim();
		String[] words = sentence.split(" ");
		for(String word : words) {
			word = word.toLowerCase();
		}
		Comparator<String> lengthComparator = new Comparator<String>() {
    		@Override    
			public int compare(String o1, String o2) {
        		return Integer.compare(o1.length(), o2.length());
    		}
		};
		
		Arrays.sort(words, lengthComparator);
		
		String sent = "";
        for(int i=0;i<words.length;i++) {
        	sent = sent + words[i].toLowerCase() + " ";
        }
		sent = sent.trim()+".";
		sent = sent.replace(sent.substring(0,1), sent.substring(0,1).toUpperCase());
		
		return sent;
    }
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        

        String sentence = bufferedReader.readLine();

        String result = WordsInAscendingOrder.arrange(sentence);

        System.out.println(result);
        bufferedReader.close();
        
    }
}
