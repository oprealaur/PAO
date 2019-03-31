package com.administratie.services;

import com.administratie.Locatari;
import com.administratie.Persoana;

public class Intretinere extends Locatari {
    private static final Intretinere instance = new Intretinere();
    private static Locatari[] listaLocatari = new Locatari[10];
    private Object Locatari;

    private Intretinere(){
        listaLocatari[0] = new Locatari(1, "Nume", 1234567890, 1234, 123, 1111);
        listaLocatari[1] = new Locatari(2, "Nume", 1234567890, 1234, 123, 1112);
        listaLocatari[2] = new Locatari(3, "Nume", 1234567890, 1234, 123, 1113);
        listaLocatari[3] = new Locatari(4, "Nume", 1234567890, 1234, 123, 1114);
        listaLocatari[4] = new Locatari(5, "Nume", 1234567890, 1234, 123, 1115);
        listaLocatari[5] = new Locatari(6, "Nume", 1234567890, 1234, 123, 1116);
        listaLocatari[6] = new Locatari(7, "Nume", 1234567890, 1234, 123, 1117);
        listaLocatari[7] = new Locatari(8, "Nume", 1234567890, 1234, 123, 1118);
        listaLocatari[8] = new Locatari(9, "Nume", 1234567890, 1234, 123, 1119);
        listaLocatari[9] = new Locatari(10, "Nume", 1234567890, 1234, 123, 1110);
    }
    
    public Locatari getOne(int numarapt){
        for(int i = 0; i < 10; i++)
            if(listaLocatari[i].getNumarapt() == numarapt)
                return Locatari[i];
    }
    
    public Locatari getOne(String nume){
        for(int i = 0; i < 10; i++)
            if(listaLocatari[i].getNume() == nume)
                return Locatari[i];
    }
}
