package com.company.zajecia_01;

public class PracKatedry extends PracNaukowy {
    public PracKatedry(String imie, String nazwisko, String dataZatr, String zatrDo, int pensum, double pensja) {
        super(imie, nazwisko, dataZatr, zatrDo, pensum, pensja);
    }

    @Override
    public String getOpis() {
        return "Pracownik Katedry";
    }

    @Override
    public String getDescription(){
        return getImie() + " " + getNazwisko() + " " + getDataZatr() + " "
                + Integer.toString(getId()) + " " + Double.toString(getPensja()) + " " + getOpis() + " " + getPensum() ;
    }
}
