
package Negocio;

public class Complejo {
float Preal;
int Pimag;

//Construcctor base por defecto
public Complejo(){
Preal=0;
Pimag=0;
}

//Contructor sobrecargado con parametros de entrada
public Complejo(float Preal, int Pimag) {
this.Preal = Preal;
this.Pimag = Pimag;
}

//Setters y Getters

public void setPreal(float Preal) {
this.Preal = Preal;
}

public void setPimag(int Pimag) {
this.Pimag = Pimag;
}

public int getPimag() {
return Pimag;
}

public float getPreal() {
return Preal;
}

public void Suma(Complejo A, Complejo B){
this.Preal=A.Preal+B.Preal;
this.Pimag=A.getPimag()+B.getPimag();
}

public void Resta(Complejo A, Complejo B){
this.Preal=A.Preal-B.Preal;
this.Pimag=A.Pimag-B.Pimag;
}

@Override
public String toString() {
String S="C={";
if(Preal>0){
    S=S+'+';
    S=S+Preal;
}else{
    S=S+Preal;
}
if(Pimag>0){
    S=S+' ';
    S=S+'+';
    S=S+Pimag+"i}";
}else{
    S=S+' ';
    S=S+Pimag+"i}";
}
return S;
}

public static void main(String[] args) {
    Complejo A=new Complejo();
    A.setPreal(2);
    A.setPimag(5);
    Complejo B=new Complejo(4,-2);
    Complejo C=new Complejo();
    System.out.println(A);
    System.out.println(B);
    C.Suma(A,B);
    System.out.println(C);
    Complejo D=new Complejo();
    D.Resta(A,B);
    System.out.println(D);
}
}
