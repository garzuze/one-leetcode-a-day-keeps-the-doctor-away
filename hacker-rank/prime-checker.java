import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
class Prime {
    void checkPrime(int... n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            if (isPrime(n[i])) {
                sb.append(n[i]);
                sb.append(" ");
            }
        }
        
        System.out.println(sb.toString().trim());
    }
    
    boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; (int) i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
class Solution {

    public static void main(String[] args) {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int n3=Integer.parseInt(br.readLine());
        int n4=Integer.parseInt(br.readLine());
        int n5=Integer.parseInt(br.readLine());
        Prime ob=new Prime();
        ob.checkPrime(n1);
        ob.checkPrime(n1,n2);
        ob.checkPrime(n1,n2,n3);
        ob.checkPrime(n1,n2,n3,n4,n5);    
        Method[] methods=Prime.class.getDeclaredMethods();
        Set<String> set=new HashSet<>();
        boolean overload=false;
        for(int i=0;i<methods.length;i++)
        {
            if(set.contains(methods[i].getName()))
            {
                overload=true;
                break;
            }
            set.add(methods[i].getName());
            
        }
        if(overload)
        {
            throw new Exception("Overloading not allowed");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}

