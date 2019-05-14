package com.administratie.services;

import com.administratie.Locatari;
import com.administratie.Persoana;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.TreeSet;

public class Intretinere extends Locatari {
    private static final Intretinere ourInstance = new Intretinere();
//    private static Locatari[] listaLocatari = new Locatari[10];
    private static final ArrayList<Locatari> listaLocatari = new ArrayList<Locatari>();
    private Object Locatari;

    public Intretinere(){
//        listaLocatari[0] = new Locatari(1, "Nume", 1234567890, 1234, 123, 1111);
//        listaLocatari[1] = new Locatari(2, "Nume", 1234567890, 1234, 123, 1112);
//        listaLocatari[2] = new Locatari(3, "Nume", 1234567890, 1234, 123, 1113);
//        listaLocatari[3] = new Locatari(4, "Nume", 1234567890, 1234, 123, 1114);
//        listaLocatari[4] = new Locatari(5, "Nume", 1234567890, 1234, 123, 1115);
//        listaLocatari[5] = new Locatari(6, "Nume", 1234567890, 1234, 123, 1116);
//        listaLocatari[6] = new Locatari(7, "Nume", 1234567890, 1234, 123, 1117);
//        listaLocatari[7] = new Locatari(8, "Nume", 1234567890, 1234, 123, 1118);
//        listaLocatari[8] = new Locatari(9, "Nume", 1234567890, 1234, 123, 1119);
//        listaLocatari[9] = new Locatari(10, "Nume", 1234567890, 1234, 123, 1110);
    }

    public void citesteLocatari(String path){
        try{
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(path));
            String line;
            String[] cuvinte;

            while (true){
                line = lineNumberReader.readLine();
                if(line == null)
                    break;
                cuvinte = line.split(",");
                creazaLocatar(cuvinte);
            }
            lineNumberReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();}
    }


    private void creazaLocatar(String[] cuvinte){
        adaugaLocatar(Integer.parseInt(cuvinte[0]), cuvinte[1], cuvinte[2],Integer.parseInt(cuvinte[3]), Integer.parseInt(cuvinte[4]), Integer.parseInt(cuvinte[5]));

    }

    public static Locatari adaugaLocatar(int numarapt, String nume, String telefon, int consum1, int consum2, int total){
        Locatari locatar = new Locatari(numarapt,nume,telefon,consum1,consum2,total);
        listaLocatari.add(locatar);
        return locatar;
    }
    
    public Locatari getOne(int numarapt){
        for(Locatari locatari : listaLocatari){
            if(locatari.getNumarapt() == (numarapt))
                return locatari;}
        return null;

    }
    
    public Locatari getOne(String nume){
        for(Locatari locatari : listaLocatari){
            if(locatari.getNume() == nume)
                return locatari;}
        return null;
    }

    public static Intretinere getInstance(){
        return ourInstance;
    }

    public static void printLocatari(){
        for(com.administratie.Locatari locatari : listaLocatari)
            locatari.printLocatar();
        System.out.println("\n");
    }

}
