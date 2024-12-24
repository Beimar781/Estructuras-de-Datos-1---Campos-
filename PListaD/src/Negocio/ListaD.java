
package Negocio;

public class ListaD {
    NodoD Primero;
    NodoD Ultimo;
    int cant;

public ListaD(){
    this.Primero=null;
    this.Ultimo=null;
    this.cant=0;
}

public boolean vacia(){
    return(cant==0);
}

public void insertarInicio(int ele){
    NodoD nuevo=new NodoD(ele);
    if(vacia()){
        Primero=nuevo;
        Ultimo=nuevo;
    }else{
        Primero.setEnlaceIzq(nuevo);
        nuevo.setEnlaceDer(Primero);
        Primero=nuevo;
    }
    cant++;
}

public void insertarUltimo(int ele){
    NodoD nuevo=new NodoD(ele);
    if(vacia()){
        Primero=nuevo;
        Ultimo=nuevo;
    }else{
        nuevo.setEnlaceIzq(Ultimo);
        Ultimo.setEnlaceDer(nuevo);
        Ultimo=nuevo;
    }
    cant++;
}

public int getDato(int pos){
    NodoD aux=Primero;
    for(int i=1; i<pos; i++){
        aux=aux.getEnlaceDer();
    }
    return(aux.getDato());
}

public void Insertar(int ele){
    if(vacia()){
        insertarInicio(ele);
    }else{
        NodoD aux=Primero;
        while((aux!=null)&&(aux.getDato()<ele)){
            aux=aux.getEnlaceDer();
        }
        if((aux==Primero)&&(aux.getDato()!=ele)){ //inserta en la cabeza
            insertarInicio(ele);
        }else{
            if(aux==null){ //inserta en la ultima posicion
                insertarUltimo(ele);
            }else{
                if(aux.getDato()!=ele){ //inserta en el cuerpo
                    NodoD nuevo=new NodoD(ele);
                    nuevo.setEnlaceDer(aux);
                    nuevo.setEnlaceIzq(aux.getEnlaceIzq());
                    aux.setEnlaceIzq(nuevo);
                    nuevo.getEnlaceIzq().setEnlaceDer(nuevo);
                    cant++;
                }
            }  
        }
    }
}

public void Eliminar(int ele){
    if(vacia()){
        System.out.println("Error: la lista esta vacia");
        System.exit(1);
    }else{
        NodoD aux=Primero;
        while((aux!=null)&&(aux.getDato()!=ele)){
            aux=aux.getEnlaceDer();
        }
        if(aux!=null){ //No encontro el elemento
            if(Primero==Ultimo){ //existe un solo elemento
                Primero=null;
                Ultimo=null;
                cant--;
            }else{
                if(aux==Primero){ //Eliminamos en la cabeza
                    Primero=Primero.getEnlaceDer();
                    Primero.setEnlaceIzq(null);
                    cant--;
                    }else{
                        if(aux==Ultimo){ //Eliminamos en la ultima posicion
                            Ultimo=Ultimo.getEnlaceIzq();
                            Ultimo.setEnlaceDer(null);
                            cant--;
                            }else{ //Eliminamos en el cuerpo
                            aux.getEnlaceIzq().setEnlaceDer(aux.getEnlaceDer());
                            aux.getEnlaceDer().setEnlaceIzq(aux.getEnlaceIzq());
                            cant--;
                    }
                }
            }
        }
    }
}

 public boolean existe(int ele) {
    NodoD aux = Primero;
    while ((aux != null) && (aux.getDato() != ele)) {
        aux = aux.getEnlaceDer();
    }
    return (aux != null);
}

@Override
public String toString() {
    String S="P <=> ";
    NodoD aux=Primero;
    while(aux!=null){
        S=S+" ["+aux.getDato()+"] <=>";
        aux=aux.getEnlaceDer();
    }
    S=S+" U";
    return S;
}

}
