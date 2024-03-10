package TutortAcademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowelOfAString {
    public static String reverseVowels(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        List<Character> ls = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') || (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')) {
                ls.add(s.charAt(i));
            }
        }
        Collections.reverse(ls);
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') || (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')) {
                arr[i] = ls.get(c);
                ++c;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String reverses = reverseVowels(s);
        System.out.println(s + " " + reverses);
    }
}
