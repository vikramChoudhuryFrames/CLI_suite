package com.clisuite;

public class SystemInfoTool {

    public static void displayInfo() {
        System.out.println("\n--- System Diagnostics ---");
        System.out.println("OS Name: " + System.getProperty("os.name"));
        System.out.println("OS Architecture: " + System.getProperty("os.arch"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());

        long freeMem = Runtime.getRuntime().freeMemory() / (1024 * 1024);
        long totalMem = Runtime.getRuntime().totalMemory() / (1024 * 1024);
        System.out.println("JVM Free Memory: " + freeMem + " MB");
        System.out.println("JVM Total Memory: " + totalMem + " MB");
        System.out.println("--------------------------\n");
    }
}