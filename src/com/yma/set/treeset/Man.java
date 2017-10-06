package com.yma.set.treeset;

public class Man implements Comparable<Man> {

    private int height;

    public Man(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return height + "";
    }

    @Override
    public int compareTo(Man man) {
        return height - man.getHeight();
    }
}
