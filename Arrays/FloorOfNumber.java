import java.util.Scanner;
public class FloorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        int target = sc.nextInt();
        int index = floor(arr,target);
        System.out.println("The Floor of the number "+ target + " is " + arr[index] + " at index " + index);
    }

    private static int floor(int[] arr, int target) {
        int start = 0, end = arr.length -1 ;
        while ( start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return  mid;
            }
        }
        return end;
    }
}
