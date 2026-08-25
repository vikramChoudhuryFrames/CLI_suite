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

                }
            } catch (Exception e) {
                System.out.println("Error :: " + e.getMessage());
            }
        } else System.out.println("Please check the File Path !");
    }

    static int charCount(String line) {

    }
}
