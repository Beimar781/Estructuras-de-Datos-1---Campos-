
package pbitwise;

import Negocio.Bitwise;

public class PBitwise {

    public static void main(String[] args) {
        
        Bitwise x=new Bitwise();
        System.out.println(x);
        x.encender(1);
        System.out.println(x);
        x.encender(32);
        x.encender(5);
        x.encender(10);
        x.encender(15);
        System.out.println(x);
        x.apagar(1);
        x.apagar(2);
        x.encender(20);
        x.encender(8);
        x.apagar(32);
        System.out.println(x);
    }
    
}
