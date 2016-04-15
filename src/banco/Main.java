/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author ewewe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese Su Numero De Cuenta: ");
        int numeroCuenta = entrada.nextInt();
        System.out.print("ingrese Su Nombre: ");
        String cliente = entrada.next();
        System.out.print("Accion que quiere realizar: ");
        int accion = entrada.nextInt();
        
        cuentaBancaria misAhorros = new cuentaBancaria(numeroCuenta,cliente);
            
        
        
       
        
        
        
        
    }
       
        
    }
    
}
