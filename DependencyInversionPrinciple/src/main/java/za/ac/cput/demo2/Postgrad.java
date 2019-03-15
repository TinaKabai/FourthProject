package za.ac.cput.demo2;

public class Postgrad extends Student {

    public Postgrad(String name, int studNum, String course, double loanAmount) {
        super(name, studNum, course, loanAmount);
    }
    public double interest(){
        //this is a violation
        return getLoanAmount()*0.1;
    }
    public String toString(){
        return super.toString();
    }
}
class Postgrads implements FeesInterest{
    //this obeys
    @Override
    public double interest() {
        return 0.1;
    }
}
