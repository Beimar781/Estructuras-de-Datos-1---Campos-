
package Negocio;

public class PilaLista {
    Nodo cima;
    int cant;

public PilaLista(){
    cima=null;
    cant=0;
}

public boolean vacia(){
    return(cima==null);
}

public void push(int elemento){
    Nodo p=new Nodo(elemento);
    p.setEnlace(cima);
    cima=p;
    cant++;
}

public int pop(){
    int x=cima.getDato();
    cima=cima.getEnlace();
    cant--;
    return x;
}

public int get(){
    return cima.getDato();
}

@Override
public String toString() {
String S="\n";
Nodo aux=cima;
while(aux!=null){
    S=S+"[ "+aux.getDato()+" ]\n";
    aux=aux.getEnlace();
}
S=S+"Pila Lista";
return S;
}


}
