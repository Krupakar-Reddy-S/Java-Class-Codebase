public class IsPalindrome1 {

    /* 
     * Given a string, return true if string is a palindrome, else return false.
    */

    public static boolean isPalindrome(String s, int start, int end) {
        if(( (end - start == 1) && s.charAt(start) != s.charAt(end) )) {
            return false;
        }

        if(( (end - start == 1) && (s.charAt(start) == s.charAt(end)) ) || end - start == 0) {
            return true;
        }

        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "malayalam";

        if(isPalindrome(s, 0, s.length() -1)) {
            System.out.println("Given string \"" + s + "\" is a Palindrome!");
        }
        else {
            System.out.println("Given string \"" + s + "\" is a not a Palindrome!");
        }
    }
}

