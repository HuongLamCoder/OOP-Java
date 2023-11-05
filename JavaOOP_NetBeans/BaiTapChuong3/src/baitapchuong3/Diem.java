
package baitapchuong3;

import java.util.Scanner;

public class Diem {
    Scanner sc = new Scanner(System.in);
    private double x;
    private double y;
    
    //Constructor
    public Diem(){
        x = 0.0;
        y = 0.0;
    }
    
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //Getter - Setter

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //Input
    public void nhapDiem(){
        System.out.print("Nhập hoành độ: ");
        x = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập tung độ: ");
        y = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    //Di chuyển điểm
    public void diChuyen(){
        System.out.print("Nhập khoảng cách di chuyển theo trục hoành: ");
        double dx = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập khoảng cách di chuyển theo trục tung: ");
        double dy = Double.parseDouble(sc.nextLine());

        setX(x+dx);
        setY(y+dy);
    }
}
