import java.util.*;

public class DistinctCombinations {

    public static long Factorial(int n){
        long Factorial = 1;

        for(long i = 1; i <= n; i++){
            Factorial *= i;
        }

        return Factorial;
    }

    public static long distinctCombinations(String S){
        long Numerator = Factorial(S.length());
        long Denominator = 1;

        ArrayList<Character> Chars = new ArrayList<Character>();

        for(int i = 0; i < S.length(); i++){
            int Count = 0;
            if(! Chars.contains(S.charAt(i))){
                Chars.add(S.charAt(i));
                for(int j = 0; j < S.length(); j++){
                    if(S.charAt(i) == S.charAt(j)){
                        Count++;
                    }
                }

                Denominator *= Factorial(Count);
            }
        }

        return Numerator/Denominator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A word: ");
        String Str = sc.next();
        Str = Str.toUpperCase();

        System.out.println("The No. of Distinct Combinations of given Word is: " + distinctCombinations(Str));

    }
}
