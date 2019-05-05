package com.administratie.services;

import java.util.Date;

public class Curatenie {
//cand, cine a facut, observatii (string)
    Date dataCuratenie = new Data();
    String observatii;

    FileTextService.getInstance().writeTextToFile(dataCuratenie.toString(), "C://Users//laur_//Desktop//proiectpao (1)//files//actiuni.csv");

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
}
