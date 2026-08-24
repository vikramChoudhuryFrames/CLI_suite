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
                c = sc.nextInt();
            }
            else c=4;
            switch(c) {
                case 1://Password Generator
                    PasswordGenerator e1 = new PasswordGenerator();
                    System.out.println("Enter the length of password required : ");
                    int l = sc.nextInt();
                    e1.generate(l);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("==========End of Program==========\n");
                    System.exit(0);
                    break;
            }
            System.out.println("Continue ? Y/N : ");
             ch=(sc.next()).charAt(0);
        }
    }
}