package taller21.pkg260326;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anair
 */
public class ListaEnlazada {
    Nodo cabeza;//es el primer nodo de la lista

   public void agregar(int dato){//metodo para agregar o insertar
       Nodo nuevo = new Nodo(dato);
       
       if (cabeza==null){//si la lista esta vacia
           cabeza=nuevo;
       }else{
           Nodo aux=cabeza; //nodo auxiliar para recorrer
           
           while(aux.siguiente!=null){//para el siguiente 
               aux=aux.siguiente;
           }
           aux.siguiente = nuevo;//para insertar al final
       }
   }
   public void mostrar(){//se crea el metodo para mostarlo
       Nodo aux =cabeza; //para que incie desde la cabeza
       
       while(aux!=null){ //con esto se recorre la lista hasta el final
           System.out.print(aux.dato + " ");//se imprime el dato
           aux = aux.siguiente;
       }
       //AQUI HAY UN ERROR
   }
   public void ordenar(){//se crea el metodo para ordenar la lista
       if(cabeza==null){//en caso de que la lista este vacia
           return;
       }
       Nodo actual;
       Nodo siguiente;
       //AQUI FALTA HACER UN FOR PARA ORDENAR LA LISTA
   }
}
