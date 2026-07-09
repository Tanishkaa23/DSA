package Arrays;

import java.util.Arrays;

public class MergeSortedArr {
    public static void main(String[] args) {
        int[] A = {1,4,7};
        int[] B = {3,6,9,12};

        int [] X = new int[A.length+B.length]; //9 [4,5,6,

        int i=0; int j=0; int k=0;

        while(i<A.length && j<B.length){
            if(A[i]<B[j]) {
                X[k]=A[i];
                i++;
                k++;
            }
            else{
                X[k]=B[j];
                j++; k++;
            }
        }

        while (i<A.length){
            X[k]=A[i];
            k++;
            i++;
        }

        while (j<B.length){
            X[k]=B[j];
            k++;
            j++;
        }


        System.out.println(Arrays.toString(X));
    }
}
