
package plistac;

import Negocio.ListaC;

public class PListaC {

    public static void main(String[] args) {
    ListaC C=new ListaC();
    C.insertarInicio(5);
    C.insetar(7);
    C.insetar(8);
    C.insetar(1);
    C.insetar(2);
    C.insertarInicio(10);
    System.out.println(C);
    C.eliminar();
    C.eliminarInicio();
    System.out.println(C);
    }
    
}
