package com.administratie;

public class Persoana extends Apartament{
    private int numarapt;
    private String nume;
    private String telefon;
    private Apartament apt;

    public Persoana(int numarapt, String nume, String telefon) {
        this.numarapt = numarapt;
        this.nume = nume;
        this.telefon = telefon;
    }

    public Persoana() {

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

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setApt(Apartament apt) {
        this.apt = apt;
    }

    public String getNume() {
        return nume;
    }

    public String getTelefon() {
        return telefon;
    }
}
