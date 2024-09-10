/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_15_aguilasello;

/**
 *
 * @author invitado
 */
public class EVA1_15_AGUILASELLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //0.0 -- 0.99999999
        System.out.println("VOLADO");
        System.out.println("SI SALE MENOR QUE .5 ES AGUILA, SI ES MAYOR ES SELLO");
        
        double valor = Math.random();
        System.out.println(Math.random());
        if(valor <= 0.5){System.out.println("AGUILA");}
        else{System.out.println("SELLO");}
        
    }
    
}
