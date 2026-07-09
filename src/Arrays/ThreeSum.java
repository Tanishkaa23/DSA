package Arrays;
import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr= {0,0,0}; //a+b+c = 0
        Arrays.sort(arr);

        for(int i=0; i< arr.length-2; i++){

            //Two sum
            int start = i+1;
            int end = arr.length-1;

            while(start<end){
                int curr_sum = arr[i]+arr[start]+arr[end];
                if(curr_sum==0) {
                    System.out.println(arr[i] + " " + arr[start] + " " + arr[end]);
                    start++;
                    end--;
                }
                else if(curr_sum>0) end--;
                else start++;
            }
        }
        System.out.println();
    }


}
