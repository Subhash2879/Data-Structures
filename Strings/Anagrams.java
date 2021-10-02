package Strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagramm", "margana"));

    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; i < a.length() ; i++){
            int n = a.charAt(i);
            arr1[(n-97)]++;
        }
        for(int i = 0; i < b.length() ; i++){
            int n = a.charAt(i);
            arr2[n-97]++;
        }
        for(int i = 0; i < 26 ; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
