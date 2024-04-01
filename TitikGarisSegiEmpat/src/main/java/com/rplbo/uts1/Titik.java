package com.rplbo.uts1;

public class Titik {
    //Atribut
    private int x;
    private int y;

    //Konstruktor
    public Titik(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public Titik(){
        this(0,0);
    }

    public Titik(Titik t){
        this(t.getX(), t.getY());
    }

    //getter dan setter

    public double distance(int x,int y){
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }

    public double distance(Titik t){
        return Math.sqrt(Math.pow((this.x-t.getX()),2)+Math.pow((this.y-t.getY()),2));

    }
    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
