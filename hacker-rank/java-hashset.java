import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        StringBuilder sb = new StringBuilder();
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < t; i++) {
            sb.append(pair_left[i]);
            sb.append(" ");
            sb.append(pair_right[i]);
            seen.add(sb.toString());
            sb.setLength(0);
            System.out.println(seen.size());
        }
        

   }
}
