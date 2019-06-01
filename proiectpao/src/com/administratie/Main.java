package com.administratie;
import com.administratie.*;
import com.administratie.services.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String dateLocatari = "C:\\Users\\Laur\\Desktop\\Facultate\\Git\\PAO\\proiectpao\\src\\DateLocatari.csv";
        String outLocatari = "C:\\Users\\Laur\\Desktop\\Facultate\\Git\\PAO\\proiectpao\\src\\OutLocatari.csv";
        String outGunoi = "C:\\Users\\Laur\\Desktop\\Facultate\\Git\\PAO\\proiectpao\\src\\IstoricGunoi.csv";
        String outCuratenie = "C:\\Users\\Laur\\Desktop\\Facultate\\Git\\PAO\\proiectpao\\src\\IstoricCuratenie.csv";

        Date date = new Date();



        Intretinere.getInstance().citesteLocatari(dateLocatari);

        int cerere;
        Scanner myInput = new Scanner(System.in);

        while (true){
            System.out.println("\nCereri:\n1.Afisare locatari \n2.Adauga locatar \n3.Intrare gunoi \n4.Intrare curatenie \n5.Mareste salariu administrator \n6.Iesire");

            Locatari locatar = null;

            cerere = myInput.nextInt();
            myInput.nextLine();

            if(cerere == 1){
                Intretinere.printLocatari();
                AuditService.getInstance().writeMessage("Am afisat locatarii", date);
            }

            else if(cerere == 2){
                System.out.println("Numar apartament: ");
                int numarapt = myInput.nextInt();
                System.out.println("Nume locatar: ");
                String linieGoala = myInput.nextLine();
                String nume = myInput.nextLine();
                System.out.println("Telefon locatar: ");
                String telefon = myInput.nextLine();
                System.out.println("Consum apa calda: ");
                int consum1 = myInput.nextInt();
                System.out.println("Consum apa rece: ");
                int consum2 = myInput.nextInt();
                System.out.println("Total intretinere: ");
                int total = myInput.nextInt();

                locatar = Intretinere.adaugaLocatar(numarapt,nume,telefon,consum1,consum2,total);
                FWriter.getInstance().writeLocatar(locatar, outLocatari);

                AuditService.getInstance().writeMessage("Am adaugat locatar nou: "+ locatar.getNume(), date);
            }

            else if(cerere == 3){
                System.out.println("Tipul gunoiului: ");
                String tipgunoi = myInput.nextLine();
                System.out.println("Cantitate gunoi: ");
                float cantitategunoi = myInput.nextFloat();
                Gunoi gunoi = new Gunoi(tipgunoi,cantitategunoi,date);
                FWriter.getInstance().garbageEntry(gunoi,outGunoi);

                AuditService.getInstance().writeMessage("S-a luat gunoiul ", date);
            }

            else if(cerere == 4){
                System.out.println("Persoana care a facut curatenie: ");
                String persoanaCuratenie = myInput.nextLine();
                System.out.println("Observatii: ");
                String observatiiCuratenie = myInput.nextLine();
                Curatenie curatenie = new Curatenie(persoanaCuratenie, observatiiCuratenie, date);
                FWriter.getInstance().curatenieEntry(curatenie,outCuratenie);

                AuditService.getInstance().writeMessage("S-a facut curatenie ", date);
            }

            else if (cerere == 5){
                System.out.println("Cu cat se mareste salariul?");
                float numarmarire = myInput.nextFloat();
                MaresteSalariu.getInstance().marestesalariu(numarmarire);
                System.out.println("Salariul marit este: " + MaresteSalariu.getInstance().getSalariu());
            }

            else break;
        }







    }
}
