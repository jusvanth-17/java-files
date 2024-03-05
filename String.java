1.String-count the vowels

Write a C program to count the number of vowels in the given string. INPUT & OUTPUT FORMAT: Input consists of 1 string. Output print the number of Vowels.

Example 1:

Input: 

 
ace


Output:

Number of vowels: 2 

import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner m = new Scanner(System.in);
        String s = m.next(); 
        int vowelcount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelcount++;
            }
        }
        System.out.println("Number of vowels: "+vowelcount);
    }
} 