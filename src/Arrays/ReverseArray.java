package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Reverse an array

        int arr[] = {1,2,3,4};
        int start = 0; //initial index of array
        int end = arr.length-1; //last index of array
        int temp = 0; //temporary variable

        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));




    }
}
