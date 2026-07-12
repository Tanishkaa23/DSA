package Strings;

public class PalindromeString {
    public static void main(String[] args) {

        String str = "hey";

        char[] ch = str.toCharArray(); //[m, a, d, a, m]

        int start = 0;
        int end = ch.length-1;
        boolean isPalindrome = true ;
         while(start<end){

             if(ch[start]!=ch[end]){
                 isPalindrome=false;
                 break;
             }
             start++;
             end--;
         }
        System.out.println(isPalindrome);
    }
}

