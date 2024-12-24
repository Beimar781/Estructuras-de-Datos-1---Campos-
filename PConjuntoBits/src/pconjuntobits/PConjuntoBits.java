
package pconjuntobits;

import Negocios.ConjuntoBits;

public class PConjuntoBits {

    public static void main(String[] args) {
        
        ConjuntoBits a=new ConjuntoBits(100);
        ConjuntoBits b=new ConjuntoBits(100);
        ConjuntoBits c=new ConjuntoBits(200);
        a.Insertar(10);
        a.Insertar(32);
        a.Insertar(35);
        a.Insertar(60);
        a.Insertar(70);
        a.Insertar(90);
        a.Insertar(10);
        a.Insertar(15);
        a.Insertar(60);
        System.out.println(a);
        a.Eliminar(10);
        a.Eliminar(70);
        System.out.println(a);
        b.Insertar(10);
        b.Insertar(33);
        b.Insertar(38);
        b.Insertar(60);
        b.Insertar(75);
        b.Insertar(2);
        b.Insertar(17);
        System.out.println(b);
        c.Union(a,b);
        System.out.println(c);
    }
    
}
