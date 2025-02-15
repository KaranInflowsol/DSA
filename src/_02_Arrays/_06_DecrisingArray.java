package _02_Arrays;

public class _06_DecrisingArray {
    public static void main(String[] args) {
        int[] arr = {0,3,5,6,7,9, 4,2,1};
        int i = decreaseArray(arr);
        System.out.println("---------------> "+i);
    }




    static int decreaseArray(int[] arr) {
       int start = 0;
       int end = arr.length -1;

       // solved by me

//       while(start <= end) {
//           int mid = (start+end)/2;
//           int startNew = mid+1;
//           int endNew = mid-1;
//           if(arr[mid]>arr[startNew] && arr[mid]>arr[endNew]){
//               return arr[mid];
//           }
//           if(arr[mid]<arr[startNew]) {
//               start = mid+1;
//           } else if (arr[mid]<arr[endNew]) {
//               end = mid-1;
//           }
//       }
//      return -1;


        // solved by kunal
        while(start<end) {
            int mid = (start+end)/2;
            if(arr[mid]>arr[mid+1]) {
                end = mid;
            } else {
                start = mid+1;
            }

        }

        return arr[start];
    }
}
