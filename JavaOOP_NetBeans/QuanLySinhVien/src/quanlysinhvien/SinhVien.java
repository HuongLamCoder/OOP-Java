
package quanlysinhvien;

import java.util.Scanner;

public class SinhVien extends ConNguoi{
    private String maSV;
    private double diemTB;
    
    //Constructor
    public SinhVien(){
        super();
        maSV = null;
        diemTB = 0.0;
    }

    public SinhVien(String maSV, double diemTB, String hoTen, int namSinh, String dienThoai, DiaChi diaChi) {
        super(hoTen, namSinh, dienThoai, diaChi);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }
    
    //Getter - Setter
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    //Phương thức nhập 1 sinh viên
    public void nhapSV(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập mã SV: ");
        maSV = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        diemTB = Double.parseDouble(sc.nextLine());
        super.nhapThongTin();
    }
    
    //Phương thức xuất 1 sinh viên
    public void xuatSV(){
        System.out.printf("|%-10s|%-25s|%4d|%-12s|%-25s|%.2f|\n",
                            maSV, getHoTen(), getNamSinh(), getDienThoai(), getDiaChi(), diemTB);
    }
}
