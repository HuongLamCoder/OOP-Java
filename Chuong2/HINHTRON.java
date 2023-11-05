package Chuong2;

import java.util.Scanner;

public class HINHTRON {
    Scanner sc = new Scanner(System.in);
    //Thuộc tính bán kính của hình tròn
    private double r;
    static double Pi = 3.14;
    
    //Khởi tạo
    public HINHTRON(){
        r = 0.0;
    }

    public HINHTRON(double r){
        this.r = r;
    }

    //Phương thức set
    public void setBanKinh(double r){
        this.r = r;
    }

    //Phương thức get
    public double getBanKinh(){
        return r;
    }

    //Phương thức nhập bán kính hình tròn
    public void nhapBk(){
        System.out.print("Nhập bán kính hình tròn: ");
        r = sc.nextDouble();
    }

    //Phương thức xuất bán kính hình tròn
    public void xuatBk(){
        System.out.println("Bán kính hình tròn là: " + r);
    }

    //Phương thức tính chu vi hình tròn
    public double chuVi(){
        return 2*r*Pi;
    }

    //Phương thức tính diện tích hình tròn
    public double dienTich(){
        return r*r*Pi;
    }

    //Tạo menu
    public void menu(){
        int choice;
        do{
            System.out.println();
            System.out.println("1 - Tính chu vi.");
            System.out.println("2 - Tính diện tích.");
            System.out.println("0 - Trở về.");

            System.out.print("\nNhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            System.out.println();
            
            if(choice == 0){
                System.out.println("Menu chọn bài:");
                break;
            }

            if(choice<0 || choice>2){
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }

            switch(choice){
                case 1:
                    System.out.println("Chu vi hình tròn là: " + chuVi());
                    break;
                case 2:
                    System.out.println("Diện tích hình tròn là: " + dienTich());
                    break;
            }
        }while(choice != 0);
    }
}
