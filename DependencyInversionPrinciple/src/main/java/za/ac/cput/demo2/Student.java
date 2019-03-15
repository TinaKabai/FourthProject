package za.ac.cput.demo2;

public class Student implements FeesInterest {
    private String name;
    private int studNum;
    private String course;
    private double loanAmount;

    public Student(){
    }

    public Student(String name, int studNum, String course, double loanAmount) {
        this.name = name;
        this.studNum = studNum;
        this.course = course;
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }
    public int getStudNum() {
        return studNum;
    }
    public String getCourse() {
        return course;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public String toString(){
        return "Student Name: "+name+"\nStudent Number: "+studNum+"\nCourse: "+course+"\nThe Student Debit Account: "+loanAmount;
    }
@Override
    public double interest() {
        return 0.1;
    }
}
