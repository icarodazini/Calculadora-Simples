package org.example;

import java.util.Scanner;

public class funcoes {
    public static void funcao() {
        String operacao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha sua operação: somar, subtrair, multiplicar, dividir.");
        operacao = entrada.nextLine();

        switch( operacao )
        {
            case "somar":
                FuncaoSoma.somar();
                break;

            case "subtrair":
                FuncaoSubitrair.subtrair();
                break;

            case "multiplicar":
                FuncaoMultiplicar.multiplicar();
                break;

            case "dividir":
                FuncaoDivisao.dividir();
                break;

            default:
                System.out.printf("Você digitou uma operação inválida.");
        }
    }
}
