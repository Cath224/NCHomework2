package com.netcracker.homework.ch2.ex13;

import java.io.*;

public class CSV {
    public static void main(String[] args) throws Exception {
        String file = "Bible.csv";
        CSVReader csvReader = new CSVReader(new FileReader(file));
        String string = " ";
        while ((string = csvReader.readNext()) != null) {
            String[] information = string.split(",");
            System.out.println("Important date: " + information[0]  + " , Event:" +information[2] + ",Сharacter " + information[3]);
        }
    }
}
