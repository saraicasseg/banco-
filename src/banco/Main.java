/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;
import model.newpackage.Cliente;
import model.newpackage.CuentaBancaria;

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
        
       
        
        CuentaBancaria cuenta = new CuentaBancaria(12,"sarai","apellidos");
        Cliente cliente = cuenta.getCliente();
        cliente.setFechaDeNacimiento("18/12/96");
        cliente.setDireccion("calle a");
        cliente.setOcupacion("estudiante");
        cliente.setEmail("124@gmail");
        cliente.setTelefono("123456");
      
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getApellidos());
        System.out.println(cliente.getFechaDeNacimiento());
        System.out.println(cliente.getDireccion());
        System.out.println(cliente.getOcupacion());
        System.out.println(cliente.getEmail());
        System.out.println(cliente.getTelefono());
        
        
   }}       
