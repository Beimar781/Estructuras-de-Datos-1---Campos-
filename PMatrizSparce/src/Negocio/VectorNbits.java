package Negocio;

public class VectorNbits {
    int V[];
    int dim;
    int CantidadBits;

public VectorNbits(int cantE, int cantB){
    int cantbits=cantE*cantB;
    int numEnt=cantbits/32;
    if((cantbits%32)!=0){
        numEnt++;
    }
    V=new int[numEnt];
    dim=cantE;
    CantidadBits=cantB;
}

public void Insertar(int ele, int pos){
    int ele1=ele;
    int mask=(int)((Math.pow(2,CantidadBits)-1));
    int Nbits=CalcularNbits(pos);
    int Nenteros=CalcularNenteros(pos);
    mask=mask << Nbits;
    mask=~mask;
    V[Nenteros]=V[Nenteros]&mask;
    ele=ele << Nbits;
    V[Nenteros]=V[Nenteros]|ele;
    if((Nbits-1)+CantidadBits>32){
        int mask1=(int)(Math.pow(2,CantidadBits)-1);
        mask1=mask1 >>> (32-(Nbits-1));
        mask1=~mask1;
        V[Nenteros+1]=V[Nenteros+1]&mask1;
        ele1= ele1 >>> (32-(Nbits-1));
        V[Nenteros+1]=V[Nenteros+1]|ele1;    
    }    
}

public int sacar(int pos){
    int mask=(int)(Math.pow(2,CantidadBits)-1);
    int Nbits=CalcularNbits(pos);
    int Nenteros=CalcularNenteros(pos);
    mask=mask << Nbits;
    mask=mask & V[Nenteros];
    mask=mask >>> Nbits;
    if((Nbits-1)+CantidadBits>32){
        int mask1=(int)((Math.pow(2,CantidadBits)-1));
        mask1=mask1 >>> (32-(Nbits-1));
        mask1=mask1 & V[Nenteros+1];
        mask1=mask1 << (32-(Nbits-1));
        mask=mask | mask1;
    }
    return mask;
}

private int CalcularNbits(int pos){
    return (((pos-1)*CantidadBits%32)+1);    
}
    
private int CalcularNenteros(int pos){
    return ((pos-1)*CantidadBits/32);
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
