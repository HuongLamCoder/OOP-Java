
package Chuong3;

public class HocSinh extends ConNguoi {
    private String maHS;
    private String lop;
    private double diemTB;

    // Constructor
    public HocSinh() {
        super();
        maHS = null;
        lop = null;
        diemTB = 0.0;
    }

    public HocSinh(String maHS, String lop, double diemTB, String hoTen, int yob, String diaChi, String dienThoai) {
        super(hoTen, yob, diaChi, dienThoai);
        this.maHS = maHS;
        this.lop = lop;
        this.diemTB = diemTB;
    }

    // Getter - Setter

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    // Input
    public void nhapHS() {
        System.out.print("Nhập mã hs: ");
        maHS = sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop = sc.nextLine();
        super.nhap();
        System.out.print("Nhập diểm TB: ");
        diemTB = Double.parseDouble(sc.nextLine());
    }

    // PrintInfo
    public void xuatHS() {
        System.out.printf("|%-8s|%-25s|%-7s|%-15s|%-10s|%4.2f|\n",
                maHS, super.getHoTen(), lop, super.getDiaChi(), super.getDienThoai(), diemTB);
    }
}
