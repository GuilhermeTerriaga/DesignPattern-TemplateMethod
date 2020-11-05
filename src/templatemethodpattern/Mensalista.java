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
public class Mensalista extends Empregado {

    private String cargo;

    @Override
    public double calcularSalarioBruto() {
        double sBruto = 0.0;
        if ("Junior".equals(getCargo())) {
            sBruto = 2500.00;
        } else {
            if ("Pleno".equals(getCargo())) {
                return sBruto = 3500.00;
            } else {
                if ("Senior".equals(getCargo())) {
                    sBruto = 5500.00;

                }
            }

        }
       
        return sBruto;
    }

    @Override
    public double calcularBonus() {
        double bonus = 0.0;
        if ("Junior".equals(getCargo())) {
            bonus = 50.00;
        } else {
            if ("Pleno".equals(getCargo())) {
                bonus = 100.00;
            } else {
                if ("Senior".equals(getCargo())) {
                    bonus = 150.00;

                }
            }

        }
       
        return bonus;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Mensalista(String cargo) {
        this.cargo = cargo;
    }

}
