package models;

import interfaces.Payable;

public class Person implements Payable, Comparable<Person> {
    private static int current_Id = 0;

    private int id;
    private String name;
    private String surname;

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }
    public String toString(){
        return this.id + ". " + this.name + " " + this.surname;
    }

    //constructors
    public Person(){
        this.current_Id++;
        this.id = current_Id;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    public double getPaymentAmount(){
        return 0;
    }

    @Override
    public int compareTo(Person next){
        return Double.compare(this.getPaymentAmount(), next.getPaymentAmount());
    }
}
