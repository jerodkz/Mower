package com.simplon.mower;

public enum Orientation {
    N("north"),
    E("east"),
    S("south"),
    W("west");

    char orientation;

    

    Orientation(String north) {
    }

    public static Orientation findOrientation(char c){
        Orientation o = Orientation.N;
        switch (c){
            case 'N': o = Orientation.N;
                break;
            case 'E': o = Orientation.E;
                break;
            case 'S': o = Orientation.S;
                break;
            case 'W': o = Orientation.W;
                break;
        }
        return o;
    }

    public char getOrientation() {
        return orientation;
    }

    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }
}