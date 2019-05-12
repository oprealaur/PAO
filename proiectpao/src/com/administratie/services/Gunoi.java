package com.administratie.services;
import java.util.Date;

public class Gunoi {
    //    reciclabil (tipuri) + ce s-a mai scris la curatenie, cantitate
    // de adaugat ultima data cand s-a luat gunoiul, cantitatea pe fiecare tip luata
    String tipGunoi;
    float cantitateGunoi;
    Date dataGunoi = new Date();

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


}
