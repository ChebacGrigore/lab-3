package com.company;

public class Programmer extends Profession {

    private String name;
    private String surname;
    private String profession;
    private int hours;

    public void setName(String name) {this.name = name ;}

    public void setSurname(String surname) {this.surname = surname;}

    public void setProfession(String profession) {this.profession = profession;}

    public void setHours(int hours) { this.hours = hours; }

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public int getHours() { return hours; }

    public String getProfession() { return profession; }

    @Override
    public String myProfession() {
        return "Hello, my profession is ==> " + getProfession();
    }

    @Override
    public int mySalary() {
        return getHours() * 123;
    }

    @Override
    public String toString() {
        return "I am ==> " + getName()  + " " + getSurname() + " and my salary is ==> " + mySalary() + "$\tin day";
    }

}
