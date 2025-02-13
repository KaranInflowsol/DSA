package _02_Arrays;

public class _02_Order_Anostic_BS {
    public static void main(String[] args) {
       // int[] arr = {0,1,12,15,17,21,26,29,38,99};
         int[] arr = {99,41,32,25,22,11,6,4,0,-1};
        int target = 25;
        int i = orderAgnostricBS(arr, target);
        System.out.println("----------------> "+ i);
    }

    static int orderAgnostricBS(int[] arr, int target) {
        int start = 0;
        int end  = arr.length-1;

        boolean s = arr[start]<arr[end];

        while(start<=end) {

            int mid = (start+end)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(s) {
                if(target>arr[mid]) {
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            } else {
                if(target<arr[mid]){
                    start =mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
