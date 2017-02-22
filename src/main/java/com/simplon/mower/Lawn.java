package com.simplon.mower;


public class Lawn {
    private int x;
    private int y;

    public Lawn(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Lawn{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
