package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Man rogir = new Man();
        Woman ulia = new Woman();

        rogir.setAge(20.5d);
        rogir.setHeight(184.500d);
        rogir.setWeight(81.23);
        rogir.setName("Chebac");
        rogir.setSurname("Grigore");

        ulia.setAge(19.5d);
        ulia.setHeight(167.3d);
        ulia.setWeight(67.100d);
        ulia.setName("Katrina");
        ulia.setSurname("Gates");

        ArrayList<People> people = new ArrayList<>();

        people.add(rogir);
        people.add(ulia);

        System.out.println(people.get(0).calories());
        System.out.println(people.get(1).calories());



//        System.out.println(people.get(0) + "\n");
//        System.out.print("//********************************************************************************************\n");
//        System.out.println(people.get(1));
    }
}
