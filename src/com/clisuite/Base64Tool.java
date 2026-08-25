package com.clisuite;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;
import java.nio.file.Files;
import java.io.File;
public class Base64Tool {
    static Scanner sc=new Scanner(System.in);
    void encoder() {
        System.out.print("Encode text or image ? T/I :");
        String c = sc.next();
        sc.nextLine();
        if (c.equalsIgnoreCase("T")) {
            System.out.print("What text to encode ? -> ");
            String text = sc.nextLine();
            String txtEnc = Base64.getEncoder().encodeToString(text.getBytes());
            System.out.println("Encoded result is -> " + txtEnc);
        } else {
            while(true) {
                byte[] img = null;
                System.out.print("Enter path of image to encode . -> ");
                String imgPath = sc.nextLine();
                File toAccess = new File(imgPath);
                if (toAccess.exists()) {
                    try {
                        img = Files.readAllBytes(toAccess.toPath());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    String imgEnc = Base64.getEncoder().encodeToString(img);
                    System.out.println("Encoded result is -> " + imgEnc);
                    break;
                } else {
                    System.out.println("Error in file path. Re-enter path ? Y/N");
                    String fc=sc.next();
                    if(fc.equalsIgnoreCase("Y")) continue;
                    else break;
                }
            }
            }
        }
    void decoder() {
        System.out.print("What to decode? -> ");
        String text = sc.nextLine();
        String txtDec = new String (Base64.getDecoder().decode(text));
        System.out.println("Decoded result is -> " + txtDec);
    }
}
