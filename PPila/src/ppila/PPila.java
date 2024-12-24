
package ppila;

import Negocio.PilaBits;
import Negocio.PilaLista;
import Negocio.PilaVector;

public class PPila {

    public static void main(String[] args) {
        PilaVector V=new PilaVector(10);
        V.push(1);
        V.push(2);
        V.push(3);
        V.push(4);
        V.push(5);
        System.out.println(V.toString());
        /*int x=V.pop();
        x=V.pop();
        x=V.pop();
        System.out.println(V.toString());
        PilaBits B=new PilaBits(10,5);
        B.push(4);
        B.push(5);
        B.push(2);
        B.push(4);
        B.push(2);
        System.out.println(B);
        int y=B.pop();
        System.out.println(B);
        PilaLista C=new PilaLista();
        C.push(4);
        C.push(5);
        C.push(2);
        C.push(4);
        C.push(2);
        System.out.println(C);
        int z=C.pop();
        System.out.println(C);*/
        //V.eliminarRepetido();
        V.Invertirde2Recursivo();
        System.out.println(V.toString());
    }
    
}
