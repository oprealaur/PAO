package com.administratie;
import com.administratie.*;
import com.administratie.services.Intretinere;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String dateLocatari = "C:\\Users\\laur_\\Desktop\\Facultate\\An 2\\Sem 2\\proiectpao\\src\\DateLocatari.csv";
        Intretinere.getInstance().citesteLocatari(dateLocatari);

        Intretinere.printLocatari();
    }
}
