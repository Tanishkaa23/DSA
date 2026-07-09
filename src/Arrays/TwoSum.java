package Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        int target = 6;

        int start = 0;
        int end = arr.length-1;
//        int sum = arr[start]+arr[end]; //5
//
//        while(start<end){
//            if(sum<target) start++; //start=1
//            else if(sum>target) end--;
//            else if(sum==target) break;
//        }


        while(start<end){
            int curr_sum = arr[start]+arr[end];
            if(curr_sum==target) break;
            if(curr_sum>target) end--;
            if(curr_sum<target) start++;
        }


        System.out.println(start);
        System.out.println(end);
        System.out.println(arr[start]+arr[end]);
    }
}
