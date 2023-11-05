
package data;

public class Disk extends Shape{
    public static final double PI = 3.14;

    private String smile;
    private double radius;

    public Disk(String owner, String color, String borderColor, String smile, double radius) {
        super(owner, color, borderColor);
        this.smile = smile;
        this.radius = radius;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Disk.PI;   //mặc dù trong cùng Khuôn nhưng bản chất là nằm ngoài khi được new
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Disk.PI;
    }

    @Override
    public void paint() {
        System.out.printf("|DISK      |%-10s|%-10s|%-10s|%-3s|%4.1f|%7.2f|%7.2f|\n",
                owner, color, borderColor, smile, radius, getArea(), getPerimeter());
    }


}
