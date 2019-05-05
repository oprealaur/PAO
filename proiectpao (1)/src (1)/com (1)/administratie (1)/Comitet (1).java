package com.administratie;

public class Comitet extends Locatari{
    private static Persoana[] listaComitet = new Persoana[4];

    private Comitet(){
        listaComitet[0] = new Persoana(1, "Ioana", 0720125216);
        listaComitet[1] = new Persoana(2, "Adelin", 0720125212);
        listaComitet[2] = new Persoana(3, "Marcu", 0720125210);
        listaComitet[3] = new Persoana(4, "Doru", 0720125211);
    }
}
