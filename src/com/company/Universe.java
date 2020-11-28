package com.company;

public class Universe {
    int[][] universeState;
    static int time;
    final int MAXTIME=0;

    public Universe(int[][] universeState, int time) {
        this.universeState = universeState;
        this.time = time;
    }

    public int[][] universeNextState() {// a method that returns the new state of the universe
        int[][] nextUniverse;
        nextUniverse = new int[][]{{1}, {2}};
        return nextUniverse;
    }

}
