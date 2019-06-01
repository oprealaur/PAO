package com.administratie.services;

import java.io.*;
import  java.util.Date;

public class AuditService {

    private String path = "C:\\Users\\Laur\\Desktop\\Facultate\\Git\\PAO\\proiectpao\\src\\AuditFile.csv";
    private static  PrintWriter printWriter;

    private static AuditService ourInstance = new AuditService();

    public static AuditService getInstance() {
        return ourInstance;
    }

    private AuditService() {

    }


    public void writeMessage(String message, Date date){
        try {
            printWriter = new PrintWriter(new FileOutputStream(path, true));

            StringBuilder stringBuilder = new StringBuilder("");
            stringBuilder.append(message).append(" - ").append(date);

            printWriter.println();
            printWriter.print(stringBuilder.toString());

            printWriter.flush();
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
