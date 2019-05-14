package com.administratie;

public class Locatari extends Persoana{
    private int numarapt;
    private float suma;
    private float consum_apa_calda;
    private float consum_apa_rece;
    private float consum_gaze;
    private Apartament apt = new Apartament();
    private Persoana pers = new Persoana();

    public Locatari(int numarapt, String nume, String telefon, int consum1, int consum2, int total) {
        this.numarapt = numarapt;
        pers.setNume(nume);
        pers.setTelefon(telefon);
        this.consum_apa_calda = consum1;
        this.consum_apa_rece = consum2;
        this.suma = total;
    }

    public Locatari() {
        super();
    }

    @Override
    public void setNumarapt(int numarapt) {
        this.numarapt = numarapt;
    }


    public int getNumarapt() {
        return numarapt;
    }

    public void setConsum_apa_calda(float consum_apa_calda) {
        this.consum_apa_calda = consum_apa_calda;
    }

    public void setConsum_apa_rece(float consum_apa_rece) {
        this.consum_apa_rece = consum_apa_rece;
    }

    public void setConsum_gaze(float consum_gaze) {
        this.consum_gaze = consum_gaze;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public float getSuma() {
        return suma;
    }

    public Persoana getPers() {
        return pers;
    }

    public float getConsum_gaze() {
        return consum_gaze;
    }

    public float getConsum_apa_rece() {
        return consum_apa_rece;
    }

    public float getConsum_apa_calda() {
        return consum_apa_calda;
    }

    public Apartament getApt() {
        return apt;
    }
    public String getNume(){
        return pers.getNume();
    }

    public String getTelefon() {
        return pers.getTelefon();
    }

    public void printLocatar(){
        System.out.println(getNumarapt() + " " + getNume() + " " + getTelefon() + " " + getConsum_apa_calda() +" " + getConsum_apa_rece() +" " + getSuma());
    }
}
