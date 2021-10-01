import java.util.Arrays;
import java.util.Scanner;
public class ThreeSumClosest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Enter the number of Elements
        int n = sc.nextInt();
        //Enter the target Sum
        int target = sc.nextInt();
        int[] arr = new int[n];
        ///Enter the elements
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr) + "\n");
        int ptr1 , ptr2 = n-1 , sum=0, closestSum = Integer.MAX_VALUE;
        for (int i = 0 ; i < n; i++){
            ptr1 = i + 1;
            while (ptr1 < ptr2){
                sum = arr[i] + arr[ptr1] + arr[ptr2];
                if (Math.abs(target - sum) < Math.abs(target - closestSum))
                    closestSum = sum;
                if (sum > target)
                    ptr2--;
                if (sum < target)
                    ptr1++;
            }
        }
        System.out.println("The Closest sum to "+ target + " is " + closestSum);
    }
}
