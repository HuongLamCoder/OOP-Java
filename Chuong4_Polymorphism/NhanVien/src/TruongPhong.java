
import java.util.Scanner;

public class TruongPhong extends NhanVien {
    private double heSoTrachNhiem;

    //Constructor
    public TruongPhong() {
        super();
        heSoTrachNhiem = 0.0;
    }

    public TruongPhong(String maNV, String hoTen, double heSoLuong, double heSoTrachNhiem) {
        super(maNV, hoTen, heSoLuong);
        this.heSoTrachNhiem = heSoTrachNhiem;
    }

    //Getter - Setter
    public double getHeSoTrachNhiem() {
        return heSoTrachNhiem;
    }

    public void setHeSoTrachNhiem(double heSoTrachNhiem) {
        this.heSoTrachNhiem = heSoTrachNhiem;
    }

    //Phương thức nhập trưởng phòng
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập hệ số trách nhiệm: ");
        heSoTrachNhiem = Double.parseDouble(sc.nextLine());
    }

    //Phương thức xuất 1 trưởng phòng
    @Override
    public void xuat() {
        System.out.printf("|%-8s|%-25s|%-12s|    %.2f|%-4d    |      %.1f|%-12s|%.2f\n",
                maNV, hoTen, "Trưởng phòng", heSoLuong, luongCoBan, heSoTrachNhiem, "      -     ", tinhLuong());
    }

    //Phương thức tính lương
    @Override
    public double tinhLuong() {
        return (heSoLuong + heSoTrachNhiem) * luongCoBan;
    }
}
