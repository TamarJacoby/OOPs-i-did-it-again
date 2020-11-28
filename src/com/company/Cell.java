package com.company;

public class Cell {
    int state;// state when time = t
    int[][] neighborsList;// a 2D array, each individual list represents a neighbor.
    // the first two items of the list represent the location of the cell in the array, and the third represents the state
    int[] index;
    int nextState;//state when time= t+1
    static int[][] array;


    public Cell(int state, int[][] neighborsList, int[] index) {
        this.state = state;
        this.neighborsList = neighborsList;
        this.index =index;
    }

    public int[][] Neighbors() {//a method that returns a list of neighbors
        int[][] neighborsList = new int[0][];
        this.neighborsList = new int[][]{{2}, {1}};
        return neighborsList;
    }
    public int nextStateFunc(int[][] neighborsList) {// a method that returns the state of the in the next time step
        int nextState;
        nextState = 0;
        return nextState;
    }
}
