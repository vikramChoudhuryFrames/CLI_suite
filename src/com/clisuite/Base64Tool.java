package com.clisuite;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;
public class Base64Tool {
    static Scanner sc=new Scanner(System.in);
    void encoder(){
        System.out.print("What to encode? -> ");
        String text=sc.nextLine();
        String txtEnc= Base64.getEncoder().encodeToString(text.getBytes());
        System.out.println("Encoded result is -> "+txtEnc);
    }
    void decoder() {
        System.out.print("What to decode? -> ");
        String text = sc.nextLine();
        String txtDec = new String (Base64.getDecoder().decode(text));
        System.out.println("Decoded result is -> " + txtDec);
    }
}
