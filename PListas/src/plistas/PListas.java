
package plistas;

import Negocio.Lista;

public class PListas {

    public static void main(String[] args) {
        
        Lista L=new Lista();
        L.insertar(4);
        L.insertar(7);
        L.insertar(1);
        L.insertar(10);
        L.insertar(1);
        L.insertar(3);
        L.insertar(8);
        L.insertar(5);
        L.insertar(11);
        L.insertar(10);
        System.out.println(L);
        L.Invertir();
        System.out.println(L);
        /*L.eliminar(3);
        L.eliminar(1);
        L.eliminar(11);
        L.eliminar(5);
        System.out.println(L);
        L.insertar(1);
        L.insertar(20);
        L.insertar(-1);
        L.insertar(6);
        System.out.println(L);
        System.out.println("La lista esta vacia"+L.vacia());
        System.out.println("El dato en la posicion 3 es="+L.getDato(3));*/
    }
    
}
