package models;


import interfaces.Payable;

public class Student extends Person  {
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        super(name,surname);
        setGpa(gpa);
    }

    @Override
    public String toString(){
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        if(gpa > 2.67) return 36600;
        else return 0;
    }


    public int compareTo(Student next){
        return Double.compare(this.getPaymentAmount(), next.getPaymentAmount());
    }

}
