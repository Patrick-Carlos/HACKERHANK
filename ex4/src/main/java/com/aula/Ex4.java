package com.aula;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);

int inteiro = scanner.nextInt();
double duplo = scanner.nextDouble();
scanner.nextLine();
String letras = scanner.nextLine();

scanner.close();


System.out.println("String: " + letras);
System.out.println("Double: " + duplo);
System.out.println("Int: " + inteiro);
}
}
