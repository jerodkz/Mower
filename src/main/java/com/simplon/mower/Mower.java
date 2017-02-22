package com.simplon.mower;


public class Mower {

    //private Position position;
    int x;
    int y;
    private Orientation o;
    int lawnX;
    int lawnY;


    public Mower(int x, int y, Orientation o){
        this.x=x;
        this.y=y;
        this.o=o;
    }


    public void setPosition(int x,int y,Orientation o) {
        this.x=x;
        this.y=y;
        this.o=o;
    }

    public void setLawnX(int lawnX) {
        this.lawnX = lawnX;
    }

    public void setLawnY(int lawnY) {
        this.lawnY = lawnY;
    }

    public void move(char c) {
        switch(c) {
            case 'L': turnLeft();
            break;
            case 'R': turnRight();
            break;
            case 'F': moveForward();
            break;
        }
    }

    private void moveForward() {
        switch (o) {
            case N:if(y+1<=lawnY){setPosition(x,y+1,o);}
            break;
            case E:if(x+1<=lawnX){setPosition(x+1,y,o);}
            break;
            case S:if(y-1>=0){setPosition(x,y-1,o);}
            break;
            case W:if(x-1>=0){setPosition(x-1,y,o);}
            break;
        }
    }

    private void turnRight() {
        switch (o) {
            case N:setPosition(x,y,Orientation.E);
                break;
            case E:setPosition(x,y,Orientation.S);
                break;
            case S:setPosition(x,y,Orientation.W);
                break;
            case W:setPosition(x,y,Orientation.N);
            break;
        }
    }

    private void turnLeft() {
        switch (o) {
            case N:setPosition(x,y,Orientation.W);
            break;
            case W:setPosition(x,y,Orientation.S);
            break;
            case S:setPosition(x,y,Orientation.E);
            break;
            case E:setPosition(x,y,Orientation.N);
            break;
        }
    }

    @Override
    public String toString() {
        return x+""+""+y+o;
    }

}
