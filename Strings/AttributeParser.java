package Strings;

import java.util.Scanner;

public class AttributeParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int start = 0, end = 0;
        int ptr1 = s.indexOf("<"), ptr2 = s.indexOf("/");
        System.out.println(ptr1 + " and "+ ptr2);
        if (ptr1 > 0 || ptr2 > 0) {
            while (ptr2 < len && ptr2 >= 0) {
                if (s.charAt(ptr1) == (s.charAt(ptr2 -1))) {
                    ptr1++;
                    ptr2++;
                    break;
                } else {
                    ptr2 = (s.indexOf("/", ptr2 + 1));
                }
            }
            int endTagStartIndex = ptr2 - 2;
            while ((s.charAt(ptr1) == s.charAt(ptr2))&& ptr2 < len) {
                if (s.charAt(ptr1) == '>'){
                    start = ptr1 + 1;
                    end = endTagStartIndex;
                    break;
                }
                ptr1++;
                ptr2++;
            }
            System.out.println(s.substring(start,end));
        }
    }
}
