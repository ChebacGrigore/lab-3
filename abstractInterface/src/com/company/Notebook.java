package com.company;

public class Notebook {

    private int cost;
    private int an;
    private String name;

    public Notebook() {}

    public Notebook(int cost, int an,String name) {
        this.cost = cost;
        this.an = an;
        this.name = name;
    }

    public void setCost(int cost) { this.cost = cost; }

    public void setAn(int an) { this.an = an; }

    public void setName(String name) { this.name = name; }

    public int getCost() { return cost; }

    public int getAn() { return an; }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "my cost is " + getCost();
    }

    public void print() {
        System.out.println("*******************************************************************************************");
    }
}
