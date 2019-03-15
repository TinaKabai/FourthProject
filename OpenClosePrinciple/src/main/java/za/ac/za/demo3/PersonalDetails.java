package za.ac.za.demo3;

public class PersonalDetails extends Detail {

    private double allowance;

    public PersonalDetails(int allowance) {
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public String toString(){
        return "Name: "+super.name()+
                "\nStudent number: "+super.studNum()+
                "\nCourse: "+super.course()+
                "\nMarks: "+super.marks()+
                "\nAllowance per Month: "+allowance;
    }
}
