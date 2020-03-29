package Challenges;

import java.io.BufferedWriter;
import java.util.Scanner;

public class TimeConversion {
	
static String timeConversion(String s) {
        
        String hr = s.substring(0,2);
        if(s.contains("PM") && Integer.parseInt(hr)!=12) {
        	int hour = Integer.parseInt(hr) + 12;
            s = String.valueOf(hour) + s.substring(2,s.length());
        }
        else if(s.contains("AM")){
        	int hour = Integer.parseInt(hr);
        	if(hour+12==24) s = "00" + s.substring(2,s.length());
        	
        }
        s = s.substring(0,s.length()-2);

        return s;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        String s = scan.nextLine();

        String result = timeConversion(s);

       System.out.println(result);
    }
}
