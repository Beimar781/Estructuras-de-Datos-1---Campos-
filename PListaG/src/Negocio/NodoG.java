
package Negocio;

import java.io.Serializable;

public class NodoG<TipoDato> implements Serializable{
    TipoDato dato;
    NodoG<TipoDato> Enlace;
    
public NodoG(){
    Enlace=null;
}

public NodoG(TipoDato dato){
    this.dato=dato;
    Enlace=null;
}

public void setDato(TipoDato dato){
    this.dato=dato;
}

public void setEnlace(NodoG<TipoDato> P){
    Enlace=P;
}

public TipoDato getDato(){
    return dato;
}

public NodoG<TipoDato> getEnlace(){
    return Enlace;
}

 @Override
    public String toString() {
        return  (dato + "" + '\n');
}
}