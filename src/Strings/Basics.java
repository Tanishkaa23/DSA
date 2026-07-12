package Strings;

public class Basics {
    public static void main(String[] args) {

        String str="hello";


        //print all the characters

        //count length without length()
        int count = 0;

        //vowel count
        int vcount = 0;

        for(char i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            count+=1;
            System.out.println(ch);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vcount+=1;
            }
        }

        System.out.println(count);
        System.out.println("vowelCount : "+vcount);

        //reverse a string

        //hey => yeh
        char[] ch = str.toCharArray(); //[y, e, h]
        int start =0;
        int end=str.length()-1;

        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        String reversed = new String(ch);
        System.out.println(reversed);
    }
}
