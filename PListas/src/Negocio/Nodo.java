
package Negocio;

public class Nodo {
    int dato;
    Nodo enlace;

public Nodo(){
    this.enlace = null;
}

public Nodo(int dato){
    this.dato = dato;
    this.enlace = null;
}

public void setDato(int dato){
    this.dato = dato;
}

public void setEnlace(Nodo enlace){
    this.enlace = enlace;
}

public int getDato(){
    return dato;
}

public Nodo getEnlace(){
    return enlace;
}

@Override
public String toString() {
    String S="";
    S=S+dato;
    return S;        
}
   
}
