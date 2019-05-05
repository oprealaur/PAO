package com.administratie;

public class Locatari extends Persoana{
    private float suma;
    private float consum_apa_calda;
    private float consum_apa_rece;
    private float consum_gaze;
    Apartament apt;
    Persoana pers;

    public Locatari(int numarapt, String nume, int telefon, int consum1, int consum2, int total){
        apt.setNumar(numarapt);
        pers.setNume(nume);
        pers.setTelefon(telefon);
        this.consum_apa_calda = consum1;
        this.consum_apa_rece = consum2;
        this.suma = total;
    }

    public Locatari() {
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

    public int getTelefon() {
        return pers.getTelefon();
    }
}
