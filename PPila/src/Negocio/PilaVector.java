
package Negocio;

public class PilaVector {
    int P[];
    int cima;
    
public PilaVector(int cant){
    P = new int[cant];
    cima=-1;    // El primer elemento de la pila empieza en 0
}

public boolean Vacia(){
    return(cima==-1);
}

public boolean Llena(){
    return(cima==P.length-1);
}

public int get(){
    return(P[cima]);
}

public void push(int elemento){
    if(Llena()){
        System.out.println("Error Pila Llena");
        System.exit(1);
    }else{
        cima++;
        P[cima]=elemento;
    }
}

public int pop(){
    cima--;
    return(P[cima+1]);
}

public int getCima(){
    return(this.cima);
}

public void Eliminar(){
    if(cima>-1){
        cima--;
    }
}

@Override
public String toString() {
    String S="\n";
    if(!Vacia()){
        for(int i=cima; i>=0; i--){
            S=S+"[ "+P[i]+" ]\n";
        }  
    }
    S=S+"Pila Vector";
    return S;
}

public void eliminarRepetido(){
    PilaVector PilaAux=new PilaVector(cima+1);
    int comparador=0;
    while((cima+1!=comparador)&&(!Vacia())){
        int pivote=pop();
        while((cima>=comparador)&&(!Vacia())){
            int aux=pop();
            if(pivote!=aux){
                PilaAux.push(aux);
            }
        }
        push(pivote);
        while(!PilaAux.Vacia()){
            push(PilaAux.pop());
        }
        comparador++;
    }
}

public void EliminarRepRecursivo(){
    if(Vacia()){
    }else{
        if(cima==1){
        }else{
            int pivo=pop();
            EliminarRepRecursivo();
            if(pivo!=get()){
                push(pivo);
            }
        }
    }
}

public void Invertirde2Recursivo(){
    if(Vacia()){
    }else{
        if(cima==0){
            }else{
                int x=pop();
                int y=pop();
                Invertirde2Recursivo();
                push(x);
                push(y);
            }
        }
}


}
