import java.util.*;

class ToggleCase{

    public static String toggleCase(String S){
        String toggled = "";

        for(int i = 0; i < S.length(); i++){
            if(97 <= (int) S.charAt(i) && (int) S.charAt(i) <= 122){
                toggled += (char) ((int) S.charAt(i) -32);
            }
            else{
                toggled += (char) ((int) S.charAt(i) +32);
            }
        }

        return toggled;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println("The String with cases toggled is: " + toggleCase(s));
    }
}