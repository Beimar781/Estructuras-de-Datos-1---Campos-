
package Negocio;

public class MatrizSparce {
    float VD[];
    int VFC[];
    float ep;
    int Nfila;
    int Ncol;
    int dim;

public MatrizSparce(int Nfila, int Ncol,float ep) {
        this.VD = new float[10];
        this.VFC = new int [10];
        this.ep = ep;
        this.Nfila = Nfila;
        this.Ncol = Ncol;
        this.dim = -1;
}

public void setDato(int fila,int col,float ele){
    if((fila>Nfila)||(col>Ncol)){
        System.out.println("Error fila y columna fuera de rango");
        System.exit(1);
    }else{
        int fc=(fila-1)*Ncol+col;
        int pos=buscar(fila,col);
        if(pos>dim){
            if(ele!=ep){
                dim++;
                VD[dim]=ele;
                VFC[dim]=fc;
            }
            }else{
                if(ele!=ep){
                    VD[pos]=ele;
                    }else{
                    for(int i=pos; i<dim; i++){
                        VD[i]=VD[i+1];
                        VFC[i]=VFC[i+1];
                        }
                    dim--;
                }
            }            
        }
}

private int buscar(int fila,int col){
    int i=0;
    int fc=(fila-1)*Ncol+col;
    while((i<=dim)&&(VFC[i]!=fc))
        i++;
    return i;
}

public float getDato(int fila,int col){
    int i=buscar(fila,col);
    if(i<=dim){
        return VD[i];
    }else{
        return ep;
    }    
}

@Override
public String toString() {
String S="M=["+'\n';
for(int i=1; i<=Nfila; i++){
    for(int j=1; j<= Ncol; j++){
        S=S+getDato(i,j)+"  ";
    }
    S=S+'\n';
}
S=S+"]";
return S;
}


}
