package Strings;

public class Compressstring {
    public static void main(String[] args) {

        String str = "aaaccccccbbbbbb" ;//a3b2

        String ans = "";

        int count =1;

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            if(i < str.length()-1 && curr == str.charAt(i+1)){
                count++;
            }else{
                ans += curr;
                ans += count;
                count=1; //reset to 1
            }
        }

        System.out.println(ans);
    }
}
