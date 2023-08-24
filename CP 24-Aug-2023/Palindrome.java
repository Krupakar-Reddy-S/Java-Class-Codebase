import java.util.*;

class Palindrome{

    public static boolean isPalindrome(String S){
        S = S.toLowerCase();

        for(int i = 0; i < S.length()/2; i++){
            if(S.charAt(i) != S.charAt(S.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome1(String S){
        String NewS = "";
        S = S.toLowerCase();

        for(int i = S.length()-1; i >= 0; i--){
            NewS += S.charAt(i);
        }

        if(S.equals(NewS)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(isPalindrome(s)){
            System.out.println("The given String is a Palindrome!");
        }
        else{
            System.out.println("The given String is not a Palindrome!");
        }
    }
}