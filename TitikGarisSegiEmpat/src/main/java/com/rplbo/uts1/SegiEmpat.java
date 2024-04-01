package com.rplbo.uts1;

public class SegiEmpat {
    //Atribut
    private Garis grsA;
    private Garis grsB;
    private Garis grsC;
    private Garis grsD;

    //Konstruktor
    public SegiEmpat(Garis a, Garis b, Garis c, Garis d) {
        this.grsA=a;
        this.grsB=b;
        this.grsC=c;
        this.grsD=d;
    }

    public  SegiEmpat(Titik t1,Titik t2,Titik t3,Titik t4){
        this(new Garis(t1,t2), new Garis(t2,t3), new Garis(t3,t4), new Garis(t4,t1));
    }

    public  SegiEmpat(Garis garis,Titik c,Titik d){
        this(garis, new Garis(c,d), new Garis(d,garis.getTitikB()), new Garis(garis.getTitikA(),c));
    }

    public double area(){
        return grsA.getPanjangGaris()* grsB.getPanjangGaris();
    }

    public boolean apakahKotak(){
        return grsA.getPanjangGaris()== grsB.getPanjangGaris()&&grsA.getPanjangGaris()== grsC.getPanjangGaris()
                && grsA.getPanjangGaris()== grsD.getPanjangGaris()&& grsB.getPanjangGaris()== grsD.getPanjangGaris();
    }
    
    //getter dan setter

    public Garis getGrsA() {
        return new Garis(grsA);
    }

    public void setGrsA(Garis grsA) {
        this.grsA = new Garis(grsA);
    }

    public Garis getGrsB() {
        return new Garis(grsB);
    }

    public void setGrsB(Garis grsB) {
        this.grsB = new Garis(grsB);
    }

    public Garis getGrsC() {
        return new Garis(grsC);
    }

    public void setGrsC(Garis grsC) {
        this.grsC = new Garis(grsC);
    }

    public Garis getGrsD() {
        return new Garis(grsD);
    }

    public void setGrsD(Garis grsD) {
        this.grsD = new Garis(grsD);
    }
}
