package com.clisuite;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch='Y';
        int c=0;
        while(true){
            if(ch=='Y') {
                System.out.println("==========Developer CLI Suite==========\n");
                System.out.println(":: 1 ::Generate Password\n");
                System.out.println(":: 2 ::Word and Line Counter\n");
                System.out.println(":: 3 ::Base64 EnCoder/ Decoder\n");
                System.out.println(":: 4 ::Exit\n");
                System.out.print("Choice : ");
                c = sc.nextInt();
                System.out.println();
            }
            else c=4;
            switch(c) {
                case 1://Password Generator
                    PasswordGenerator e1 = new PasswordGenerator();
                    System.out.println("Enter the length of password required : ");
                    int l = sc.nextInt();
                    e1.generate(l);
                    break;
                case 2://Text File Analyzer
                    TextStats e2=new TextStats();
                    e2.analyzeText();
                    break;
                case 3://Base64 encoder and Decoder
                    Base64Tool e3=new Base64Tool();
                    System.out.println("Encode or Decode ? E/D");
                    String co=sc.next();
                    if(co.equalsIgnoreCase("E")) e3.encoder();
                    else e3.decoder();

                break;
                case 4:
                    System.out.println("=========End of Program=========\n");
                    ex e4 =new ex();
                    e4.exi();
                    break;
            }
            System.out.print("Continue ? Y/N : ");
             ch=(sc.next()).charAt(0);
        }
    }
}