package probsolving;

import java.util.*;

public class valid_palindrome {

    static boolean isPalindrome() {
        String s = "Madam,I'm Adam";
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (Character.isLetter(s.charAt(l)) && Character.isLetter(s.charAt(r))) {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                }
                l++;
                r--;

            } else if (Character.isDigit(s.charAt(l)) && Character.isDigit(s.charAt(r))) {
                if (s.charAt(l) != s.charAt(r)) {
                    return false;
                }
                l++;
                r--;

            } else if (!Character.isLetterOrDigit(l)) {
                l++;

            } else if (!Character.isLetterOrDigit(r)) {
                r--;

            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // find the valid palindrome
        boolean result = isPalindrome();
        if (result) {
            System.out.println("Yez it is Palindrome");
        } else {
            System.out.println("Not it is Palindrome ");
        }
    }
}
