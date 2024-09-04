/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_converciones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_CONVERCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fahr, cent, kelv;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("captura los °Fahrenheit (Para convertir a °C):");
        fahr = captu.nextDouble();
        cent = (fahr - 32) / 1.8;
        System.out.println("°C = " + cent);
        System.out.println("captura los °Centigrados (Para convertir a °F):");
        cent = captu.nextDouble();
        fahr = cent * 1.8 + 32;
        System.out.println("°F = " + fahr);
        System.out.println("captura los °C (Para convertir a °K)");
        cent = captu.nextDouble();
        kelv = cent + 275.15;
        System.out.println("°K = " + kelv);
        System.out.println("LISTO C:");
        
        
        
        
        
        
        
        
        
        
    }
    
}
