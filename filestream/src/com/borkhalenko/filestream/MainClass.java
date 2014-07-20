package com.borkhalenko.filestream;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class MainClass {
    public static void main(String[] args) throws IOException{
        Scanner inFile=new Scanner(new FileInputStream(".//filestream//files//data.dat"),"UTF-8");   //Linux
        //Scanner inFile=new Scanner(new FileInputStream(".\\filestream\\files\\data.dat"),"UTF-8"); //Windows
        int count=0;
        while (inFile.hasNext()){
            Event event=parseToEvent(inFile.nextLine());
            System.out.println(event.toString());
        }
        System.out.println("Count:" + count);
        System.out.println(System.getProperty("path.separator"));
    }

    public static Event parseToEvent(String str) {
        String[] tokens = str.split("\\|");
        String[] attenders = tokens[3].substring(1, tokens[3].length() - 1).split(",");
        List<String> list = arrToCollection(attenders);
        Event event = new Event.EventBuilder()
                .id(UUID.fromString(tokens[0]))
                .title(tokens[1])
                .description(tokens[2])
                .attenders(list)
                .timeStart(stringToJodaTime(tokens[4]))
                .timeEnd(stringToJodaTime(tokens[5]))
                .build();
        return event;
    }


    private static List<String> arrToCollection(String[] array){
        List<String> collection=new ArrayList<String>(array.length);
        for (String o:array){
            collection.add(o);
        }
        return collection;
    }

    private static DateTime stringToJodaTime(String s){
        final String DATE_FORMAT_PATTERN="dd-MM-yyyy HH:mm:ss";
        DateTimeFormatter formatter =
                DateTimeFormat.forPattern(DATE_FORMAT_PATTERN).withOffsetParsed();
        return formatter.parseDateTime(s);
    }
}
