package com.company;

public class Woman extends Man {

    public Woman() {}

    public Woman(int age, int height, int weight, String name, String surname) {
        super.setAge(age);
        super.setHeight(height);
        super.setWeight(weight);
        super.setName(name);
        super.setSurname(surname);
    }

    @Override
    public double calories() {
        return 5 * getAge() + 6.25d * getHeight() + 10 * getWeight() - 161;
    }

    @Override
    public String toString() {
        return   "Hi, i am " + getName() + " " + getSurname() + "\n" + print() + " "
                + "\tand if I eat more than ==> " + calories() + " kkl i will be fat";
    }
}
