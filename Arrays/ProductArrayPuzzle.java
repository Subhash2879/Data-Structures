import java.util.Arrays;
import java.util.Scanner;
public class ProductArrayPuzzle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Enter size
        int n = sc.nextInt(), c =0;
        int[] prod = new int[n];
        int[] arr = new int[n];
        //Enter values in the array
        for (int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int product  = 1;
        for (int i = 0; i< n ; i++){
            if (arr[i] == 0)
                c++;
            else
            product *= arr[i];
        }
        for (int i = 0; i < n; i++){
           if (c == 1 && (arr[i] == 0)){
               prod[i] = product;
           }else if(c == 0){
               prod[i] = product / arr[i];
           }else{
               prod[i] = 0;
           }
        }
        System.out.println(Arrays.toString(prod));
    }
}
