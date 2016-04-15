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
public class cuentaDeAhorro {
    private int numeroCuenta;
    private String cliente;
    private double saldo;
    private double tasaDeInteres;
    private double comisionPorSaldo;
    
    public cuentaDeAhorro(int numeroCuenta, String cliente){
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.tasaDeInteres = .25;
        this.comisionPorSaldo = 50;
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
        boolean retirarSeRealizo ; 
        if (cantidad <= saldo){
            this.saldo = this.saldo -cantidad;
            retirarSeRealizo = true;
        }
        else{
           retirarSeRealizo =  false; 
           
       }
        return retirarSeRealizo;
    
       }
       public double calcularInteres(){
           double interes = 0;
           interes =((saldo * this.tasaDeInteres)/100);
           return interes;
        }
       public double comisionPorSaldo(){
           double comision = 0;
           if(saldo < 1000){
               comision = 50;
           }
           else{
               comision = 0;
           }
           return comision;
       }
       public void corteMensual(){
           this.saldo = (saldo + this.calcularInteres()) - this.comisionPorSaldo;
       }
       
       
}
