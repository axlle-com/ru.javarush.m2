package com.axlle.models.island;

public class Island {
    public static final int X = 3;
    public static final int Y = 3;
    public static Location[][] locations = new Location[X][Y];

    public void initialize() {
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                Location location = new Location(i, j);
                locations[i][j] = location;
            }
        }
    }

    public void run() {
        for (Location[] location : locations) {
            for (Location value : location) {
                value.life();
                value.clear();
            }
        }
    }

    public void print() {
        for (Location[] location : locations) {
            for (Location value : location) {
                System.out.println(value);
            }
        }
    }
}
