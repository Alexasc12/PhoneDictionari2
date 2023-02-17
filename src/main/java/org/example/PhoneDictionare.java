package org.example;

import java.util.ArrayList;

public class PhoneDictionare {

    private ArrayList<Person> persons;
    public PhoneDictionare(ArrayList<Person> persons) {
        this.persons = persons;
    }


    public void add(Person person) {
       this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            String a = person.getAdress() + person.getNamberPhone() + person.getLastName() + person.getName();
           if( a.contains(key)){
               result.add(person);
           }
        }
        return result;
    }
}
