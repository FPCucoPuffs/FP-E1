/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_entrada_datos2;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EVA1_6_ENTRADA_DATOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String curp;
        int edad;
        double promedio;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("CAPTURA DE NOMBRE COMPLETO");
        nombre = captu.nextLine();
        System.out.println("CAPTURA DE CURP");
        curp = captu.nextLine();
        System.out.println("CAPTURA TU EDAD");
        edad = captu.nextInt();
        System.out.println("CAPTURA TU RPOMEDIO");
        promedio = captu.nextDouble();
        
        System.out.println("TUS DATOS");
        
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
        
        
             
    }
    
}
