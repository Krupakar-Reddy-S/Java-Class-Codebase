import java.util.*;

class Student{
    private String name;
    private String email;
    private String phoneNumber;
    private int hometownPincode;
    private String mentorEmail;
    private int scholorship;
    private double CGR;

    
    public Student(String name, String email, String phoneNumber, int hometownPincode, int scholorship){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hometownPincode = hometownPincode;
        this.scholorship = scholorship;
    }

    public String getMentorEmail(){
        return mentorEmail;
    }

    public void setMentorEmail(String mentorEmail){
        
        if(scholorship >= 0 && scholorship <= 100){
            this.mentorEmail = mentorEmail;
        }
        else{
            System.out.println("Enter Valid value for Scholorship!");
        }
    }

    public void setScholorship(int scholorship){
        this.scholorship = scholorship;
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
        int fees = 500000;
        return fees - (fees * this.scholorship/100);
    }
    
}

public class StudentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student Krupakar = new Student("Krupakar Reddy", "krupakarreddy@gmail.com", "+91 9876543210", 605010, 25);

        Student Naresh = new Student("Naresh Kumar", "nareshkumar@gmail.com", "+91 1234567890", 502103, 25);

        System.out.println();

        Krupakar.printProfile();
        System.out.println();

        Naresh.printProfile();
        System.out.println();

        if(Krupakar.belongToSameLocality(Naresh)){
            System.out.println("Krupakar and Naresh belong to the same Locality.");
        }
        else{
            System.out.println("Krupakar and Naresh belong to different Localities.");
        }

        System.out.println();

        System.out.println("Krupakar's Fees: " + Krupakar.calculateFees());
        System.out.println("Naresh's Fees: " + Naresh.calculateFees());

        sc.close();
    }
}
