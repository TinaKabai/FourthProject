package za.ac.cput.demo4;

public class Employee {
    private String name;
    private int empNum;
    private String jobTitle;

    public Employee() {
    }
    public Employee(String name, int empNum, String jobTitle) {
        this.name = name;
        this.empNum = empNum;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public int getEmpNum() {
        return empNum;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public String toString(){
        return "Employee Name: "+name+
                "\nEmployee Number: "+empNum+
                "\nJob Title: "+jobTitle;
    }
}
