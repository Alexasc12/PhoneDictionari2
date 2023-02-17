package org.example;

public class Person {
    String name;
    String lastName;
    String adress;
    String namberPhone;

    public Person(String name, String lastName, String adress, String namberPhone) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.namberPhone = namberPhone;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }

    public String getNamberPhone() {
        return namberPhone;
    }

}
