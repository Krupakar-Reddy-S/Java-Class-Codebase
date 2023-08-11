import java.util.*;

class Calculator {

    public static double Add(double a,double b){
        return a + b;
    }

    public static double Subtract(double a,double b){
        return a - b;
    }

    public static double Multiply(double a,double b){
        return a * b;
    }

    public static double Divide(double a,double b){
        return a / b;
    }

    public static double Power(double a,int b){
        double Result = 1;
        for(int i = 0; i < b; i++){
            Result*=a;
        }
        return Result;
    }

    public static int Remainder(double a,double b){
        return (int) (a % b);
    }

    public static int ConvertBase(int num,int base){
        int Result = 0;
        for(int i = 1; num > 0; i++){
            Result+= (Power(base,i)* (num%10));
            num/=10;
        }
        return Result;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Answer = 0;

        System.out.println("Enter the first number: ");
        double Num1 = sc.nextDouble();

        System.out.println("Enter the operation to perform: ");
        char Operator = sc.next().charAt(0);

        System.out.println("Enter the second number: ");
        double Num2 = sc.nextDouble();

        if(Operator == '+'){
            Answer = Add(Num1,Num2);
            System.out.println(Answer);
        }
        else if(Operator == '-'){
            Answer = Subtract(Num1,Num2);
            System.out.println(Answer);

        }
        else if(Operator == '*'){
            Answer = Multiply(Num1,Num2);
            System.out.println(Answer);           
        }
        else if(Operator == '/'){
            Answer = Divide(Num1,Num2);
            System.out.println(Answer);
        }
        else if(Operator == '^'){
            Answer = Power(Num1,(int) Num2);
            System.out.println(Answer);
        }
        else if(Operator == '%'){
            Answer = Remainder((int) Num1,(int) Num2);
            System.out.println(Answer);
        }
        else{
            System.out.println();
        }
    
        sc.close();
    }
}
