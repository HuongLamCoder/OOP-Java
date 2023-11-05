package Chuong2;

import java.util.Scanner;

public class HINHCHUNHAT {
    Scanner sc = new Scanner(System.in);

    //Thuộc tính của hình chữ nhật
    private double chieuDai;
    private double chieuRong;

    //Khởi tạo 
    public HINHCHUNHAT(){
        chieuDai = 0.0;
        chieuRong = 0.0;
    }

    public HINHCHUNHAT(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    //Phương thức set
    public void setChieuDai(double chieuDai){
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong){
        this.chieuRong = chieuRong;
    }

    //Phương thức get
    public double getChieuDai(){
        return this.chieuDai;
    }

    public double getChieuRong(){
        return this.chieuRong;
    }

    //Phương thức nhập chiều dài & chiều rộng
    public void nhapHCN(){
        System.out.print("Nhập chiều dài: ");
        chieuDai = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        chieuRong = sc.nextDouble();
    }

    //Phương thức xuất chiều dài và chiều rộng 
    public void xuatHCN(){
        System.out.println("Chiều dài: " + getChieuDai());
        System.out.println("Chiều rộng: " + getChieuRong());
    }

    //Phương thức tính chu vi
    public double chuVi(){
        return (getChieuDai() + getChieuRong())*2;
    }

    //Phương thức tính diện tích
    public double dienTich(){
        return getChieuDai() * getChieuRong();
    }

    //Tạo Menu
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
                    System.out.println("Chu vi hình chữ nhật là: " + chuVi());
                    break;
                case 2:
                    System.out.println("Diện tích hình chữ nhật là: " + dienTich());
                    break;
            }
        }while(choice != 0);
    }
}
