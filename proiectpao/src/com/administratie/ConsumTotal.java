package com.administratie;

import com.administratie.services.Intretinere;

import java.util.ArrayList;

public class ConsumTotal{
    private float consumapacalda = 0;
    private float getConsumaparece = 0;
    private float sumatotala = 0;

    public void setConsumapacalda(float consumapacalda) {
        this.consumapacalda = consumapacalda;
    }

    public void setConsumaparece(float getConsumaparece) {
        this.getConsumaparece = getConsumaparece;
    }

    public void setSumatotala(float sumatotala) {
        this.sumatotala = sumatotala;
    }

    public float getConsumapacalda() {
        return consumapacalda;
    }

    public float getConsumaparece() {
        return getConsumaparece;
    }

    public float getSumatotala() {
        return sumatotala;
    }

    public void adaugaConsumCalda(float numar){
        this.consumapacalda = this.consumapacalda + numar;
    }

    public void adaugaConsumRece(float numar){
        this.setConsumaparece(this.getConsumaparece()+numar);
    }

    public void adaugaSuma(float numar){
        this.setSumatotala(this.getSumatotala()+numar);
    }
}
