public class IsPalindrome {

    /* 
     * Given a string, return true if string is a palindrome, else return false.
    */

    public static boolean isPalindrome(String s) {
        if(s.charAt(0) != s.charAt(s.length() -1)) {
            return false;
        }

        if(( s.length() == 2 && (s.charAt(0) == s.charAt(1)) ) || s.length() == 1) {
            return true;
        }

        return isPalindrome(s.substring(1, s.length() -1));
    }

    public static void main(String[] args) {
        String s = "malayalam";

        if(isPalindrome(s)) {
            System.out.println("Given string \"" + s + "\" is a Palindrome!");
        }
        else {
            System.out.println("Given string \"" + s + "\" is a not a Palindrome!");
        }
    }
}
