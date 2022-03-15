package com.company.zajecia_01;

import java.util.GregorianCalendar;

public abstract class Pracownik {
    private String imie;
    private String nazwisko;
    private String dataZatr;
    private int id;
    private double pensja;
    private static int nextId=1;

    public  Pracownik(String imie, String nazwisko, String dataZatr, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataZatr = dataZatr;
        this.id = getNextId();
        this.pensja = pensja;
    }

    public static int getNextId() {
        return nextId++;
    }

    public abstract String getOpis();

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public String getDataZatr() {
        return dataZatr;
    }

    public double getPensja(){
        return pensja;
    }

    public int getId() {return id;}

    public String getDescription(){
        return getImie() + " " + getNazwisko() + " " + getDataZatr() + " " + Integer.toString(getId()) + " " + Double.toString(getPensja());
    }
}


