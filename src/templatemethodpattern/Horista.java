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
public class Horista extends Empregado {

    private int horas;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public double calcularSalarioBruto() {
        double sBruto = 50.00;
        sBruto = sBruto * getHoras();
        return sBruto;
    }

    @Override
    public double calcularBonus() {
        double bonus = 0.0;
        if (getHoras() > 30) {
            bonus = 100.00;
        } else {
            bonus = 50.00;
        }
      return bonus;
    }

    public Horista(int horas) {
        this.horas = horas;
    }

}
