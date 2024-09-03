/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_operaciones;

/**
 *
 * @author invitado
 */
public class EVA1_9_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //OPERACIONES ARITMETICAS
        //inicializacion de una variable 
        int x = 10; //declaracion y asignacion
        int y = 5; 
        
        //si  nececitan muchan variables
        int suma, resta, mult, div, pot, raiz;
        
        //suma 
        suma = x + y; //operador de suma +
        System.out.println("la suma de x + y es:");
        System.out.println(suma);
       
        //resta
        resta = x - y; //operador de resta -
        System.out.println("la resta de x - y es:");
        System.out.println(resta);
                
        //mutliplicacion
        mult = x * y;
        System.out.println("la multiplicacion de x * y es :");
        System.out.println(mult);
        
        //division
        div = x / y;
        System.out.println("la division entre x / y es:");
        System.out.println(div);
        x = 5;
        y = 2;
        div = x / y;
        System.out.println("la division entre 5 / 2 es:");
        System.out.println(div);
        
        //division con numeros decimales 
        double val1 = 5;
        double val2 = 2;
        double resu;
        resu = val1 / val2;
        System.out.println("division entre 5 / 2 decimal es:");
        System.out.println(resu);
        
        
        
        
        
        
        
        
    }
    
}
