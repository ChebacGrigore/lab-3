package com.company;

public class People {

    private double age;
    private double height;
    private double weight;

    public People() {}

    public People(double age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setAge(double age) { this.age = age; }

    public void setHeight(double height){ this.height = height; }

    public void setWeight(double weight) { this.weight = weight; }

    public double getAge() { return age;}

    public double getHeight() { return height; }

    public double getWeight(){ return  weight; }

    public double calories() {
        return 2000.0d;
    }

    public String print() {
        return "My age is ==> " + age + " i am ==> " + height + " cm" + " and my weight is ==> "  + weight;
    }

    @Override
    public String toString () {
        return "My age is ==> " + age + " i am ==> " + height + " cm" + " and my weight is ==> " + weight;
    }

    
}
