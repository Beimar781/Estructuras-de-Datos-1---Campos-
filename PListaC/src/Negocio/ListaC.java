
package Negocio;

public class ListaC {
    NodoC primero;
    int cant;

public ListaC(){
    primero=null;
    cant=0;    
}

public boolean vacia(){
    return(primero==null);
}

public void insetar(Object e){ //inserta al final de la lista
    NodoC nuevo=new NodoC();
    nuevo.setElem(e);
    if(vacia()){
        primero=nuevo;
        primero.setEnlace(nuevo);
    }else{
        NodoC aux=primero;
        while(aux.getEnlace()!=primero){
            aux=aux.getEnlace();
        }
        aux.setEnlace(nuevo);
        nuevo.setEnlace(primero);
    }
    cant++;
}

public void insertarInicio(Object e){
     NodoC nuevo= new NodoC();
     nuevo.setElem(e);
     if(vacia()){
         primero=nuevo;
         primero.setEnlace(primero);
     }else{
         NodoC aux=primero;
         while(aux.getEnlace()!=primero){
             aux=aux.getEnlace();
        }
        aux.setEnlace(nuevo);
        nuevo.setEnlace(primero);
        primero=nuevo;     
    }
    cant++;
}
 
public void insertar(Object e, int pos){
    NodoC nuevo=new NodoC();
    nuevo.setElem(e);
    if((vacia())||(pos<=0)){
        insertarInicio(e);
    }else{
        if(pos>=cant-1){
            this.insetar(e);
        }else{
            NodoC aux = primero;
            pos--;
            while(pos>0){
                aux=aux.getEnlace();
                pos--;
            }
            nuevo.setEnlace(aux.getEnlace());
            aux.setEnlace(nuevo);
        }  
    }
    cant++;
}

public Object consultarInicio(){
    return primero.getElem();
}

public Object consultar(){
    NodoC aux=primero;
    while(aux.getEnlace()!=primero){
        aux=aux.getEnlace();
    }
    return aux.getElem();
}

public Object consultar(int pos){
    NodoC aux=primero;
    if(pos>=cant-1){
        return consultar();
    }else{
        if(pos<=0){
            return consultarInicio();
        }else{
            while(pos>0){
                aux=aux.getEnlace();
                pos--;
            }
        }
    }
    return aux.getElem();    
}

public void eliminarInicio(){
    if(cant==1){
        primero=null;
    }else{
        NodoC aux=primero;
        while(aux.getEnlace()!=primero){
            aux=aux.getEnlace();
        }
        aux.setEnlace(primero.getEnlace());
        primero=aux.getEnlace();
    }
    cant--;
}

public void eliminar(){
    if(cant==1){
        primero=null;
    }else{
        NodoC aux=primero;
        int i=cant-2;
        while(i>0){
            aux=aux.getEnlace();
            i--;
        }
        aux.setEnlace(aux.getEnlace().getEnlace());
    }
    cant--;
}

public void eliminar(int pos){
    if((pos<=0)||(cant==1)){
        eliminarInicio();
    }else{
        if(pos>=cant-1){
            eliminar();
        }else{
            NodoC aux=primero;
            pos--;
            while(pos>0){
                aux=aux.getEnlace();
                pos--;
            }
            aux.setEnlace(aux.getEnlace().getEnlace());
        }
    }
    cant--;
}

public int getLongitud(){
    return cant;
}

@Override
public String toString() {
    if(vacia()){
        System.out.println("La lista esta vacia.");
        return("C->null");
    }else{
        String S="C->";
        NodoC p=primero;
        do{
            S=S+p.getElem()+"->";
            p=p.getEnlace();    
        }
        while(p!=primero);
        return S;
    }   
}

}

 

