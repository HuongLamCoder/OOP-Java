import java.util.Scanner;
public class DongVat {
    Scanner sc = new Scanner(System.in);
    protected String tenDV;
    protected double chieuCao;
    protected double canNang;
    protected String tiengKeu;
    protected String thucAn;
    protected int soChan;

    //Constructor
    public DongVat() {
        tenDV = null;
        chieuCao = 0.0;
        canNang = 0.0;
        tiengKeu = null;
        thucAn = null;
        soChan = 0;
    }

    public DongVat(String tenDV, double chieuCao, double canNang, String tiengKeu, String thucAn, int soChan) {
        this.tenDV = tenDV;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
        this.tiengKeu = tiengKeu;
        this.thucAn = thucAn;
        this.soChan = soChan;
    }

    //Getter - Setter

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV() {
        System.out.print("Nhập tên của động vật: ");
        this.tenDV = sc.nextLine();
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao() {
        System.out.print("Nhập chiều cao: ");
        this.chieuCao = Double.parseDouble(sc.nextLine());
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang() {
        System.out.print("Nhập cân nặng: ");
        this.canNang = Double.parseDouble(sc.nextLine());
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public void setTiengKeu() {
        tiengKeu = null;
    }

    public String getThucAn() {
        return thucAn;
    }

    public void setThucAn(String thucAn) {
        this.thucAn = thucAn;
    }

    public void setThucAn() {
        thucAn = null;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan() {
        System.out.print("Nhập số chân: ");
        this.soChan = Integer.parseInt(sc.nextLine());
    }

    //Methods
    public void nhap() {
        setTenDV();
        setChieuCao();
        setCanNang();
        setTiengKeu();
        setThucAn();
        setSoChan();
    }

    public void xuat() {
        System.out.printf("|%-10s|%-4.2f|%-4.2f|%-10s|%-10s|%-2d|",
                           tenDV, chieuCao, canNang, tiengKeu, thucAn, soChan);
    }

    public void an() {
        System.out.println("Măm măm");
    }

    public void keu() {
        System.out.println("Tiếng kêu của động vật");
    }

    public void phuongThucCuaDV() {
        System.out.println("Phương thức của động vật");
    }
}
