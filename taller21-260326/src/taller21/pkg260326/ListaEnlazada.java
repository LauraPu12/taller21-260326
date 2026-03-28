package taller21.pkg260326;

public class ListaEnlazada {
    Nodo cabeza;//es el primer nodo de la lista
    int tamaño; 
    
    public ListaEnlazada(){ //constructir vacio
        cabeza=null;
        tamaño=0; //inicialente el tamaño es 0
    }

   public void agregar(int dato){//metodo para agregar o insertar
       Nodo nuevo = new Nodo(dato);
       
       if (cabeza==null){//si la lista esta vacia
           cabeza=nuevo; //aqui el nuevo nodo es la cabeza
       }else{
           Nodo aux=cabeza; //nodo auxiliar para recorrer
           
           while(aux.siguiente!=null){//para el siguiente mientras no sea el ultimo
               aux=aux.siguiente;
           }
           aux.siguiente = nuevo;//para insertar al final
       }
       tamaño++;
   }
   
   public void ordenar(){//se crea el metodo para ordenar la lista
       if(cabeza==null){//en caso de que la lista este vacia
           return;
       }
      boolean orden;
      do{
          orden=false; //verifica si hubo cambios
          Nodo actual=cabeza;
          
          while(actual.siguiente!=null){
              if(actual.dato>actual.siguiente.dato){//ver si el actual es mayor para ordenar
                  int guar=actual.dato; //guardar el valor final
                  actual.dato=actual.siguiente.dato;//ordenar
                  actual.siguiente.dato=guar;
                  
                  orden=true;//si hubo que ordenar
              }
              actual=actual.siguiente;//sigue al siguiente nodo
          }
      }while(orden); //repetir el proceso hasta que no haya cambios
   }
   public int encontrar(int n){ //metodo para encontrar el numero que falta
       Nodo actual= cabeza; //incia desde la cabeza
       if(actual.dato!=1){ //si el primer numeor no es uno, falta
           return 1;
       }
       while(actual.siguiente!=null){//aqui hace el recorrido
           if(actual.siguiente.dato-actual.dato>1){//si hay un salto de mas de un numero
               return actual.dato;
           }
           actual=actual.siguiente;//continua con el recorrido
       }
       return n; //si no falta ninguno entre ellos, falta es el ultimo numero
   }
   public void mostrar(){//crear metodo para mostrar la lista
       Nodo aux= cabeza; 
       
       while(aux!=null){
           System.out.print(aux.dato+ " ");
           aux=aux.siguiente;
       }
       System.out.println();
   }
   public int getTamaño(){ //usar un metodo get para devorlver el tamaño
       return tamaño; //devolver el tamaño de la lista del usuario
   }
}
