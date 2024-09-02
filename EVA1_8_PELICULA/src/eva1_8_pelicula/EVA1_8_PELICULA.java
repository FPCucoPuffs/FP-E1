/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_pelicula;
import java.util.Scanner;


/**
 *
 * @author invitado
 */
public class EVA1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("NOMBRE DE LA PELICULA");
        nombre = captu.nextLine();
        System.out.println("GENERO DE LA PELICULA");
        genero = captu.nextLine();
        System.out.println("REPARTO DE LA PELICULA");
        reparto = captu.nextLine();
        System.out.println("CLASIFICACION DE LA PELICULA");
        clasificacion = captu.nextLine();
        System.out.println("DURACIN DE LA PELICULA");
        duracion = captu.nextInt();
        
        
        
                
        
    }
    
}
