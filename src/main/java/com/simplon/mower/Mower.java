package com.simplon.mower;


public class Mower {

    private Position position;
    int x;
    int y;
    private Orientation o;

    public Mower(int x, int y, Orientation o){
        this.x=x;
        this.y=y;
        this.o=o;
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(int x,int y,Orientation o) {
        this.x=x;
        this.y=y;
        this.o=o;
    }

    @Override
    public String toString() {
        return x+""+""+y+o;
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
            case N:setPosition(x,y+1,o);
            break;
            case E:setPosition(x+1,y,o);
            break;
            case S:setPosition(x,y-1,o);
            break;
            case W:setPosition(x-1,y,o);
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
}
