
package plistag;

import Negocio.Alumno;
import Negocio.ListaG;

public class PListaG {

    public static void main(String[] args) {
    ListaG LA=new ListaG<Alumno>();
    ListaG LE=new ListaG<Integer>();
    ListaG LF=new ListaG<Float>();
    LE.Insertar(2);
    LE.Insertar(8);
    LE.Insertar(1);
    System.out.println(LE);
    Alumno A=new Alumno(100,20205847,"Alberto",'M',32);
    LA.Insertar(A);
    Alumno B=new Alumno(105,20215847,"Raul",'M',25);
    LA.Insertar(B);
    Alumno C=new Alumno(102,20191147,"Vanesa",'F',22);
    LA.Insertar(A);
    Alumno D=new Alumno(108,20251147,"Ruben",'M',28);
    LA.Insertar(D);
    Alumno E=new Alumno(108,20191147,"Ruben",'M',28);
    LA.Insertar(E);
    System.out.println(LA.toString());
    LF.Insertar(1.1);
    LF.Insertar(2.5);
    LF.Insertar(1.3);
    LF.Insertar(2.4);
    System.out.println(LF);
    LA.Eliminar(A);
    System.out.println(LA.toString());
    }
    
    
    
    
}
