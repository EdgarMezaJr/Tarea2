/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconcurrente;

/**
 *
 * @author edgar
 */
public class NumeroBall {
    private int conta=0;
    NumeroBall(){
        conta = 1; 
    }

    public int getConta() {
        return conta;
    }


    public void setConta(int conta) {
        this.conta = conta;
    }
}
