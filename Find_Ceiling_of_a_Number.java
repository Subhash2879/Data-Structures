public class Find_Ceiling_of_a_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,15, 16,18};
        int n = arr.length;
        int target = 15;
        System.out.println(smallest_element(arr,0,n-1,target));
    }

    private static int smallest_element(int[] arr, int low, int high, int target) {
        if (low <= high){
            int mid = (low + high )/2;
            if(arr[mid] == target){
                return target;
            }else if(arr[mid-1] < target && arr[mid] > target ){
                return arr[mid];
            }

            if(arr[mid] > target){
                return  smallest_element(arr, low, mid -1, target);
            }else{
                return smallest_element(arr, mid + 1, high, target);
            }
        }
        return  -1;
    }
}
