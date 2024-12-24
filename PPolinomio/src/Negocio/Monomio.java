package Negocio;

public class Monomio {
int coef;
int exp;

//Contructor base por defecto 
public Monomio(){
coef=0;
exp=1;
}

//Contructor sobrecargado con parametros de entrada
public Monomio(char signo,int coef, int exp) {
if(signo=='+'){
    this.coef=Math.abs(coef);
}else{
    if(signo=='-'){
    this.coef=-Math.abs(coef);
}else{
        System.out.println("Error de signo");
    }
this.exp = exp;
}
}

public void setCoef(int coef) {
if(coef>=0){
    this.coef=Math.abs(coef);
}else{
    this.coef=-Math.abs(coef);
}
}

public void setExp(int exp) {    
this.exp = exp;
}

public void setSigno(char signo){
if(signo=='+'){
   this.coef=+Math.abs(coef);
}else{
    this.coef=-Math.abs(coef);
} 
}

public int getCoef() {
return (Math.abs(coef));
}

public int getExp() {
return exp;
}

public char getSigno(){
    char r;
if(this.coef>=0){
    r='+';
}else{
    r='-';
}
return r;
}

@Override
public String toString() {
String S="";
S=S+getSigno()+getCoef()+"x^"+getExp();
return S;
}

public static void main(String[] args) {
Monomio a=new Monomio();
a.setSigno('+');
a.setCoef(-3);
a.setExp(-2);
System.out.println(a);
}

}
