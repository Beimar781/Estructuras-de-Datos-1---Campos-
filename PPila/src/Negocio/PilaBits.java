
package Negocio;

public class PilaBits {
    VectorNbits P;
    int cima;
    
public PilaBits(int cant, int cantB){
    P=new VectorNbits(cant,cantB);
    cima=0;
}

public boolean vacia(){
    return (cima==0);
}

public boolean llena(){
    return P.dim==cima;
}

public void push(int elemento){
    if(llena()){
        System.out.println("La Pila a nivel de bits esta llena");
        System.exit(1);
    }else{
        cima++;
        P.Insertar(elemento, cima);
    }
}

public int pop(){
    cima--;
    return(P.sacar(cima+1));
}

public int get(){
    return P.sacar(cima);
}

@Override
public String toString() {
String S="\n";
for(int i=cima; i>=1; i--){
    S=S+"[ "+P.sacar(i)+" ]\n";
}
S=S+"Pila Bits";
return S;
}


}
