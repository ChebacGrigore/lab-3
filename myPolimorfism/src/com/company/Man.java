package com.company;

public class Man extends People {

    private String name;
    private String surname;


    public Man(double age,double height,double weight, String name, String surname) {
        super.setAge(age);
        super.setHeight(height);
        super.setWeight(weight);
        this.name = name;
        this.surname = surname;
    }

    public Man() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public double calories() {
        return getWeight() * 10 + 6.25d * getHeight() + 5 * getAge() + 5;
    }

    @Override
    public String toString() {
        return "Hi, i am " + getName() + " " + getSurname() + "\n" + super.toString() + "\tthis is my norm ==> "
                + calories() + " kkl";
    }
}
