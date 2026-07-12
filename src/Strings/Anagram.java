package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        //anagrams are the strings that have same frequency of each character but order does.nt matter

        String s = "listen"; //[e, i, l, n, s, t ]
        String t = "sanent";

        //both string length should be equal
        if(s.length()!=t.length()){
            System.out.println("Strings of different lengths cannot be anagrams");
            return;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if(Arrays.equals(sArr, tArr)){
            System.out.println("ANAGRAM");
        }else{
            System.out.println("NOT AN ANAGRAM");
        }
    }
}
