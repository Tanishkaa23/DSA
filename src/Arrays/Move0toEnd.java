package Arrays;

public class Move0toEnd {
    public static void main(String[] args) {

        //move all 0s to the end while maintaining the relative order of non-zero elements

        //main zeors nhi , non elements ko collect krna haii

        int arr[]={1,0,4,0,9}; //=> {1,4,9,0,0}
        int arr2[]={1,12,0,9,8,0,6};

        int write = 0;

        for(int read=0; read<arr.length; read++){
            if(arr[read]!=0){
                arr[write] = arr[read];
                write++;

            }
        }

        while(write< arr.length){
            arr[write]=0;
            write++;
        }

        for(int i=0; i<write; i++) {
            System.out.print(arr[i]+" ");
        }

        // swap approach
        System.out.println("swap res:");

        int writePointer=0;

        for(int read=0; read<arr2.length; read++){

            if(arr2[read] != 0){

                int temp = arr2[writePointer];

                arr2[writePointer] = arr2[read];
                arr2[read] = temp;
                writePointer++;
            }
        }
        for(int i=0; i<writePointer; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
