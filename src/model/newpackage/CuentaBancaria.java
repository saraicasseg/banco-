/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.newpackage;

/**
 *
 * @author ewewe
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private Cliente cliente;
    private double saldo;
    
    public CuentaBancaria(int numeroCuenta, String nombre, String apellidos){
        this.numeroCuenta = numeroCuenta;
        this.cliente = new Cliente(nombre, apellidos);
        this.saldo = 0.0;
    }
    public double getSaldo(){
        return saldo;
    }
   public boolean depositar(double cantidad){
        boolean depositoRealizado;
       if (cantidad >0){
        this.saldo = this.saldo + cantidad ;
          depositoRealizado =  true;
        }
       else {
           depositoRealizado =  false;
        }
        return false;
    }
   
       public boolean retirar(double cantidad){
        boolean retirarSeRealizo;
        if (cantidad <= saldo){
            this.saldo = this.saldo -cantidad;
            retirarSeRealizo = true;
        }
        else{
           retirarSeRealizo =  false; 
           
       }
        return false;
       
        }
       public Cliente getCliente(){
           return cliente;
       }
}
   
    
    
      

       
      
    
          
