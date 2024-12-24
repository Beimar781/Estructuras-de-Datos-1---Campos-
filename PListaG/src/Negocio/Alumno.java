
package Negocio;

import java.io.Serializable;

public class Alumno implements Comparable, Serializable{
    int CI;
    int Registro;
    String Nombre;
    char Sexo;
    int Edad;

public Alumno(){    
}

public Alumno(int CI, int Registro, String Nombre, char Sexo, int Edad){
    this.CI=CI;
    this.Registro=Registro;
    this.Nombre=Nombre;
    this.Sexo=Sexo;
    this.Edad=Edad;
}

    public int getCI() {
        return CI;
    }

    public int getRegistro() {
        return Registro;
    }

    public String getNombre() {
        return Nombre;
    }

    public char getSexo() {
        return Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public void setRegistro(int Registro) {
        this.Registro = Registro;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    @Override
    public String toString() {
        String S = "";
        S = S + "Registro: " + getRegistro() +"\nCI: " + getCI() + "\nNombre:" + getNombre() 
              + "\nSexo: " + getSexo() + "\nEdad: " + getEdad() + "\n";
        return S;
    }
    
    @Override
    public int compareTo(Object o) {
        Alumno A = (Alumno)o;
        return ((getRegistro()<A.getRegistro())? -1: (getRegistro()>A.getRegistro())? 1: 0); 
    }


    
    
}
