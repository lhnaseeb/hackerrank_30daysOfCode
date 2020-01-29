import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
Objective
In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird

 */
public class Solution {

    public String weird_notWeird(int N){
        int odd_even_ = N % 2;

        if (odd_even_ == 1)
        {
            return "Weird";
        }
        else if((odd_even_ == 0) && (2<= N )&& (N<=5))
        {
            return "Not Weird";
        }
        else if((odd_even_ == 0) && (6<= N) && (N<=20))
        {
            return "Weird";
        }
        else if((odd_even_ == 0) && (N > 20))
        {
            return "Not Weird";
        }
        else{
            return "";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Solution sol = new Solution();
        System.out.println(sol.weird_notWeird(N));
     
        scanner.close();
    }
}
