import java.util.*;

class Dog{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dog adoption suggester");
        System.out.println("Do you prefer small dog or large dog:(small/large)");
        String size = sc.nextLine();

        if (size.equals("large")){
            System.out.println("Do you prefer a high maintainance dog:(yes/no)");
            String maintain = sc.nextLine();

            if(maintain.equals("yes")){
                System.out.println("You can adopt a Pug or Chihuahua.");
            }
            else if(maintain.equals("no")){
                System.out.println("You can adopt an Indian breed.");
            }
            else{
                System.out.println("Please enter only (yes/no) as input!");
            }
        }
        else if(size.equals("small")){
            System.out.println("Do you want a guard dog:(yes/no)");
            String guard = sc.nextLine();

            if(guard.equals("yes")){
                System.out.println("Do you stay in cold climate:(yes/no)");
                String cold = sc.nextLine();

                if(cold.equals("yes")){
                    System.out.println("You can adopt a Husky.");
                }
                else if(cold.equals("no")){
                    System.out.println("You can adopt a Doberman or German Shepard.");
                }
                else{
                    System.out.println("Please enter only (yes/no) as input!");
                }
            }
            else if(guard.equals("no")){
                System.out.println("You can adopt a Saint Bernard.");
            }
            else{
                System.out.println("Please enter only (yes/no) as input!");
            }
        }
        else{
            System.out.println("Please enter only (small/large) as input!");
        }
        sc.close();
    }
}