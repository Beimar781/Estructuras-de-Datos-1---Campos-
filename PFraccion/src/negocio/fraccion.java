package negocio;

public class fraccion {
    int num;    //Atributo del numerador con signo
    int deno;   //Atributo del denominador
    
//Constructor sobrecargado
    //El denominador no puede ser 0
    
    public fraccion(char signo,int num, int deno) {
        if(deno==0){
            System.out.print("Error, el denominador es 0");
            System.exit(1);
        }else{    
            if(signo=='+'){
                this.num=+num;
                    }else{
                this.num=-num;
        }
        this.deno = deno;
        }
    }

//Costructor base por defecto
    
    public fraccion() {
        this.num=0;
        this.deno=1;
    }

//Java no nesecita Destructores

//Setters y Getters
    
    public void setNum(int num) {
        if(this.num>=0){
            this.num=num;
                }else{
            this.num=-num;
        }
    }

    public void setDeno(int deno) {
        if(deno==0){
            System.out.print("Error, el denominador es 0");
            System.exit(1);
        }else{
        this.deno = deno;
        }
    }
    
    public void setSigno(char signo){
        if(signo=='+'){
            num=Math.abs(num);
        }else{
            num=-Math.abs(num);
        }
    }

    public int getNum() {
        return Math.abs(num);
    }

    public int getDeno() {
        return deno;
    }
    
    public char getSigno(){
        if(num>=0){
            return'+';
        }else{
            return'-';
        }
    }
    
//Operaciones Adicionales
    
    public void Sumar(fraccion A, fraccion B){
    deno=A.getDeno()*B.getDeno();
    num=(A.num*B.getDeno())+(A.getDeno()*B.num);
    Simplificar();
    }

    public void Restar(fraccion A, fraccion B){
    int x=A.deno*B.deno;
    num=(A.num*B.deno)-(A.deno*B.num);
    deno=x;
    Simplificar();
    }
    
    public void Multiplicar(fraccion A, fraccion B){
    num=A.num*B.num;
    deno=A.deno*B.deno;
    Simplificar();
    }
    
    public void Dividir(fraccion A, fraccion B){
    num=A.num*B.deno;
    deno=A.deno*B.num;
    Simplificar();
    }
    
    public int MCD(){
    int u=Math.abs(num);
    int v=Math.abs(deno);
    int z;
        while(v!=0){
        z=v;
        v=u%v;
        u=z;
        }
        return u;
    }
    
    public void Simplificar(){
    int x=MCD();
    num=num/x;
    deno=deno/x;
    }

    @Override
    public String toString() {
        String S=" ";
        S="     "+getNum()+"\n"+S+getSigno()+" "+"-----"+"\n"+"     "+getDeno();
        return S;
    }
    
    public static void main(String[] args) {
    fraccion A=new fraccion('+',2,2);
    fraccion B=new fraccion('+',2,2);
    fraccion D=new fraccion();
    D.Dividir(A,B);
    System.out.println(D.toString());
    }
       
}
