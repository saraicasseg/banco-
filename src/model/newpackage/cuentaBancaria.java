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
public class cuentaBancaria {
    private int numeroCuenta;
    private String cliente;
    private double saldo;
    
    public cuentaBancaria(int numeroCuenta, String cliente){
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
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
}}
   
    
    
      

       
      
    
          
