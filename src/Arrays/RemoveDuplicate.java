package Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        //remove duplicate in sorted array

        int arr[] = {1,1,2,3,3}; // => {1,2,3} =3

        int count=1;

        for(int i=0; i< arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                arr[count]=arr[i];
                count++;
            }
        }
        System.out.println(count);

    }
}
