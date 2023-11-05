import java.util.Scanner;

public class SinhVien{
    static Scanner sc = new Scanner(System.in);
    String masv;
    private String hoten;
    private String ngaysinh;
    private String diachi;
    private String sdt;
    public static String noihoc="Đại học Sài Gòn";
    private static int dem=0;   //tất cả đối tượng sẽ trỏ về bộ nhớ dùng chung static -> giá trị biến đếm tăng lên

    public SinhVien(){
        this.masv = "";
        hoten = "";
        ngaysinh = "";
        diachi = "";
        sdt = "";
        dem++;
    }

    public SinhVien(String masv, String hoten, String ngaysinh, String diachi, String sdt){
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        dem++;
    }

    public SinhVien(SinhVien sv){
        masv = sv.masv;
        hoten = sv.hoten;
        ngaysinh = sv.ngaysinh;
        diachi = sv.diachi;
        sdt = sv.sdt;
        dem++;
    }

    public void setMasv(){
        System.out.print("Nhập mã số sinh viên: ");
        masv = sc.nextLine();
    }
    public void setHoten(){
        System.out.print("Nhập họ tên: ");
        hoten = sc.nextLine();
    }
    public void setNgaysinh(){
        System.out.print("Nhập ngày sinh: ");
        ngaysinh = sc.nextLine();
    }
    public void setDiachi(){
        System.out.print("Nhập địa chỉ: ");
        diachi = sc.nextLine();
    }
    public void setSDT(){
        System.out.print("Nhập số điện thoại: ");
        sdt = sc.nextLine();
    }
    public static void setNoihoc(){
        SinhVien.noihoc = noihoc;
    }

    public String getMasv(){
        return masv;
    }
    public String getHoten(){
        return masv;
    }
    public String getNgaysinh(){
        return ngaysinh;
    }
    public String getDiachi(){
        return diachi;
    }
    public String getSDT(){
        return sdt;
    }
    public static String getNoihoc(){
        return noihoc;
    }

    public void nhapSV(){
        setMasv();
        setHoten(); 
        setNgaysinh();
        setDiachi();
        setSDT();
    }

    // public void xuatSV(){
    //     System.out.println("Sinh viên thứ " + dem);
    //     System.out.println("MSSV: " + getMasv());
    //     System.out.println("Họ tên SV: " + getHoten());
    //     System.out.println("Ngày sinh: " + getNgaysinh());
    //     System.out.println("Địa chỉ: " + getDiachi());
    //     System.out.println("SĐT: " + getSDT());
    //     System.out.println("Trường: " + getNoihoc());
    //     System.out.println("=======================================");
    // }
    
    public void xuatSV(){
        System.out.printf("%-12s%-20s%-12s%-25s%-15s%-12s\n", masv,hoten,ngaysinh,diachi,sdt,noihoc);
    }

    public static void main(String[] args){
        SinhVien sv1 = new SinhVien();
        sv1.nhapSV();
        
        SinhVien sv2 = new SinhVien();
        sv2.nhapSV();

        SinhVien sv3 = new SinhVien(sv1);
        
        System.out.println("\n========DANH SÁCH SINH VIÊN========");
        sv1.xuatSV();
        sv2.xuatSV();
        sv3.xuatSV();

        System.out.println("So luong sinh vien: " + dem);
        
    }
}