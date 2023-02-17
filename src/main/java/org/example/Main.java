package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Sasha", "Ivanov","Lenina", "8923456340");
        Person person2 = new Person("Dima", "Ivanov","Kirova", "8924456335");
        Person person3 = new Person("Vova", "Ivanov","Stepnai", "8927456745");
        Person person4 = new Person("Oly", "Ivanov","Sovetskaia", "8953459345");


         ArrayList<Person> perso= new ArrayList<>();

        perso.add(person1);
        perso.add(person2);
        perso.add(person3);
        perso.add(person4);

        PhoneDictionare phoneDictionare = new PhoneDictionare(perso);
       ArrayList<Person> result2 = phoneDictionare.find("ova");

        for (Person person : result2) {
            System.out.println(  person.getAdress() + " " + person.getNamberPhone() + " " + person.getLastName() + " " + person.getName() );
        }
    }
    }


