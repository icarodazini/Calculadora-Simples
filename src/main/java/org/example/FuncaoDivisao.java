package org.example;

import java.util.Scanner;

public class FuncaoDivisao {

    public static void dividir() {
        Scanner ScannerCapturaEntradaDoUsuario = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        long num1 = ScannerCapturaEntradaDoUsuario.nextInt();

        System.out.println("Informe o segundo numero");
        long num2 = ScannerCapturaEntradaDoUsuario.nextInt();

        long resultado = num1 / num2;
        System.out.println("Seu resultado é " + resultado);

        ScannerCapturaEntradaDoUsuario.close();
    }
}

