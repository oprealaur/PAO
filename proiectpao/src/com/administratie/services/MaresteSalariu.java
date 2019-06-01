package com.administratie.services;

import com.administratie.Administrator;

public class MaresteSalariu extends Administrator {
    private static MaresteSalariu ourInstance = new MaresteSalariu();

    public static MaresteSalariu getInstance() {
        return ourInstance;
    }

    private MaresteSalariu() {
    }


    public void marestesalariu(float numar){
        super.setSalariu(super.getSalariu()*numar);
    }
}
