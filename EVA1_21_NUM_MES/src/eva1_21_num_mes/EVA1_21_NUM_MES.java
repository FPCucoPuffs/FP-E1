/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_21_num_mes;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_21_NUM_MES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nummes;
        Scanner captu = new Scanner(System.in);
       
        System.out.println("NUMERO DE MES (1 a 12):");
        nummes = captu.nextInt();
        captu.nextLine();
        if(nummes == 1){
            System.out.println("ENERO");
        }else if(nummes == 2){
            System.out.println("FEBRERO");
        }else if(nummes == 3){
            System.out.println("MARZO");
        }else if(nummes == 4){
            System.out.println("ABRIL");
        }else if(nummes == 5){
            System.out.println("MAYO");
        }else if(nummes == 6){
            System.out.println("JUNIO");
        }else if(nummes == 7){
            System.out.println("JULIO");
        }else if(nummes == 8){
            System.out.println("AGOSTO");
        }else if(nummes == 9){
            System.out.println("SEPTIEMRE");
        }else if(nummes == 10){
            System.out.println("OCTUBRE");
        }else if(nummes == 11){
            System.out.println("NIVIEMBRE");
        }else if(nummes == 12){
            System.out.println("DICIEMBRE");
            
            
    }
    
}
