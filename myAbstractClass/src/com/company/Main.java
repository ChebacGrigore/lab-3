package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer();
        Musician   musician = new Musician();
        Cook       cook = new Cook();

        ArrayList<Profession> profession = new ArrayList<>();

        programmer.setName("Nikita");
        programmer.setSurname("Uzumaki");
        programmer.setProfession("Programmer");
        programmer.setHours(8);

        musician.setName("Chebac");
        musician.setSurname("Eugeniu");
        musician.setProfession("Musician");
        musician.setHours(6);

        cook.setName("Mihail");
        cook.setSurname("Tean");
        cook.setProfession("Cook");
        cook.setHours(12);

        profession.add(programmer);
        profession.add(musician);
        profession.add(cook);

        ArrayList<Object> myPofession = new ArrayList<>();

        myPofession.add(programmer.myProfession());
        myPofession.add(musician.myProfession());
        myPofession.add(cook.myProfession());

        for (int i = 0; i <= 2; i++) {
            System.out.println(myPofession.get(i));
            System.out.println(profession.get(i) + "\n");
        }

    }
}
