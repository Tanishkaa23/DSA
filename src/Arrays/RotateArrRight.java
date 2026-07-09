package Arrays;

import java.util.Arrays;

public class RotateArrRight {

    public static void reverse(int []arr, int start, int end) {

        while(start<end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {

        int []arr = {11,12,13,14,15,16,17,18,19,20,21,22,23,24,25}; //{14,15,11,12,13}
        int k = 72;

        k %= arr.length; //2

        reverse(arr,arr.length-k, arr.length-1); //k element reverse
        reverse(arr, 0, arr.length-1-k); // remaining elem rev
        reverse(arr, 0, arr.length-1); //complete arr rev

        System.out.print(Arrays.toString(arr));
    }

}
