package com.company;

public class Main {
    public static void main(String[] args) {

        Assus assus = new Assus(500,2020,"Grigore Rogir","ZenBook");

        System.out.println(assus.toString());
        assus.print();
        System.out.println(assus.printHello());
        assus.print();

        System.out.println(assus.printHello());
        assus.print();
        assus.modernGames();
    }
}
