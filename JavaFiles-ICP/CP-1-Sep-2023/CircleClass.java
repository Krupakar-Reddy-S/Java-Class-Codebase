import java.util.*;

class Circle{
    double radius;
    double Pi = Math.PI;

    Circle(int Radius){
        this.radius = Radius;
    }

    public double Perimeter(){
        double Perimeter = 2 * Pi * radius;
        return Math.round(Perimeter * 100.0)/100.0;
    }

    public double Area(){
        double Area = Pi * radius * radius;
        return Math.round(Area * 100.0)/100.0;
    }
}


public class CircleClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of The Circle: ");
        int Radius = sc.nextInt();

        Circle C1 = new Circle(Radius);
        System.out.println("The Perimeter of the Given Circle is: " +(C1).Perimeter());
        System.out.println("The Area of the Given Circle is: " + C1.Area());
    }
}
