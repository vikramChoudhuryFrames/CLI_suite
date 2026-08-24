package com.clisuite;
public class PasswordGenerator {
    void generate(int length){
     String pool="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
     StringBuilder password=new StringBuilder();
     for(int i=0;i<length;i++){
         char index=pool.charAt((int)(Math.random()*(pool.length()+1)));
         password.append(index);
     }
System.out.println("Password Generated : "+password.toString());
    }
}
