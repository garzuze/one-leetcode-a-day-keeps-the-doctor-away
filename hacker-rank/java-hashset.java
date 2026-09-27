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
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < t; i++) {
            if (pair_left[i].compareTo(pair_right[i]) < 0) {
                seen.add(pair_left[i] + " " + pair_right[i]);
            } else {
                seen.add(pair_right[i] + " " + pair_left[i]);
            }
            System.out.println(seen.size());
        }
    }
}
