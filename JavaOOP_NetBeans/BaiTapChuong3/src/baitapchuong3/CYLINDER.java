
package baitapchuong3;

public class CYLINDER extends CIRCLE{
    private static final double PI = 3.14;
    private int height;
    
    //Constructor
    public CYLINDER(){
        super();
        height = 0;
    }

    public CYLINDER(int height, POINT center, int r) {
        super(center, r);
        this.height = height;
    }
    
    //Getter - Setter
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    @Override
    //Diện tích toàn phần hình trụ: S = 2*pi*r*(r+h)
    public double getArea(){
        return 2 * PI * getR() * (getR() + getHeight());
    }
    
    //Thể tích hình trụ: V = S_đáy * h = pi * r^2 * h
    public double getVolumn(){
        return PI * Math.pow(getR(), 2) * getHeight();
    }

    @Override
    public String toString() {
        return "Hình trụ: {Bán kính đáy: " + getR() + ", chiều cao: " + height + ", diện tích: " + getArea() + ", thể tích: " + getVolumn() + "}" ;
    }
    
    
}
