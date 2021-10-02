import java.util.Arrays;
import java.util.Scanner;
public class FIndNthFibonacciNumber {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int[] arr = new int[5];
        for(int i =0 ; i< 5; i++){
            System.out.println("Enter the Number : ");
            arr[i] = sc.nextInt();
        }
        int low = 0 , high = 4, temp = 0;
        while(low != high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
        }
        System.out.println(Arrays.toString(arr));

//        int test = sc.nextInt();
//        if(test > 0){
//            int n = sc.nextInt();
//            int s = sc.nextInt();
//            int[] arr = new int[n];
//            int[] pp = new int[s];
//            for( int i = 0 ; i < n ; i++){
//                arr[i] = sc.nextInt();
//                if(i < s){
//                    pp[i] = arr[i];
//                }
//            }
//            for(int i = 0; i < n-s; i++){
//                arr[i] = arr[i+s];
//            }
//            int count = 0 ;
//            for(int i = n-s ; i < n ; i++ ){
//                arr[i] = pp[count];
//                ++count;
//            }
//
//            for(int i = 0; i<n ; i++ ){
//                System.out.print(arr[i] + " ");
//            }
//        }
    }


}
