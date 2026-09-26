import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long y) {
        Map<Long, Long> l = new HashMap<>();
        Map<Long, Long> r = new HashMap<>();
    
        long result = 0L;
        for (Long x : arr) {
            r.put(x, r.getOrDefault(x, 0L) + 1);
        }
        
        for (Long x : arr) {
            r.put(x, r.get(x) - 1);
            if (y == 0L && x == 0L) {
                Long before = l.getOrDefault(0L, 0L);
                Long after = r.getOrDefault(0L, 0L);
                    
                result += before * after;
            } else {
                if (x % y == 0) {
                    Long before = l.getOrDefault(x / y, 0L);
                    Long after = r.getOrDefault(x * y, 0L);
                    
                    result += before * after;
                }
            }
            l.put(x, l.getOrDefault(x, 0L) + 1);
        }
        
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
