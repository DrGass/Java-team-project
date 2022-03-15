package com.company.zajecia_01;

import java.util.ArrayList;
import java.util.List;

//import com.company.zajecia_01.Pracownik;
public class Main {

    public static void main(String[] args) {
        PracKatedry pracKatedry = new PracKatedry("Marek", "Kacprzak","21.01.2020","21.02.2021",200,6000);
        PracAdmin pracAdmin = new PracAdmin("Jarek","Petrol","20.02.2020",2,"pelny",352);
        KierownikKatedry kierownikKatedry = new KierownikKatedry("Darek","Górski",
                "23.03.2020", 3,"24.05.2021", 250,6000,4000);

        List<Pracownik> pracownicy = new ArrayList<Pracownik>();
        pracownicy.add(pracKatedry);
        pracownicy.add(pracAdmin);
        pracownicy.add(kierownikKatedry);

        pracownicy.forEach(pracownik -> {
            System.out.println(pracownik.getDescription());
        });

    }
}
