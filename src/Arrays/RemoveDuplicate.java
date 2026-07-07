package Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        //remove duplicate in sorted array and return first k elem

        int arr[] = {1,2,2,3,3}; // => {1,2,3} =3

        System.out.println(Arrays.toString(arr));

        int k=0;

        for(int i = 0; i < arr.length-1; i++){
             if(arr[i]!=arr[i+1]){
                 arr[k]=arr[i];
                 k++;
             }
        }
        arr[k]=arr[arr.length-1];
        k++;

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
