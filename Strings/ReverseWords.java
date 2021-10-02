package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {
    //Do it without split method
    public static void main(String[] args) {
//        String S = "i.like.this.program.very.much";
//        String[] s = S.split("\\.");
//        String str = "";
//        for(int i = (s.length - 1) ; i >= 0 ; i--){
//            str += s[i] + ".";
//        }
//        System.out.println(str.substring(0, str.length()-1));
//        if (isValid("111..255.255")){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//    }
//        static public boolean isValid(String s) {
//            String[] arr = s.split("\\.");
//            System.out.println(Arrays.toString(arr));
//            int len = arr.length;
//            if(len > 4){
//                return false;
//            }
//            int n, count = 0;
//            for(int i = 0 ; i < len ; i++){
//                if(arr[i].length() <= 3 ) {
//                    try {
//                        n = Integer.parseInt(arr[i]);
//                        if (n >= 0 && n <= 255)
//                            count++;
//                    }catch(Exception e){
//                        return false;
//                    }
//
//                }
//            }
//            if( count == 4)
//                return true;
//
//            return false;
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNext()){

            count++;
        }
}
}