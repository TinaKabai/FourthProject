package za.ac.cput.demo;

public class Rabbit implements AnimalAction {
    @Override
    public String run() {
        return "Rabbit is running.";
    }
    @Override
    public String roar() {
        return "";
        //nothing happens here because the rabbit cannot roar
    }
}
//code that obeys the principle
class Rabbits implements Runnable{
    @Override
    public String run() {
        return "Rabbit is running.";
    }
}
