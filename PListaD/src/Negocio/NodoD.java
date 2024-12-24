
package Negocio;

public class NodoD {
    int dato;
    NodoD EnlaceIzq;
    NodoD EnlaceDer;

public NodoD(){
    this.EnlaceIzq=null;
    this.EnlaceDer=null;
}

public NodoD(int dato){
    this.dato=dato;
    this.EnlaceIzq=null;
    this.EnlaceDer=null;
}

public NodoD(int dato, NodoD EnlaceIzq, NodoD EnlaceDer){
    this.dato=dato;
    this.EnlaceIzq=null;
    this.EnlaceDer=null;
}

public void setDato(int dato){
    this.dato=dato;
}

public void setEnlaceIzq(NodoD EnlaceIzq){
    this.EnlaceIzq=EnlaceIzq;
}

public void setEnlaceDer(NodoD EnlaceDer){
    this.EnlaceDer=EnlaceDer;
}

public int getDato(){
    return dato;    
}

public NodoD getEnlaceIzq(){
    return EnlaceIzq;
}

public NodoD getEnlaceDer(){
    return EnlaceDer;
}

@Override
public String toString() {
    return("<-"+dato+"->");
}

}
