package com.clisuite;
import java.util.Scanner;
import java.io.File;
public class TextStats {
    static long chCount,wrCount;
    void analyzeText() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Paste the source file path here -> ");
        String path = sc.nextLine();
        File toAccess = new File(path);
        if (toAccess.exists()) {
            try (Scanner toRead = new Scanner(toAccess)) {
                String line=null;
                while (toRead.hasNextLine()) {
                    line = toRead.nextLine();
                    charCount(line);
                    wordCount(line);
                }
                System.out.println("Your file has "+chCount+" characters .");
                System.out.println("Your file has "+wrCount+" words .");
            } catch (Exception e) {
                System.out.println("Error :: " + e.getMessage());
            }
        } else System.out.println("Please check the File Path !");
    }

    static long charCount(String line) {
        line = line.strip();
        ;
        for (char i : line.toCharArray())
            if (i != ' ') chCount++;
        return chCount;
    }
    static long wordCount(String line){
        wrCount+=line.trim().split("\\s+").length;
        return wrCount;
    }
}
