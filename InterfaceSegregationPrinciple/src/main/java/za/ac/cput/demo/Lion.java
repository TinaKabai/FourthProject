package za.ac.cput.demo;

public class Lion implements AnimalAction {
    @Override
    public String roar() {
        return "Lion is roaring.";
    }

    //this method violates ISP
    @Override
    public String run() {
        return "";
    //nothing happens here because the lion cannot run
    }
}
//code that obeys the principle
class Lions implements Roarable{
    @Override
    public String roar() {
        return "Lion is roaring.";
    }
}
