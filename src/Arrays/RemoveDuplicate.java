package Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        //remove duplicate in sorted array and return first k elem

        int arr[] = {1,2,2,3,3,3,3,3,4,4,4,5,5,5,6};


        int k=1;

        for(int i = 1; i < arr.length-1; i++){
             if(arr[i]!=arr[i-1]){
                 arr[k]=arr[i];
                 k++;
             }
        }
//        arr[k]=arr[arr.length-1];
//        k++;
        //special case/handling when used [i+1]

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
