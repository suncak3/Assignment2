import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import models.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Person> getSomeone = new ArrayList<>();
        getSomeone.add(new Employee("John", "Lennon", "", 27045.78));
        getSomeone.add(new Employee("George", "Harrison", "", 20000.00));

        getSomeone.add(new Student("Ringo", "Starr", 2.71));
        getSomeone.add(new Student("Paul", "McCartney", 1));

        Collections.sort(getSomeone);

        printData(getSomeone);
    }

    public static void printData(ArrayList<Person> getSomeone){
        for(Person person : getSomeone){
            System.out.println(person +  " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
