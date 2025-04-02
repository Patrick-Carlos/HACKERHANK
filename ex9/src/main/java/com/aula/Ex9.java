package com.aula;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        
        while (scanner.hasNext()) {
            System.out.println(lineNumber + " " + scanner.nextLine());
            lineNumber++;
        }
        
        scanner.close();
    }
}
