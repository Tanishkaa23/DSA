package Strings;
public  class RemoveDuplicate{
    public static void main(String[] args) {
        String str ="hello";



        char[] result = new char[str.length()];
        int writePointer = 0;

        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            int j;
            for (j = 0; j < writePointer; j++) {
                if (result[j] == curr) {
                    break;
                }
            }

            if (j == writePointer) {
                result[writePointer] = curr;
                writePointer++;
            }
        }

        for(int i=0; i<writePointer; i++){
            System.out.println(result[i]);
        }
    }
}