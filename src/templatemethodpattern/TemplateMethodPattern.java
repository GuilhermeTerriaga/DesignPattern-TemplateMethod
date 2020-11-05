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
public class TemplateMethodPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Empregado horista = new Horista(42);
    Empregado mensalista = new Mensalista("Senior");
    
    mensalista.setNome("Arthur Dent mensalista");
    horista.setNome("Frodo Bolseiro horista");
    
        System.out.println(horista.calcularSalarioLiquido());
        System.out.println(mensalista.calcularSalarioLiquido());
    }
    
}
