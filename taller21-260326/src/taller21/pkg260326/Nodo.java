package taller21.pkg260326;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anair
 */
public class Nodo { //se crea la clase nodo
    int dato;//crear el entero n 
    Nodo siguiente; //apunta al siguiente nodo
    
    public Nodo (int dato){
        this.dato=dato; //se le asigna dato
        this.siguiente=null; 
    }
}
