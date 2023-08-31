import java.util.*;

public class SortString{

    public static String sortString(String S){

        S = S.toLowerCase();
        String sortedString = "";
        int[] CharArray = new int[S.length()];

        for(int i = 0; i < S.length(); i++){
            CharArray[i] = S.charAt(i);
        }

        Arrays.sort(CharArray);

        for(int i = 0; i < S.length(); i++){
            sortedString += (char) CharArray[i];
        }

        return sortedString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String to Sort: ");
        String Text = sc.next();

        System.out.println("The sorted string is: " + sortString(Text));
        
        sc.close();
    }
}
