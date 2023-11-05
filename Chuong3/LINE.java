
package Chuong3;

public class LINE {
    private POINT A;
    private POINT B;

    // Constructor
    public LINE() {
        A = new POINT();
        B = new POINT();
    }

    public LINE(POINT p1, POINT p2) {
        this.A = p1;
        this.B = p2;
    }

    // Getter - Setter
    public POINT getA() {
        return A;
    }

    public void setA(POINT p) {
        this.A = A;
    }

    public POINT getB() {
        return B;
    }

    public void setB(POINT p) {
        this.B = B;
    }

    // distance
    public double distance() {
        int x1 = A.getX();
        int y1 = A.getY();

        int x2 = B.getX();
        int y2 = B.getY();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    private double xIntercept() {
        if (A.getY() == B.getY()) { // nếu 2 điểm A và B có cùng tung độ
            return Double.POSITIVE_INFINITY; // thì đoạn thẳng song song trục x
        }
        double intercept = (double) (B.getY() - A.getY()) / (A.getX() - B.getX());
        return intercept;
    }

    private double yIntercept() {
        if (A.getX() == B.getX()) { // nếu 2 điểm A và B có cùng hoành độ
            return Double.POSITIVE_INFINITY; // thì đoạn thẳng song song trục y
        }
        double intercept = A.getY() - (double) (A.getY() - B.getY()) / (A.getX() - B.getX()) * A.getX();
        return intercept;
    }

    public double getXIntercept() {
        return xIntercept();
    }

    public double getYIntercept() {
        return yIntercept();
    }

    @Override
    public String toString() {
        return "LINE{" + "A=" + A + ", B=" + B + '}';
    }

}
