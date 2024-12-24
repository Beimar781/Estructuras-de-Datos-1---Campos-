package pmatrizsparce;

import Negocio.MatrizSparce;
import Negocio.MatrizSparceBits;

public class PMatrizSparce {

    public static void main(String[] args) {
                    
        /*MatrizSparce A=new MatrizSparce(10,10,0);
        A.setDato(1,3,8);
        A.setDato(1,7,1);
        A.setDato(3,3,10);
        A.setDato(5,8,2);
        A.setDato(7,2,15);
        A.setDato(4,7,20);
        A.setDato(9,1,18);
        A.setDato(10,10,1);
        A.setDato(10,1,0);
        System.out.println(A);
        A.setDato(10,10,2);
        A.setDato(1,3,0);
        System.out.println(A);*/  
        
        MatrizSparceBits A=new MatrizSparceBits(10,10,0);
        A.setDato(1,3,8);
        A.setDato(1,7,1);
        A.setDato(3,3,10);
        A.setDato(5,8,2);
        A.setDato(7,2,1);
        A.setDato(4,7,20);
        A.setDato(9,1,18);
        A.setDato(10,10,1);
        A.setDato(10,1,0);
        System.out.println(A);
        A.setDato(10,10,2);
        A.setDato(1,3,0);
        System.out.println(A);
    }
    
}
