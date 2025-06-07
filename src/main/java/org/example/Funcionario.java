package org.example;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxaImposto;

    public double salarioLiquido(){
        return salarioBruto - taxaImposto;
    }

    public double aumentoSalario(double porcentagem){
        return salarioBruto += salarioBruto * porcentagem / 100.00;
    }

    public String toString(){
        return nome + ", R$" + String.format("%.2f", salarioLiquido());
    }
}
