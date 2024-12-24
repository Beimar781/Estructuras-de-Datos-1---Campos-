package pvectorbit;

import Negocio.VectorNbits;

public class PVectorBit {

    public static void main(String[] args) {
        VectorNbits A=new VectorNbits(20,8);
        A.Insertar(30, 1);
        A.Insertar(250, 3);
        A.Insertar(131, 10);
        A.Insertar(42, 15);
        A.Insertar(5, 16);
        A.Insertar(220, 6);
        A.Insertar(70, 7);
        A.Insertar(180, 19);
        A.Insertar(50, 20);
        System.out.println(A);
        A.Insertar(20, 3);
        System.out.println(A);
    }
    
}
