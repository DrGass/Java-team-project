package com.company.zajecia_01;

public class KierownikKatedry extends PracNaukowy {

    private double dodatekFunkcyjny;

    public KierownikKatedry(String imie, String nazwisko, String dataZatr, int id, String zatrDo,
                            int pensum, double pensja, double dodatekFunkcyjny) {
        super(imie, nazwisko, dataZatr, zatrDo, pensum, pensja);
        this.dodatekFunkcyjny = dodatekFunkcyjny;
    }
    public String getOpis() {return "Kierownik Katedry";}
    public double getPensja() {
        return (super.getPensja() + dodatekFunkcyjny);
    }

    @Override
    public String getDescription(){
        return getImie() + " " + getNazwisko() + " " + getDataZatr() + " "
                + Integer.toString(getId()) + " " + Double.toString(getPensja()) + " " + getOpis() + " " + getPensum() ;
    }


}
