package _02_Arrays;

public class _08_RotatedArray_Count {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int result = countRotationOfArray(arr);
        result+=1;
        System.out.println("-----------> "+ result);

    }


    // with out any duplicate
    public static int countRotationOfArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid]<=arr[start]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

    //with duplicate
//    public static int countRotationArrayWithDuplicates(int[] arr) {
//
//    }
}
