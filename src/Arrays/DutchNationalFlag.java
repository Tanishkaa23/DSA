package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {

        int [] arr = {2,1,0};
        //[000111222]

        int low=0;
        int mid=0;
        int high= arr.length-1;
        int temp;

        while(mid<=high){
            if(arr[mid]==0){
                temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid]=temp;

                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
