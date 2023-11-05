
import java.util.Scanner;

public class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double heSoLuong;
    protected static int luongCoBan = 1310;

    //Constructor
    public NhanVien() {
        maNV = null;
        hoTen = null;
        heSoLuong = 0.0;
    }

    public NhanVien(String maNV, String hoTen, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.heSoLuong = heSoLuong;
    }

    //Getter - Setter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public static int getLuongCoBan() {
        return luongCoBan;
    }

    public static void setLuongCoBan(int luongCoBan) {
        NhanVien.luongCoBan = luongCoBan;
    }

    //Phương thức nhập một nhân viên
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = Double.parseDouble(sc.nextLine());
    }

    //Phương thức xuất 1 nhân viên
    public void xuat() {
        System.out.printf("|%-8s|%-25s|%-12s|    %.2f|%-4d    |%-9s|%-12s|%.2f\n",
                           maNV, hoTen, "Nhân viên", heSoLuong, luongCoBan, "    -    ", "      -     ", tinhLuong());
    }

    //Phương thức tính lương của 1 nhân viên
    public double tinhLuong() {
        return heSoLuong * luongCoBan;
    }
}
