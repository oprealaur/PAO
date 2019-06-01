package com.administratie;

import com.administratie.Persoana;

public class Administrator extends Persoana{
    private float salariu = 4000;

    public Administrator(int numarapt, String nume, String telefon) {
        super(numarapt, nume, telefon);
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public float getSalariu() {
        return salariu;
    }

    public Administrator(){};
}
