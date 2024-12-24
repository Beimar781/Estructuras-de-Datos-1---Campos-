package Negocios;

public class ConjuntoBits {
    Bitwise C[]; //Vector de Bitwise
    int cant; //Cantidad de elementos del conjunto
    
public ConjuntoBits(int cantE){
    int cantBw=cantE/32;
    if((cantE%32)!=0){
        cantBw++;
    }
    C=new Bitwise[cantBw];
    for(int i=0; i<cantBw; i++){
        C[i]=new Bitwise();
    }
    cant=cantE;
}

public void Insertar(int ele){
    if(ele<=cant){
        int NBW=CalcNBW(ele);
        int Nbit=CalcNbit(ele);
        C[NBW].encender(Nbit);
    }
}

public void Eliminar(int ele){
    if(ele<=cant){
        int NBW=CalcNBW(ele);
        int Nbit=CalcNbit(ele);
        C[NBW].apagar(Nbit);
    }
}

public boolean Pertenece(int ele){
    int NBW=CalcNBW(ele);
    int Nbit=CalcNbit(ele);
    return(C[NBW].getBit(Nbit)==1);
}

private int CalcNBW(int ele){
    return((ele-1)/32);
}

private int CalcNbit(int ele){
    return(((ele-1)%32)+1);
}

public void Union(ConjuntoBits A, ConjuntoBits B){
    for (int i=1; i<= A.cant; i++){
        if(A.Pertenece(i)){
            Insertar(i);
        }
    }
    for(int j=1; j<=B.cant; j++){
        if(B.Pertenece(j)){
            Insertar(j);
        }
    }
}

@Override
public String toString() {
String S="C=[";
for(int i=1; i<=cant; i++){
    if(Pertenece(i)){
        S=S+i+",";
    }    
}
S=S+"]";
return S;
}
}


