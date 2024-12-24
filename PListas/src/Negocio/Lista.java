
package Negocio;

public class Lista {
    Nodo L;
    int cant;

public Lista(){
    L=null;
    cant=0;
}

public boolean vacia(){
    return(L==null);
}

public void insertar(int ele){
    if(vacia()){
        Nodo p=new Nodo();
        p.setDato(ele);
        L=p;
        cant++;
    }else{
        Nodo Aux=L;
        Nodo Ant=null;
        while((Aux!=null)&&(Aux.getDato()<=ele)){
            Ant=Aux;
            Aux=Aux.getEnlace();
        }
        if(Ant==null){  //Inserta en la cabeza
            Nodo p=new Nodo();
            p.setDato(ele);
            p.setEnlace(L);
            L=p;
            cant++; 
        }else{          //Inserta en el cuerpo
            if(Ant.getDato()!=ele){
                Nodo p=new Nodo();
                p.setDato(ele);
                Ant.setEnlace(p);
                p.setEnlace(Aux);
                cant++;
            }
        } 
    }
}

public void eliminar(int ele){
    if(!vacia()){
        Nodo Aux=L;
        Nodo Ant=null;
        while ((Aux.getEnlace()!=null)&&(Aux.getDato()!=ele)){
            Ant=Aux;
            Aux=Aux.getEnlace();
            }
        
        if(Ant==null){                          //Elimina en la cabeza
            L=L.getEnlace();
            cant--;
        }else{
            if(Aux!=null){
            Ant.setEnlace(Aux.getEnlace());     //Elimina en el cuerpo 
            cant--;
            }
        }  
    }
}

public int getDato(int pos){
    Nodo Aux=L;
    for(int i=1; i<pos; i++){
        Aux=Aux.getEnlace();
    }
    return(Aux.getDato());
}

@Override
public String toString() {
    String S="L-> <";
    Nodo Aux=L;
    while(Aux!=null){
    S=S+Aux.getDato()+",";
    Aux=Aux.getEnlace();
    }
    S=S+">";
    return S;
}

public void Invertir(){
    invertirR(L);
}

private void invertirR(Nodo p){
    if(p==null){
    }else{
        if(p.getEnlace()==null){
            L=p;
        }else{
            invertirR(p.getEnlace());
            p.getEnlace().setEnlace(p);
            p.setEnlace(null);
        }
        
    }
}

}
