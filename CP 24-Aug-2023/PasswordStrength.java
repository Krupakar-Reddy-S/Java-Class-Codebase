import java.util.Locale;
import java.util.Scanner;

class PasswordStrength{

    public static int passwordStrength(String S){
        if(S.length() < 8){
            return 0;
        }

        else{
            // for(int i = 0)
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pswd = sc.next();

        int Strength = passwordStrength(pswd);

        switch (Strength) {
            case 4 -> System.out.println("Password Strength: Strong");
            case 3 -> System.out.println("Password Strength: Moderate");
            case 2 -> System.out.println("Password Strength: Weak");
            case 1 -> System.out.println("Password Strength: Poor");
            default -> System.out.println("Invalid Password!");
        }
    }
}