
package Chuong3;

public class CIRCLE {
    private static final double PI = 3.14;
    private POINT center;
    private int r;

    // Constructor
    public CIRCLE() {
        center = new POINT();
        r = 0;
    }

    public CIRCLE(POINT center, int r) {
        this.center = center;
        this.r = r;
    }

    // Getter - Setter
    public POINT getCenter() {
        return center;
    }

    public void setCenter(POINT center) {
        this.center = center;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getArea() {
        return PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "Hình tròn: {" + "Tâm: " + center + ", bán kính: " + r + '}';
    }

}
