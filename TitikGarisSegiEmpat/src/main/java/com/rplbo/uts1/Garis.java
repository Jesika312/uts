package com.rplbo.uts1;

public class Garis {
    //atribut
        private Titik titikA;
        private Titik titikB;
    //konstruktor
    public Garis(Titik titikA, Titik titikB) {
        this.titikA=new Titik(titikA);
        this.titikB=new Titik(titikB);
    }

    public Garis(Garis garis){
        this(garis.getTitikA(),garis.getTitikB());

    }

    public Garis(Titik titikA,int x,int y){
        this(titikA,new Titik(x, y));
    }

    public Garis(int x,int y,Titik titikB){
        this(new Titik(x,y), titikB);
    }
    
    //getter setter


    public Titik getTitikA() {
        return new Titik(titikA);
    }

    public void setTitikA(Titik titikA) {
        this.titikA = new Titik(titikA);
    }

    public Titik getTitikB() {
        return new Titik(titikB);
    }

    public void setTitikB(Titik titikB) {
        this.titikB = new Titik(titikB);
    }

    //method lain
    public double getPanjangGaris(){
        return titikA.distance(titikB);
    }

    public double getPanjangSepertigaGaris(){
        return getPanjangSepertigaGaris()/3;
    }

    public boolean apakahPanjangSama(Garis garis){
        return getPanjangGaris()==garis.getPanjangGaris();
    }

}
