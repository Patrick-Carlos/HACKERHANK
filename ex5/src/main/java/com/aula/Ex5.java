package com.aula;

import java.util.Scanner;


public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        
        for (int i = 0; i < 3; i++) {
            if (scanner.hasNext()) {
                String text = scanner.next();
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    System.out.printf("%-15s%03d%n", text, number);
                }
            }
        }
        
        System.out.println("================================");
        scanner.close();
    }
}
