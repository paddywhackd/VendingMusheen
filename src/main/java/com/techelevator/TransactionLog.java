package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TransactionLog {
    //public void transactionLog(String slotID, String formatDateOutput, )

    File logFile = new File("Log.txt");
    FileOutputStream fos;
    Scanner logInput = new Scanner(System.in);

    public String formatDateOutput() {
        String dateTime = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(new Date());
        return dateTime;
    }


    {
        try {

            fos = new FileOutputStream(logFile, true);
            PrintWriter logger = new PrintWriter(fos);
            logger.printf(formatDateOutput());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


  }
