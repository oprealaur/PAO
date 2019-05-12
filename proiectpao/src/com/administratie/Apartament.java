package com.administratie;

public class Apartament {
    private int numar;
//    private float cota;
//    private int numarpers;

    public Apartament(int numar){
        this.numar = numar;
    }

    public Apartament(){

    }
//    public void setCota(float cota) {
//        this.cota = cota;
//    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

//    public float getCota() {
//        return cota;
//    }

    public int getNumar() {
        return numar;
    }
}
