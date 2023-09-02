import java.util.*;

class Rectangle{
    int length;
    int breadth;


    public Rectangle(int Length, int Breadth){
        this.length = Length;
        this.breadth = Breadth;
    }

    public int getPerimeter(){
        return 2 * (this.length + this.breadth);
    }

    public int getArea(){
        return this.length * this.breadth;
    }

    public boolean isSquare(){

        if(this.length == this.breadth){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(Rectangle R){

        if((this.length == R.length) && (this.breadth == R.breadth)){
            return true;
        }
        else{
            return false;
        }
    }
}


public class RectangleClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length and Breadth of First Rectangle: ");
        int Length1 = sc.nextInt();
        int Breadth1 = sc.nextInt();

        Rectangle R1 = new Rectangle(Length1, Breadth1);
        System.out.println("Details of First Rectangle: ");
        System.out.println("Perimeter = " + R1.getPerimeter());
        System.out.println("Area of First Rectangle: " + R1.getArea());
        System.out.println("IsSquare: " + R1.isSquare());

        System.out.println();
    
        System.out.print("Enter the Length and Breadth of Second Rectangle: ");
        int Length2 = sc.nextInt();
        int Breadth2 = sc.nextInt();

        Rectangle R2 = new Rectangle(Length2, Breadth2);
        System.out.println("Details of First Rectangle: ");
        System.out.println("Perimeter = " + R2.getPerimeter());
        System.out.println("Area of First Rectangle: " + R2.getArea());
        System.out.println("IsSquare: " + R2.isSquare());

        System.out.println();

        boolean equal = R1.equals(R2);
        if(equal){
            System.out.println("First and Second Rectangle are Equal.");
        }
        else{
            System.out.println("First and Second Rectangle are not Equal.");
        }

        sc.close();
    }
}
