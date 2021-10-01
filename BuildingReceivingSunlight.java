import java.util.Scanner;
public class BuildingReceivingSunlight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter the Size of the Array
        int n = sc.nextInt(), count = 1 , max;
        int[] arr = new int[n];
        for (int i = 0 ; i  < n ; i++){
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for (int i = 1; i < n; i++){
           if ((arr[i] > arr[i-1]) && (arr[i] > max)){
               max = arr[i];
               count++;
           }
        }
        System.out.println(count);

    }

}
