import java.util.*;

class CountVowels{

    public static int countVowels(String S){
        int Count = 0;
        S = S.toLowerCase();
        String Vowels = "aeiou";
        for(int i = 0; i < S.length(); i++){
            for(int j = 0; j < Vowels.length(); j++){
                if(S.charAt(i) == Vowels.charAt(j)){
                    Count++;
                    break;
                }
            }
        }
        return Count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("The No. of vowels are: " + countVowels(s));
    }
}