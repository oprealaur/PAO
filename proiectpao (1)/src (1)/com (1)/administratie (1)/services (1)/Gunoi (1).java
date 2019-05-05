package com.administratie.services;

public class Gunoi {
//    reciclabil (tipuri) + ce s-a mai scris la curatenie, cantitate
    String tipGunoi;
    float cantitateGunoi;
    Date dataGunoi = new Data();

    public Date getDataGunoi() {
        return dataGunoi;
    }

    public void setDataGunoi(Date dataGunoi) {
        this.dataGunoi = dataGunoi;
    }

    public float getCantitateGunoi() {
        return cantitateGunoi;
    }

    public void setCantitateGunoi(float cantitateGunoi) {
        this.cantitateGunoi = cantitateGunoi;
    }

    public String getTipGunoi() {
        return tipGunoi;
    }

    public void setTipGunoi(String tipGunoi) {
        this.tipGunoi = tipGunoi;
    }

    FileTextService.getInstance().writeTextToFile(dataGunoi.toString(), "C://Users//laur_//Desktop//proiectpao (1)//files//actiuni.csv");
}
