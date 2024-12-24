package Negocio;

public class Polinomio {
    Monomio P[];
    int dim;

public Polinomio(){
this.P=new Monomio[10];
this.dim=-1;
}

public Polinomio(int cant){
dim=-1;
P=new Monomio[cant];
    for(int i=0;i<cant;i++){
        P[i]=new Monomio('+',0,0);
    }
}

public void Insertar(Monomio A){
if (vacia()){
    dim++;
    P[dim]=A;
}else{
    int aux=0;
    while((aux<=dim)&&(A.getExp()<P[aux].getExp())){
    aux++;
    }
    if(aux>dim){
        redimencionar();
        dim++;
        P[aux]=A;
    }else{
        if(P[aux].getExp()!=A.getExp()){
            for(int i=dim; i>=aux; i--){
                P[i+1]=P[i];
            }
            redimencionar();
            P[aux]=A;
            dim++;
        }else{
            int suma=P[aux].coef+A.coef;
            if(suma==0){
                for(int j=aux; j<dim; j++){
                    P[j]=P[j+1];
                }
                dim--;            
            }else{
                P[aux].coef=suma;
            }            
        }
               
    }
    }    
}

public boolean vacia(){
return(dim==-1);
}

public void eliminar(int exp){
if(!vacia()){
    int i=0;
    while((i<=dim)&&(P[i].getExp()!=exp)){
        i++;
    }
    if(i<=dim){
        for(int j=i; j<dim; j++){
            P[j]=P[j+1];
        }
        dim--;
    }
}
}

private void redimencionar(){
if (dim==P.length-1){
    Monomio copia[]=new Monomio[P.length];
    System.arraycopy(P, 0, copia, 0, P.length);
    P=new Monomio[P.length+10];
    System.arraycopy(copia, 0, P, 0, copia.length);
}    
}

public void Sumar(Polinomio A, Polinomio B){
for (int i = 0; i <= A.dim; i++){
    this.Insertar(A.P[i]);
    }
    for (int i = 0; i <= B.dim; i++){
        this.Insertar(B.P[i]);
    }
}
    
public void Restar(Polinomio A, Polinomio B){
Polinomio aux = new Polinomio();
    for (int i = 0; i <= B.dim; i++){
        aux.Insertar(B.P[i]);
        aux.P[i].coef = -aux.P[i].coef;
    }
    this.Sumar(A, aux);
}

public void Multiplicar(Polinomio A, Polinomio B){                                                            
Monomio M = new Monomio();
    for (int i = 0; i <= A.dim; i++){ 
         for (int j = 0; j <= B.dim; j++){
            M.coef = A.P[i].coef * B.P[j].coef;
            M.exp = A.P[i].exp + B.P[j].exp;
            this.Insertar(M);
        }
    }
}

@Override
public String toString() {
String S="P(x)=";
for (int i=0; i<=dim; i++){
S=S+P[i].toString();
    }
return S;
}

}
