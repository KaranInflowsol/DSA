package _02_Arrays;

public class _03_SmallestCharactor {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'a';
        char c = nextGreatestLetter(arr, target);

        System.out.println("-------------> "+ c);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start <= end ) {
            int mid = (start+end)/2;

            if(target<letters[mid]){
                end= mid-1;
            } else {
                start = mid+1;
            }
        }

        return letters[start%letters.length];
    }
}
