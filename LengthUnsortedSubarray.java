import java.util.Scanner;
public class LengthUnsortedSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter the length of the Array
        int n = sc.nextInt();
        int[] arr =new int[n];
        //Enter the elements in the array
        for (int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int start = 0, end = n-1;
        for (int i = 0; i < n-1; i++ ){
            if (arr[i] < arr[i+1]){
                start++;
            }else{
                break;
            }
        }
        for (int i = n -1; i > 0; i-- ){
            if (arr[i] > arr[i-1]){
                end--;
            }else{
                break;
            }
        }
        System.out.println("the start = "+start+" and end = "+end);
    }
}
