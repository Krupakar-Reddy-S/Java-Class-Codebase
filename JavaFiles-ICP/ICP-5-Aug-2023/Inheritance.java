class User{
    private String name;
    private String email;
    private String phNo;
    protected int hometownPin;

    public User(String name, String email, String phNo, int hometownPin){
        this.name = name;
        this.email = email;
        this.phNo = phNo;
        this.hometownPin = hometownPin;
    }



    void printProfile(){
        System.out.println("User Profile");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("PhoneNo: " + phNo);
    }

    String getName(){
        return this.name;
    }

    String getEmail(){
        return this.email;
    }

    String getPhNo(){
        return this.phNo;
    }

    boolean fromSameLocality(User U){
        return this.hometownPin == U.hometownPin;
    }

}

class Student extends User{
    private String mentorEmail;
    private double CGR;
    private int scholarship;
    
    public Student(String name, String email, String phNo, int hometownPin) {
        super(name, email, phNo, hometownPin);
    }

    void setScholarship(int sch){
        this.scholarship = sch;
    }

    int getScholarship(){
        return this.scholarship;
    }

    String getMentorEmail(){
        return this.mentorEmail;
    }

    void setCGR(double CGR){
        this.CGR = CGR;
    }

    int calculateFee(){
        int Fees = 500000;
        int feeDeduction = this.scholarship * Fees/ 100;
        return Fees - feeDeduction;
    }

    void printProfile(){
        System.out.println("Student Profile");
        System.out.println("Name: " + this.getName());
        System.out.println("Email ;" + this.getEmail());
        System.out.println("Phone No: " + this.getPhNo());
    }
}

class Mentor extends User{
    String Company;
    String jobProfile;
    int YOE;

    public Mentor(String name, String email, String phNo, int hometownPin){
        super(name, email,phNo, hometownPin);
    }

    void printProfile(){
        System.out.println("Mentor Profile");
        System.out.println("Name: " + this.getName());
        System.out.println("Email ;" + this.getEmail());
        System.out.println("Phone No: " + this.getPhNo());
    }

}

public class Inheritance{
    public static void main(String[] args) {
        Student S1 = new Student("Krupakar", "krupakarreddy@gmail.com", "+91 9876543210", 605010);
        Student S2 = new Student("Naresh Kumar", "nareshkumar@gmail.com", "+91 1234567890", 602301);

        System.out.println();
        S1.printProfile();

        S1.setScholarship(25);
        System.out.println("Student Fees: " + S1.calculateFee());

        Mentor M1 = new Mentor("Aditya Sinha", "adityasinha@gmail.com", "+91 6969696969", 605010);

        System.out.println();
        M1.printProfile();

        System.out.println(S1.fromSameLocality(M1));
    }
}