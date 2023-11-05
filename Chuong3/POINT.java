
package Chuong3;

public class POINT {
    private int x;
    private int y;

    // Contructor
    public POINT() {
        x = 0;
        y = 0;
    }

    public POINT(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter - Setter
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

    // distance
    public double distance(POINT p) {
        int x2 = p.getX();
        int y2 = p.getY();
        return Math.sqrt(Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2));
    }

    // toString()

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }

}
