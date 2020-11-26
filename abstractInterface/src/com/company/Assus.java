package com.company;

public class Assus extends Notebook implements AbleToMakeHello, AbleToSupportGames {

    private String model;


    public Assus(int cost, int an, String name,String model) {
        super.setCost(cost);
        super.setAn(an);
        super.setName(name);
        this.model = model;
    }

    public Assus(String name) {
        super.setName(name);
    }

    public void setModel() { this.model = model; }

    public String getModel() { return  model; }

    @Override
    public String printHello() {
        return "Hello, " + super.getName();
    }

    @Override
    public void modernGames() {
        System.out.println("I support games of any years for example\n" +
                "METRO\n" +
                "THE WITCHER\n" +
                "FAR CRY PRIMAL\n" +
                "CYBERPUNK\n" +
                "\n");
    }

    @Override
    public String toString() {
        return printHello() + " " + super.toString() + " " + " my model is " + getModel() + " and " + "my an is " + getAn();
    }
}
