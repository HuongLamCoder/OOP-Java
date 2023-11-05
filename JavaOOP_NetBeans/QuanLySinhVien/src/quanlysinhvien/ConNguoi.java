
package quanlysinhvien;

import java.util.Scanner;

public class ConNguoi {
    protected String hoTen;
    protected int namSinh;
    protected String dienThoai;
    protected DiaChi diaChi;    //has - a
    
    //Constructor
    public ConNguoi(){
        hoTen = null;
        namSinh = 0;
        dienThoai = null;
        diaChi = new DiaChi();
    }

    public ConNguoi(String hoTen, int namSinh, String dienThoai, DiaChi diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
    }
    
    //Getter - Setter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        namSinh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số điện thoại: ");
        dienThoai = sc.nextLine();
        System.out.println("Nhập địa chỉ nhà ");
        diaChi.nhapDC();
    }
    
    public void xuatThongTin(){
        System.out.printf("|%-25s|%4d|%-10s|%-20s",
                            hoTen, namSinh, dienThoai, diaChi);
    }
}
