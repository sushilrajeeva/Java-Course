package com.passBy;

public class TestPassByReference {
    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
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
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Point first = new Point(1, 2);
        System.out.println("first : " + first);
        move(first);
        System.out.println("after moving first : " + first);
    }

    public static void move(Point p) {

        System.out.println("Moving the point....");
        p.setX(p.getX() + 1);
        p.setY(p.getY() + 1);
    }
}
