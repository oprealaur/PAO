package com.administratie.services;

import java.io.*;
import  java.util.Date;

public class AuditService {

    private String path = "";
    private static  PrintWriter printWriter;

    private static AuditService ourInstance = new AuditService();

    public static AuditService getInstance() {
        return ourInstance;
    }

    private AuditService() {
        try {
            printWriter = new PrintWriter(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



    private void writeMessage(String message){
        Date d = new Date();
        printWriter.println(message + " " + d);
    }

    private boolean closeWriter(){
        boolean result = true;
        printWriter.flush();
        printWriter.close();
        return result;
    }
}
