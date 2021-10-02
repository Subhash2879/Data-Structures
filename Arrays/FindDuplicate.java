import java.util.Arrays;
import java.util.Scanner;
public class FindDuplicate {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n = 7;
      int[] arr = new int[n];
      for (int i = 0 ; i< n ; i++){
          arr[i] = sc.nextInt();
      }
      System.out.println("Before Manipulation : "+Arrays.toString(arr));
      for (int i = 0; i< n ; i++){
          arr[arr[i]%n] = arr[arr[i]%n] + n;
      }
      System.out.println("After Manipulation : "+Arrays.toString(arr));
        System.out.print("repeating elements : [");
      for (int i = 0 ; i < n ; i++ ){
          if (arr[i] >= n*2){
              System.out.print(i+ ",");
          }
      }
        System.out.println("]");
    }
}
