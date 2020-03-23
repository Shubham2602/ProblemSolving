package Challenges;

import java.util.HashMap;
import java.util.Map;

class OccurenceOfCharInString { 
    static void characterCount(String inputString) 
    { 
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>(); 
  
        char[] strArray = inputString.toCharArray(); 
  
        for (char c : strArray)
        { 
        	if (charCountMap.containsKey(c))
        	{ 
        		charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else
            { 
                charCountMap.put(c, 1); 
            } 
        } 
  
        for (Map.Entry<Character,Integer> entry : charCountMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    }
    
    public static void jkdfl()
    {
    	String s = "abc";
    	String a1 = new String("abc");
    	
    	if(s.equalsIgnoreCase(a1)) {
    		System.out.println("TRUE");
    	}else {
    		System.out.println("FALSE");
    	}
    }
    
    public static void main(String args[])
    {
    	//OccurenceOfCharInString.characterCount("abcdabcdabcabac");
    	OccurenceOfCharInString.jkdfl();
    }
}