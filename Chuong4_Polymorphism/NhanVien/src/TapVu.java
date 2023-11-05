import java.util.Scanner;

public class TapVu extends NhanVien {
    private double soGioLamThem;
    private final double luongLamThemMoiGio = 30;

    //Constructor
    public TapVu() {
        super();
        soGioLamThem = 0.0;
    }

    public TapVu(String maNV, String hoTen, double heSoLuong, double soGioLamThem) {
        super(maNV, hoTen, heSoLuong);
        this.soGioLamThem = soGioLamThem;
    }

    //Getter - Setter

    public double getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(double soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    //Phương thức nhập 1 tạp vụ
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập số giờ làm thêm: ");
        soGioLamThem = Double.parseDouble(sc.nextLine());
    }

    //Phương thức xuất 1 tạp vụ
    @Override
    public void xuat() {
        System.out.printf("|%-8s|%-25s|%-12s|    %.2f|%-4d    |%-9s|         %.1f|%.2f\n",
                maNV, hoTen, "Tạp vụ", heSoLuong, luongCoBan, "    -    ", soGioLamThem, tinhLuong());
    }

    @Override
    public double tinhLuong() {
        return heSoLuong * luongCoBan + soGioLamThem * luongLamThemMoiGio;
    }
}
