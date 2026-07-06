package Arrays;

public class IsArraySorted {
    public static void main(String[] args) {

        //Check if the array is sorted

        int arr[]={1,3,11,4,76,52,31};
        boolean isArraySorted = true;
        for(int i=0; i < arr.length-1 ; i++){
            int curr = arr[i];
            if(curr>arr[i+1]) {
                isArraySorted = false;
            }
        }
        System.out.println(isArraySorted);
    }
}
