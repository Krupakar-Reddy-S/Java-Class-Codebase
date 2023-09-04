import java.util.*;

class Student{
    String name;
    String email;
    long phoneNumber;
    int hometownPincode;
    String mentorEmail;
    int scholorship;
    double CGR;

    int fees = 500000;
    
    public Student(String name, String email, long phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public void printProfile(){
        System.out.println("Name of Student: " + this.name);
        System.out.println("Email of Student: " + this.email);
        System.out.println("Phone Number of Student: " + this.phoneNumber);
    }

    public boolean belongToSameLocality(Student S){
        return this.hometownPincode == S.hometownPincode;
    }

    public int calculateFees(){
        return this.fees - (this.fees * this.scholorship/100);
    }
    
}

public class StudentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student Krupakar = new Student("Krupakar Reddy", "krupakarreddy@gmail.com", 9876543210L);
        Krupakar.hometownPincode = 605010;
        Krupakar.scholorship = 25;

        Student Naresh = new Student("Naresh Kumar", "nareshkumar@gmail.com", 1234567890L);
        Naresh.hometownPincode = 502103;
        Naresh.scholorship = 25;

        System.out.println();

        Krupakar.printProfile();
        System.out.println();

        Naresh.printProfile();
        System.out.println();

        if(Krupakar.belongToSameLocality(Naresh)){
            System.out.println("Krupakar and Naresh belong to same Locality.");
        }
        else{
            System.out.println("Krupakar and naresh belong to different Localities.");
        }

        System.out.println();

        System.out.println("Krupakar's Fees: " + Krupakar.calculateFees());
        System.out.println("Naresh's Fees: " + Naresh.calculateFees());

        sc.close();
    }
}
