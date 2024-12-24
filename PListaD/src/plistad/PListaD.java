
package plistad;

import Negocio.ListaD;

public class PListaD {

    public static void main(String[] args) {
        ListaD L=new ListaD();
        L.Insertar(6);
        L.Insertar(2);
        L.Insertar(8);
        L.Insertar(1);
        L.Insertar(5);
        L.Insertar(4);
        L.Insertar(8);
        L.Insertar(11);
        L.Insertar(1);
        System.out.println(L);
        L.Eliminar(6);
        L.Eliminar(1);
        L.Eliminar(11);
        L.Eliminar(5);
        System.out.println(L);
        L.Insertar(5);
        L.Insertar(15);
        L.Insertar(1);
        System.out.println(L);
    }
    
}
