package Arrays;

import java.util.Arrays;

public class Square {
    public static void main(String[] args) {
        int[] arr ={-7,-3,2,5};

        int start=0;
        int end= arr.length-1;

        int[] result = new int[arr.length]; // [     25 ,49]

        int write = result.length-1;

        while(start<=end){

            int start_int = Math.abs(arr[start]);
            int end_int = Math.abs(arr[end]);

            if(start_int>end_int){

                result[write]=start_int*start_int;
                write--;
                start++;

            }

            else {
                result[write] = end_int*end_int;
                write--;
                end--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
