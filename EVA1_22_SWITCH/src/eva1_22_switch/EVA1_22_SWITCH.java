/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_22_switch;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_22_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int diasem;
        Scanner captu = new Scanner(System.in);
       
        System.out.println("NUMERO DE DIA (1 a 7):");
        diasem = captu.nextInt();
        captu.nextLine();
        
        switch(diasem){
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("LUNES");
                break;
            case 3:
                System.out.println("MARTES");
                break;
            case 4:
                System.out.println("MIERCOLES");
                break;
            case 5:
                System.out.println("JUEVES");
                break;
            case 6:
                System.out.println("VIERNES");
                break;
            case 7:
                System.out.println("SABADO");
                break;
            default:
                System.out.println("NUMERO NO VALIDO");
        }
    }
    
}
