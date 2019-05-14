package com.administratie.services;

import java.util.Date;

public class Curatenie {
    //cand, cine a facut, observatii (string)
    //de adaugat ultima data de curatenie in meniu + cine a facut
    Date dataCuratenie = new Date();
    String observatii;
    String persoanaCareACuratat;

    public Curatenie(String persoanaCuratenie, String observatiiCuratenie, Date date) {
        this.persoanaCareACuratat = persoanaCuratenie;
        this.observatii = observatiiCuratenie;
        this.dataCuratenie = date;
    }


    public String getObservatii() {
        return observatii;
    }

    public Date getDataCuratenie() {
        return dataCuratenie;
    }

    public void setDataCuratenie(Date dataCuratenie) {
        this.dataCuratenie = dataCuratenie;
    }

    public void setObservatii(String observatii) {
        this.observatii = observatii;
    }

    public void setPersoanaCareACuratat(String persoanaCareACuratat) {
        this.persoanaCareACuratat = persoanaCareACuratat;
    }

    public String getPersoanaCareACuratat() {
        return persoanaCareACuratat;
    }
}
