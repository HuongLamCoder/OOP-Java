
package baitapchuong3;

import java.util.Scanner;

public class ConNguoi {
    Scanner sc = new Scanner(System.in);
    
    private String hoTen;
    private int yob;
    private String diaChi;
    private String dienThoai;
    
    //Constructor

    public ConNguoi() {
        hoTen = null;
        yob = 0;
        diaChi = null;
        dienThoai = null;
    }

    public ConNguoi(String hoTen, int yob, String diaChi, String dienThoai) {
        this.hoTen = hoTen;
        this.yob = yob;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
    }

    //Getter - Setter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }
    
    
    //Input
    public void nhap(){
        System.out.print("Nhập họ và tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        dienThoai = sc.nextLine();
    }

    public void thongTin(){
        System.out.printf("|%-25s|%4d|%-15s|%-10s|",
                                hoTen, yob, diaChi, dienThoai);
    }
}
