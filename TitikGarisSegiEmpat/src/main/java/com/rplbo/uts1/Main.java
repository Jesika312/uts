package com.rplbo.uts1;

public class Main {
    public static void main(String[] args) {
        Titik a = new Titik(1,1);
        Titik b = new Titik(1,5);
        double hasil = a.distance(b);
        System.out.println("Titik1: x="+a.getX()+",y="+a.getY());
        System.out.println("Titik2: x="+b.getX()+",y="+b.getY());
        System.out.println("jarak dari (0,0) ke titik a:"+a.distance(0,0));
        System.out.println("jarak dari titk a ke titik b:"+a.distance(b));
        System.out.println("hasil"+hasil);
        Garis g1 = new Garis(a,b);
        Garis g2 = new Garis(b,a);
        g1.apakahPanjangSama(g2);
        System.out.println("garis1:"+g1.getPanjangGaris());
        System.out.println("panjang garis1= garis2:"+g1.apakahPanjangSama(g2));
        SegiEmpat sg = new SegiEmpat(new Titik(1,1),new Titik(5,1), new Titik(5,6), new Titik(1,6));

    }
}
