package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Qual o nome do funcionário?");
        funcionario.nome = sc.next();

        System.out.println("Qual o seu salário bruto?");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.println("Qual a taxa de imposto?");
        funcionario.taxaImposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + funcionario.toString());

        System.out.println();
        System.out.println("Qual a porcentagem de aumento?");
        double porcentagem = sc.nextDouble();
        funcionario.aumentoSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);

        sc.close();
    }
}