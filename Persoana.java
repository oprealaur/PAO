package com.administratie;

public class Persoana extends Apartament{
    private int numarapt;
    private String nume;
    private int telefon;
    private Apartament apt;

    public Persoana(int numarapt, String nume, int telefon) {
        this.numarapt = numarapt;
        this.nume = nume;
        this.telefon = telefon;
    }

    public void setNumarapt(int numarapt) {
        this.numarapt = numarapt;
    }

    public int getNumarapt() {
        return numarapt;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setApt(Apartament apt) {
        this.apt = apt;
    }

    public String getNume() {
        return nume;
    }

    public int getTelefon() {
        return telefon;
    }
}
