package Chuong2;

import java.util.Scanner;

public class DIEM {
    Scanner sc = new Scanner(System.in);
    //Thuộc tính tọa độ x và y
    private double x;
    private double y;

    //Khởi tạo tọa độ không có tham số truyền vào
    public DIEM(){
        x = 0.0;
        y = 0.0;
    }
    
    //Khởi tạo tọa độ có tham số truyền vào
    public DIEM(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Phương thức set
    public void setDiemX(double x){
        this.x = x;
    }

    public void setDiemY(double y){
        this.y = y;
    }

    //Phương thức get 
    public double getDiemX(){
        return this.x;
    }

    public double getDiemY(){
        return this.y;
    }

    //Phương thức nhập tọa độ từ bàn phím
    public void nhapDiem(){
        System.out.print("Nhập hoành độ x: ");
        x = sc.nextDouble();
        System.out.print("Nhập tung độ y: ");
        y = sc.nextDouble();
    }

    //Phương thức xuất tọa độ
    public void xuatDiem(){
        System.out.println("Tọa độ: (" + getDiemX() + "," + getDiemY() + ")");
    }

    //Phương thức di chuyền tọa độ
    public void diChuyen(){
        System.out.print("Nhập khoảng cách di chuyển theo trục hoành: ");
        double dx = sc.nextDouble();
        System.out.print("Nhập khoảng cách di chuyển theo trục tung: ");
        double dy = sc.nextDouble();

        setDiemX(x+dx);
        setDiemY(y+dy);
    }
}
