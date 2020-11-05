/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethodpattern;

/**
 *
 * @author guilherme
 */
public abstract class Empregado {

    private String nome;

    public double calcularSalarioLiquido() {
        double sLiquido = 0.00;
        System.out.println("nome:" + getNome() + "\nSalario Líquido:");
        return (sLiquido + ((calcularSalarioBruto() + calcularBonus()) - calcularINSS()));

    }

    public double calcularINSS() {
        double inss = calcularSalarioBruto() * 0.11;
        System.out.println("Inss:"+inss);
        return inss;
    }

    public abstract double calcularSalarioBruto();

    public abstract double calcularBonus();
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
