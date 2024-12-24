
package Negocio;

public class NodoC {
    private Object Elem;
    private NodoC Enlace;

public NodoC(){
    Elem=null;
    Enlace=null;    
}

public void setElem(Object ele) {
    Elem = ele;
}

public void setEnlace(NodoC p) {
    Enlace = p;
}

public Object getElem() {
    return Elem;
}

public NodoC getEnlace() {
    return Enlace;
}
   
}
