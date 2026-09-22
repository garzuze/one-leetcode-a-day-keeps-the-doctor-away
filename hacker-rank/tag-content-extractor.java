import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        List<String> data = new ArrayList<>();
        
		while(testCases>0){
			String line = in.nextLine();
            data.add(line);    
			testCases--;
		}
        
        Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
        
        for (String s : data) {
            boolean found = false;
            Matcher matcher = p.matcher(s);
            
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }
            
            if (!found) {
                System.out.println("None");
            }
        }
	}
}



