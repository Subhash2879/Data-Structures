import java.util.Arrays;
import java.util.Scanner;
public class MoveZerosEnd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {1,2,0,5,0,0,9,0,7,0,7,8,9};
        int count = 0;
        for (int  i = 0 ; i < arr.length; i++ ){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length){
            arr[count] = 0;
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
