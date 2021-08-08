package homework2;

public class Costructor {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;

    public Costructor(int a) {
        this.a = a;
    }

    public Costructor(int a,int b){
        this(a);
        this.b=b;
    }

    public Costructor(int a,int b,int c){
        this(a,b);
        this.c=c;
    }

    public Costructor(int a,int b,int c,int d){
        this(a,b,c);
        this.d=d;
    }

    public Costructor(int a,int b,int c,int d,int e){
        this(a,b,c,d);
        this.e=e;
    }

    public Costructor(int a,int b,int c,int d,int e,int f){
        this(a,b,c,d,e);
        this.f=f;
    }

}
