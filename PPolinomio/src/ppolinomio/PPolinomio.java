/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppolinomio;

import Negocio.Monomio;
import Negocio.Polinomio;
/**
 *
 * @author usuario
 */
public class PPolinomio {

    public static void main(String[] args) {
    Monomio a=new Monomio();
    a.setCoef(3);
    a.setExp(2);
    a.setSigno('-');
    Monomio b=new Monomio();
    b.setCoef(5);
    b.setExp(1);
    b.setSigno('+');
    Monomio c=new Monomio();
    c.setCoef(8);
    c.setExp(5);
    c.setSigno('+');
    Polinomio x=new Polinomio();
    x.Insertar(a);
    x.Insertar(b);
    x.Insertar(c);
    System.out.println(x);
    Monomio d=new Monomio();
    d.setCoef(3);
    d.setExp(2);
    d.setSigno('+');
    x.Insertar(d);
    System.out.println(x);
    Polinomio y=new Polinomio();
    y.Insertar(b);
    y.Insertar(c);
    System.out.println(y);
    Polinomio z=new Polinomio();
    z.Sumar(x, y);
    System.out.println(z);
    }
    
}
