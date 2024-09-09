/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CAPTURAR EDAD
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("QUE EDAD TIENES?");
        edad = captu.nextInt();
        
      
        if(edad >= 18){System.out.println("adulto: mayor de edad:");}
        else{System.out.println("Menor de edad.");}
  
    }
