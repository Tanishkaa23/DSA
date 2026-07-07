package Arrays;

import java.util.Arrays;

public class RotateArr {
    public static void main(String[] args) {

        // rotate left by k elements

        // M1 :- store k elem in temp

        int []arrL = {1,2,3,4,5};
        int k=8;

        //if k>length
        k = k % arrL.length;

        //store in temp
        int []temp = new int[k];
        for(int i=0; i<temp.length; i++){
            temp[i] = arrL[i];
        } // [1,2]

        //shift remaining to start
        for(int i=k; i< arrL.length; i++){
            arrL[i-k] = arrL[i];
        }

        //copy temp in arrL
        for(int i=0; i<k; i++){
            arrL[arrL.length-k+i] = temp[i];
        }

        for(int i=0; i< arrL.length; i++){
            System.out.print(arrL[i]+" ");
        }

        //M2:- reversing method ; reverse in parts
        int []arrL2 = {1,2,3,4,5};

        int s = 0;
        int e = k-1;

        while(s<e){
            int tempV = arrL2[s];
            arrL2[s] = arrL2[e];
            arrL2[e] = tempV;
            s++;
            e--;
        }

        int s2 = k;
        int e2 = arrL2.length-1;

        while(s2<e2) {
            int tempV = arrL2[s2];
            arrL2[s2] = arrL2[e2];
            arrL2[e2] = tempV;
            s2++;
            e2--;
        }

        int start = 0;
        int end = arrL2.length-1;

        while(start<end){

            int tempV = arrL2[start];
            arrL2[start] = arrL2[end];
            arrL2[end] = tempV;

            start++;
            end--;
        }

        System.out.print(Arrays.toString(arrL2));

        //can also make a reverse method that takes an array , start and end in params instead of 3 while loops
    }
}
