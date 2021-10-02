import java.util.HashSet;
import java.util.Scanner;
public class KeyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> s = new HashSet<Integer>();
        int sum;
        for (int i = 0 ; i < n ; i++){
            sum = target - arr[i];
            if(s.contains(sum)){
                System.out.println("The Pair is - "+sum +" and "+arr[i]);
            }
            s.add(arr[i]);
        }
    }
}
