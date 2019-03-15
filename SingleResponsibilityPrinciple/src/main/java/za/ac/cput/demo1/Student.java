package za.ac.cput.demo1;

public class Student {
    public String info(String name, String studID, String course, String lecturer){
        return name + studID + course + lecturer;
    }
    public int marks(int m1){
        return m1;
    }
}
class Details{
    public String info(String name, String studID, String course, String lecturer){
        return name + studID + course + lecturer;
    }
}
class Marks{
    public int marks(int m1){
        return m1;
    }
}
