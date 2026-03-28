
package taller21.pkg260326;
import java.util.Scanner;

public class Taller21260326 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        
        int n = sn.nextInt(); //leer el valor de n
        ListaEnlazada list = new ListaEnlazada(); //aqui se crea la lista
        
        for(int i=0;i < n;i++){ //leer n-1
            int num = sn.nextInt();//leer el numero del usuario
            list.agregar(num); //usar el metodo agregar de ListaEnlazada
            
        }
        list.ordenar();//usar el metodo de ordenar
        int falta = list.encontrar(n);//buscar el numero que falta con el metodo encontrar
        
        System.out.println(falta);//mostrar resultado
    }
    
}
