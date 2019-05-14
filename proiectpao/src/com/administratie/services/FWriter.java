package com.administratie.services;

import com.administratie.Locatari;

import java.io.*;

public class FWriter {
    private static FWriter ourInstance = new FWriter();

    public static FWriter getInstance() {
        return ourInstance;
    }

    private FWriter() {
    }

    private void writeToFile (String textToWrite, String path) {

        try {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(path,true));
            printWriter.println();
            printWriter.print(textToWrite);
            printWriter.flush();
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeLocatar(Locatari locatari, String path){

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(locatari.getNumarapt()).append(",").append(locatari.getNume()).append(",").append(locatari.getTelefon())
                .append(",").append(locatari.getConsum_apa_calda()).append(",").append(locatari.getConsum_apa_rece()).append(",").append(locatari.getSuma());

        writeToFile(stringBuilder.toString(),path);

    }

    public void garbageEntry(Gunoi gunoi, String path){
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Tip gunoi: ").append(gunoi.getTipGunoi()).append("\nCantitate gunoi: ").append(gunoi.getCantitateGunoi()).append("\nData: ").append(gunoi.getDataGunoi()).append("\n");
        writeToFile(stringBuilder.toString(),path);
    }

    public void curatenieEntry(Curatenie curatenie, String path){
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Persoana care a facut curatenie: ").append(curatenie.getPersoanaCareACuratat()).append("\nObservatii: ").append(curatenie.getObservatii()).append("\nData: ").append(curatenie.getDataCuratenie()).append("\n");
        writeToFile(stringBuilder.toString(),path);
    }

}
