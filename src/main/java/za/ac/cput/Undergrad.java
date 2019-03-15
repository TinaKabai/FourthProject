package za.ac.cput;

public class Undergrad extends Student {

    public Undergrad(String name, int studNum, String course, double loanAmount) {
        super(name, studNum, course, loanAmount);
    }
    public double interest(){
        //post graduates get a 10% discount off their fees
        return getLoanAmount()*0.15;
    }
    public String toString(){
        return super.toString();
    }
}
