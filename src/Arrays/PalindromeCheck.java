package Arrays;

public class PalindromeCheck {
    public static void main(String[] args) {

        int []arr = {1,2,2,1};

        int start = 0;
        int end = arr.length-1;
        Boolean isPalindrome = true;

        while(start<end){
            if(arr[start]!=arr[end]){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(isPalindrome);
    }
}
