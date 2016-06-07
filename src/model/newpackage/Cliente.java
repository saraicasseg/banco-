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
public class Cliente {
    private String nombre;
    private String apellidos;
    private String fechaDeNacimiento;
    private String direccion;
    private String ocupacion;
    private String telefono;
    private String email;
    
    public Cliente(String nombre,String apellidos ){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setFechaDeNacimiento(String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public String getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    public String getOcupacion(){
        return ocupacion;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }
 }   
