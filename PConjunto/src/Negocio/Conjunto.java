
package Negocio;

public class Conjunto {
    int C[];
    int indice;

public Conjunto() {
    C=new int[10];
    indice=-1;
    }

public Conjunto(int cant) {
    C=new int[cant];
    indice=-1;
    }

public void insertar(int ele){
    if(!pertenece(ele)){
        redimencionar();
        indice++;
        C[indice]=ele;
    }
}

public void eliminar(int ele){
    if((!vacia())&&(pertenece(ele))){
    int i=0;
        while(C[i]!=ele){
            i++;
        }
        for(int j=i; j<indice;j++){
            C[j]=C[j+1];
        }
        indice--;
    }
}

public boolean vacia(){
    return(indice==-1);
}

public boolean pertenece(int ele){
    int i=0;
    while((i<=indice)&&(C[i]!=ele)){
    i++;
}
    return(i<=indice);
}

public void union(Conjunto A,Conjunto B){
    for (int i = 0; i <= A.indice; i++) {
        insertar(A.C[i]);
    }
    for (int j = 0; j <= B.indice; j++) {
        insertar(B.C[j]);
    }
}
public void interseccion(Conjunto A,Conjunto B){
    for (int i = 0; i <= A.indice ; i++) {
        if(B.pertenece(A.C[i])){
            insertar(A.C[i]);
        }
    }
}

private void redimencionar(){
    if(indice==C.length-1){
        int C1[]=new int[C.length];
        System.arraycopy(C, 0, C1, 0, C.length);
        C=new int[C1.length+10];
        System.arraycopy(C1, 0, C, 0, C1.length);
    }
}

@Override
public String toString() {
String S="C={";
for(int i=0;i<=indice;i++){
    S=S+C[i]+",";
    }
S=S+"}";
return S;
}

public static void main(String[] args) {
    Conjunto A=new Conjunto();
    A.insertar(2);
    A.insertar(8);
    A.insertar(2);
    A.insertar(7);
    System.out.println(A);
    A.eliminar(2);
    A.eliminar(5);
    A.insertar(3);
    System.out.println(A);
    Conjunto B=new Conjunto();
    B.insertar(2);
    B.insertar(8);
    B.insertar(21);
    B.insertar(35);
    B.insertar(3);
    System.out.println(B);
    Conjunto C=new Conjunto();
    C.union(A,B);
    //C.interseccion(A,B);
    System.out.println(C);
      
}
}
