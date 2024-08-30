/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_edauto;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EVA1_7_EDAUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String marca;
        String modelo;
        int year;
        double precio;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("ESCRIBE LA MARCA");
        marca = captu.nextLine();
        System.out.println("EL MODELO");
        modelo = captu.nextLine();
        System.out.println("AHORA EL AÑO EN QUE SALIO");
        year = captu.nextInt();
        System.out.println("Y POR ULTIMO EL PRECIO");
        precio = captu.nextDouble();
        
        System.out.println("TUS DATOS");
        
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
    }
    
}
