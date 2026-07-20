package Arrays;

public class RemoveDuplicate2 {
    public static void main(String[] args) {

        int arr[]={1,1,1,2,2,3};

        int k=2;

        for(int i=2; i<arr.length; i++){
            if(arr[i]!=arr[k-2]){
                arr[k]=arr[i];
                k++;
            }
        }

        for(int i=0; i<k; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println(k);
    }
}
