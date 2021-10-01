import java.util.Arrays;
import java.util.Scanner;
public class SearchRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter the element to be searched in the array
        int key = sc.nextInt();

        //Enter the Length of the array
        int n = sc.nextInt();

        int[] arr = new int[n];

        //Enter the elements int he array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(searchRotated(arr, 0, n-1, key));
    }
    static int searchRotated(int[] arr , int low, int high, int target){
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if (arr[mid] == target){
            return mid;
        }
        if(arr[low] <= arr[mid]){
            if (target >= arr[low] && target <= arr[mid]){
                return searchRotated(arr, low, mid-1, target);
            }
            return searchRotated(arr, mid + 1, high , target);
        }
        if(target >= arr[mid] && target <= arr[high]){
            return searchRotated(arr, mid+1, high, target);
        }

        return searchRotated(arr, low, mid - 1, target);
    }
}
