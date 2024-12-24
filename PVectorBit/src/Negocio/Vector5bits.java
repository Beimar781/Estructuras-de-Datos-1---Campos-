package Negocio;

public class Vector5bits {
    int V[];
    int dim;

public Vector5bits(int cantE){
    int cantbits=cantE*5;
    int numEnt=cantbits/32;
    if((cantbits%32)!=0){
        numEnt++;
    }
    V=new int[numEnt];
    dim=cantE;
}

public void Insertar(int ele, int pos){
    int ele1=ele;
    int mask=(int)((Math.pow(2,5)-1));
    int Nbits=CalcularNbits(pos);
    int Nenteros=CalcularNenteros(pos);
    mask=mask << Nbits;
    mask=~mask;
    V[Nenteros]=V[Nenteros]&mask;
    ele=ele << Nbits;
    V[Nenteros]=V[Nenteros]|ele;
    if((Nbits+5)>32){
        int mask1=(int)((Math.pow(2,5)-1));
        mask1=mask1 >>> (32-Nbits);
        mask1=~mask1;
        V[Nenteros+1]=V[Nenteros+1]&mask1;
        ele1= ele1 >>> (32-Nbits);
        V[Nenteros+1]=V[Nenteros+1]|ele1;    
    }    
}

public int sacar(int pos){
    int mask=(int)((Math.pow(2,5)-1));
    int Nbits=CalcularNbits(pos);
    int Nenteros=CalcularNenteros(pos);
    mask=mask << Nbits;
    mask=mask & V[Nenteros];
    mask=mask >>> Nbits;
    if((Nbits+5)>32){
        int mask1=(int)((Math.pow(2,5)-1));
        mask1=mask1 >>> (32-Nbits);
        mask1=mask1 & V[Nenteros+1];
        mask1=mask1 << (32-Nbits);
        mask=mask | mask1;
    }
    return mask;
}

private int CalcularNbits(int pos){
    return (((pos*5)-1)%32);    
}
    
private int CalcularNenteros(int pos){
    return (((pos*5)-1)/32);
}

@Override
public String toString() {
String S="V=[";
for(int i=1; i<=dim; i++){
    S=S+sacar(i)+",";
    }
S=S+"]";
return S;
}


}
