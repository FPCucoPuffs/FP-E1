/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_19_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int km, mes;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("INGRESA LOS MESES");
        km = captu.nextInt();
        System.out.println("INGREA EL KILOMETRAJE");
        mes = captu.nextInt();
        if((km >= 5000) || (mes >= 6)){
            System.out.println("CAMBIO DE CAEITE");
        }else{
            System.out.println("TODO ESTA BIEN CON TU AUTO");
            
            
        }
        
        
    }
    
}
