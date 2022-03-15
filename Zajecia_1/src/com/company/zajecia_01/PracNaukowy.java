package com.company.zajecia_01;

import java.util.GregorianCalendar;

public abstract class PracNaukowy extends Pracownik {
    private String zatrDo;
    private int pensum;

    public PracNaukowy(String imie, String nazwisko, String dataZatr, String zatrDo, int pensum, double pensja) {
        super(imie, nazwisko, dataZatr, pensja);
        this.zatrDo = zatrDo;
        this.pensum = pensum;
    }

    public int getPensum() {
        return pensum;
    }
}
