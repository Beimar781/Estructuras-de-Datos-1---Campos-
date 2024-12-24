package Negocios;

public class Bitwise {
    int x;

public Bitwise(){
    this.x=0;
}
public void encender(int pos){
    if(pos<=32){
        int masc=1;
        masc=masc<<pos-1;
        x=x|masc;
    }
}

public void apagar(int pos){
    if(pos<=32){
        int masc=1;
        masc=masc<<pos-1;
        masc=~masc;
        x=x&masc;
    }
}

public int getBit(int pos){
    int masc=1;
    masc=masc<<pos-1;
    masc=masc&x;
    masc=masc>>>pos-1;
    return(masc);
}

    @Override
    public String toString() {
    String S="X=[";
    for(int i=32; i>=1; i--){
        S=S+" "+getBit(i);
    }
    S=S+" ]";
    return(S);
    }
}
