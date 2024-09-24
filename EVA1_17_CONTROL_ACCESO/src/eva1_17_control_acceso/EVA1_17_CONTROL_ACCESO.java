/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_17_CONTROL_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usu, pwd;
        Scanner captu = new Scanner(System.in);
        System.out.println("Usuario: ");
        usu = captu.nextLine();
        System.out.println("Contraseña: ");
        pwd = captu.nextLine();
        if (usu.equals("Admin") && pwd.equals("1234")){
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Acceso denegado");
        }
        
        
        
    }
    
}
