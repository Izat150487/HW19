package com.company;

import java.util.Arrays;

public class Obshejitya implements Arenda{

    private String adress;
    private Person[] gosti;

    public Obshejitya(String adress, Person[] gosti) {
        this.adress = adress;
        this.gosti = gosti;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Person[] getGosti() {
        return gosti;
    }

    public void setGosti(Person[] gosti) {
        this.gosti = gosti;
    }

    @Override
    public void rent() {
        System.out.println("Obshejitya arenda toloyt");
    }

    @Override
    public String toString() {
        return "Obshejitya{" +
                "adress='" + adress + '\'' +
                ", gosti=" + Arrays.toString(gosti) +
                '}';
    }
}
