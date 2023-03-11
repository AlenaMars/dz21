package org.example;

public static class Obstacles {

        protected String name;
        protected int Height;
        protected int Distance;
        public Obstacles (int height) {
        };
        public Obstacles(String name, int Height, int Distance) {
            this.name = name;
            this.Height= Height;
            this.Distance = Distance;
        }
    public int setDistance() {
        return Distance;
    };
    public static int getDistance() {
        return Distance;
    };
    public int setHeight() {
        return Height;
    };
    public int getHeight() {
        return Height;
    }







}
