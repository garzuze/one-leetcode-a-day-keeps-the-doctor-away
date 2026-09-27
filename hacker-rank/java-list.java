import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        String nums = sc.nextLine();
        String[] numsArr = nums.split(" ");
        List<Integer> list = new ArrayList<>(n);
        
        for (String s : numsArr) {
            list.add(Integer.parseInt(s));
        }
        
        int queries = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < queries; i++) {
            String op = sc.nextLine();
            if (op.equals("Insert")) {
                String numsOp = sc.nextLine();
                String[] nOpArray = numsOp.split(" ");
                list.add(Integer.parseInt(nOpArray[0]), Integer.parseInt(nOpArray[1]));
            } else {
                String numOp = sc.nextLine();
                list.remove(Integer.parseInt(numOp));
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
