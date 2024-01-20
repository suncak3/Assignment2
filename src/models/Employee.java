package models;

import interfaces.Payable;

public class Employee extends Person  {
    private String position;
    private double salary;

    //getters and setters

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //constructors
    public Employee(){
        super();
    }
    public Employee(String name,String surname, String position, double salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public String toString(){
        return "Employee: " + super.toString();
    }

    @Override
    public double getPaymentAmount(){
        return this.getSalary();
    }


    public int compareTo(Employee next){
        return Double.compare(this.getSalary(), next.getSalary());
    }

}
