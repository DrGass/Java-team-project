package com.company.zajecia_01;

public class PracAdmin extends Pracownik {
    private String etat;

    public PracAdmin(String imie, String nazwisko, String dataZatr, int id, String etat, double pensja) {
        super(imie, nazwisko, dataZatr, pensja);
        this.etat = etat;
    }

    @Override
    public String getOpis() {
        return "Pracownik Administracyjny";
    }

    public String getEtat() {
        return etat;
    }

    public String getDescription(){
        return getImie() + " " + getNazwisko() + " " + getDataZatr() + " "
                + Integer.toString(getId()) + " " + Double.toString(getPensja()) + " " + getEtat() + " " + getOpis() + " ";
    }

}
