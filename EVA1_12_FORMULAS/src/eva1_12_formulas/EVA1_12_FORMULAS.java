/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_12_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double Vo, tie, ace, dist;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("CALCULAR DISTANCIA");
        System.out.println("captura la velocidad inicial (Vo)");
        Vo = captu.nextDouble();
        System.out.println("el tiempo(t)");
        tie = captu.nextDouble();
        System.out.println("captura la aceleracion(a)");
        ace = captu.nextDouble();
        dist = Vo * tie + ace * (tie * tie) / 2.0;
        System.out.println("DISTANCIA = " + dist);
        
        
             
        
    }
    
}
