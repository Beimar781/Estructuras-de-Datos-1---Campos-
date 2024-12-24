
package Negocio;

import java.io.Serializable;

public class ListaG <TipoDato extends Comparable> implements Serializable{
    NodoG<TipoDato> L;
    int cant;

public ListaG(){
    L=null;
    cant=0;
}

public int cantidad(){
    return cant;
}

private boolean vacia(){
    return(L==null);
}

public void Insertar(TipoDato dato){
    if(vacia()){ //La lista esta vacia
        NodoG p=new NodoG<TipoDato>();
        p.setDato(dato);
        L=p;
        cant++;
    }else{
        NodoG<TipoDato> Ant=null;
        NodoG<TipoDato> Aux=L;
        while((Aux!=null)&&(Aux.getDato().compareTo(dato)<=0)){ //Pregunta si el dato dato a insertar es menor o igual al dato que se esta comparando
            Ant=Aux;
            Aux=Aux.getEnlace();
        }
        NodoG p=new NodoG<TipoDato>(dato);
        if(Ant==null){ //se inserta en la cabeza
            p.setEnlace(L);
            L=p;
            cant++;
        }else{
            if(Ant.getDato().compareTo(dato)!=0){ //Pregunta si el dato no es repetido para insertarlo en el cuerpo
                Ant.setEnlace(p);
                p.setEnlace(Aux);
                cant++;
            }
        }
    }
}

public String Mostrar(){
    String S="Vacia";
    if(!vacia()){
        S="";
        NodoG p=L;
        while(p!=null){
            if(p.getEnlace()==null){ //Pregunta si solo hay un elemento
                S=S+p.getDato();
            }else{
                S=S+p.getDato()+"->"; //Avanza por todos los elementos
                p=p.getEnlace();
            }
        }
    }
    return S;
}

public boolean Buscar(TipoDato dato){
    if(vacia()){
        return false; //Retorna falso si la lista esta vacia
    }else{
    NodoG<TipoDato> Aux=L;
    while((Aux!=null)&&(Aux.getDato().compareTo(dato)!=0)){ //Avanza por la lista y compara dato a dato
        Aux=Aux.getEnlace();
    }
    return(Aux!=null); //Si aux llego al final de la lista nunca encontro el dato y retorna falso, si encontro el dato retorna verdadero       
    }
}

public TipoDato getDato(int pos){
    NodoG<TipoDato> Aux=L;
    for(int i=1; i<pos; i++){
        Aux=Aux.getEnlace();
        }
    return (Aux.getDato());
}

public TipoDato BuscarObj(TipoDato dato){
    if(vacia()){
        return dato;
    }else{
        NodoG<TipoDato> Aux=L;
        while((Aux!=null)&&(Aux.getDato().compareTo(dato)!=0)){
            Aux=Aux.getEnlace();    
        }
        if(Aux!=null){
            dato=Aux.getDato();
        }
        return dato;
    }
}

public boolean Modificar(TipoDato dato){
    if(vacia()){
        return false;
    }else{
        NodoG<TipoDato> Aux=L;
        while((Aux!=null)&&(Aux.getDato().compareTo(dato)!=0)){
            Aux=Aux.getEnlace();
        }
        if(Aux!=null){
            Aux.dato=dato;
            return true;
        }else{
            return false;
        }
    }
}

public void Eliminar(TipoDato ele){
    if(!vacia()){
        NodoG<TipoDato> Ant=null;
        NodoG<TipoDato> Aux=L;
        while((Aux!=null)&&(Aux.getDato().compareTo(ele)!=0)){
            Ant=Aux;
            Aux=Aux.getEnlace();
        }
        if(Aux!=null){
            if(Ant==null){ //Nunca se movio, elimina en la cabeza
                L=L.getEnlace();
                cant--;
            }else{
                Ant.setEnlace(Aux.getEnlace()); //Eliminamos en el cuerpo
                cant--;
            }
        }
    }
}

@Override
public String toString() {
    String S="";
    NodoG<TipoDato> Aux=L;
    while(Aux!=null){
        S=S+Aux.toString()+'\n';
        Aux=Aux.getEnlace();
    }
    return S;       
}
   
}
