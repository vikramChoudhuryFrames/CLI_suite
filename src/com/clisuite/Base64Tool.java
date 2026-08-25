package com.clisuite;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;
public class Base64Tool {
    void encoder(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text to encode -> ");
        String text=sc.nextLine();
        String txtEnc= Base64.getEncoder().encodeToString(text.getBytes());
        System.out.println("Encode text is -> "+txtEnc);
    }
}
