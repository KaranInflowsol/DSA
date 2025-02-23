package _02_Arrays;

public class _16_LeetCode_888 {

    public static void main(String[] args) {
        int[] arr = {11,2,5,3};
        boolean b = checkIfExist(arr);
        System.out.println("-------------> "+ b);
    }

    public static boolean checkIfExist(int[] arr) {
       for(int i=0; i<arr.length; i++) {
           for(int j=i+1; j<arr.length-1; j++) {
               if(arr[i]==(arr[j]*arr[j+1])) {
                   return true;
               }
           }
       }
       return false;
    }
}
