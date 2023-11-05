package Chuong2;

import java.util.Scanner;

public class SinhVien {
    Scanner sc = new Scanner(System.in);
    //Thuộc tính lớp SinhVien
    private String masv;
    private String hoten;
    private String lop;
    private double diemmon1;
    private double diemmon2;
    private double diemmon3;

    //Khởi tạo SinhVien không có tham số truyền vào
    public SinhVien(){
        this.masv = null;
        this.hoten = null;
        this.lop = null;
        this.diemmon1 = 0.0;
        this.diemmon2 = 0.0;
        this.diemmon3 = 0.0;
    }

    //Khởi tạo SinhVien có tham số truyền vào
    public SinhVien(String masv, String hoten, String lop, double diemmon1, double diemmon2, double diemmon3){
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
        this.diemmon1 = diemmon1;
        this.diemmon2 = diemmon2;
        this.diemmon3 = diemmon3;
    }

    //Phương thức set 
    public void setMasv(String masv){
        this.masv = masv;
    }

    public void setHoten(String hoten){
        this.hoten = hoten;
    }

    public void setLop(String lop){
        this.lop = lop;
    }

    public void setDiemMon1(double diemmon1){
        if(diemmon1 >= 0 && diemmon1 <= 10){
            this.diemmon1 = diemmon1;
        }
        else{
            System.out.println("Điểm không hợp lệ!");
        }
    }

    public void setDiemMon2(double diemmon2){
        if(diemmon2 >= 0 && diemmon2 <= 10){
            this.diemmon2 = diemmon2;
        }
        else{
            System.out.println("Điểm không hợp lệ!");
        }
    }

    public void setDiemMon3(double diemmon3){
        if(diemmon3 >= 0 && diemmon3 <= 10){
            this.diemmon3 = diemmon3;
        }
        else{
            System.out.println("Điểm không hợp lệ!");
        }
    }

    //Phương thức get
    public String getMasv(){
        return this.masv;
    }

    public String getHoten(){
        return this.hoten;
    }

    public String getLop(){
        return this.lop;
    }

    public double getDiemMon1(){
        return this.diemmon1;
    }

    public double getDiemMon2(){
        return this.diemmon2;
    }

    public double getDiemMon3(){
        return this.diemmon3;
    }

    //Phương thức nhập thông tinh sinh vien
    public void nhapSV(){
        System.out.print("Nhập mã sinh viên: ");
        masv = sc.nextLine();
        System.out.print("Nhập họ và tên: ");
        hoten = sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop = sc.nextLine();
        System.out.print("Nhập điểm môn 1: ");
        diemmon1 = sc.nextDouble();
        System.out.print("Nhập điểm môn 2: ");
        diemmon2 = sc.nextDouble();
        System.out.print("Nhập điểm môn 3: ");
        diemmon3 = sc.nextDouble();
    }

    //Phương thức tính điểm trung bình
    public double calcAvg(){
        double avg = (diemmon1 + diemmon2 + diemmon3) / 3;
        return Double.parseDouble(String.format("%.2f",avg));
    }

    //Phương thức xếp loại
    public String xepLoaiSV(){
        double avg = calcAvg();
        if(avg >= 8){
            return "Giỏi";
        }
        else if(avg >= 6.5){
            return "Khá";
        }  
        else if(avg >= 5){
            return "Trung bình";
        }
        else{
            return "Yếu";
        }
    }

    //Phương thức xuất thông tin sinh viên
    public void xuatSV(){
        System.out.printf("%-12s%-30s%-12s%-12s%-12s%-12s%-12s%-15s\n", masv,hoten,lop,diemmon1,diemmon2,diemmon3,calcAvg(),xepLoaiSV());
    }
}
