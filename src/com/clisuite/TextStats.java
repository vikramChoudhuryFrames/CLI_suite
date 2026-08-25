package com.clisuite;
import java.util.Scanner;
import java.io.File;
public class TextStats {
    void analyzeText() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Paste the source file path here -> ");
        String path = sc.nextLine();
        File toAccess = new File(path);
        if (toAccess.exists()) {
            try (Scanner toRead = new Scanner(toAccess)) {
                while (toRead.hasNextLine()) {
                    String line = toRead.nextLine();
                    System.out.println("Your file has "+charCount(line)+" characters .");
                    System.out.println("Your file has "+wordCount(line)+" words .");
                }
            } catch (Exception e) {
                System.out.println("Error :: " + e.getMessage());
            }
        } else System.out.println("Please check the File Path !");
    }

    static long charCount(String line) {
        line = line.strip();
        long c = 0;
        for (char i : line.toCharArray())
            if (i != ' ') c++;
        return c;
    }
    static long wordCount(String line){
        long r=line.trim().split("\\s+").length;
        return r;
    }
}
