package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr ={11,34,53,65,53,62};

        int l = arr[0];
        int sl = 0;

        for(int n:arr){
            if(n>l){
                sl=l;
                l=n;
            }
            else if(n>sl && n!=l){
                sl=n;
            }
        }
        System.out.println(sl);
    }


}
