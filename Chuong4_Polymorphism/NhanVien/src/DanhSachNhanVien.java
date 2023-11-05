import java.util.Arrays;
import java.util.Scanner;

public class DanhSachNhanVien {
    Scanner sc = new Scanner(System.in);
    private int n;  //số lượng nhân viên
    NhanVien[] arrnv;

    //Constructor
    public DanhSachNhanVien() {
        n = 0;
        arrnv = null;
    }

    public DanhSachNhanVien(int n, NhanVien[] arrnv) {
        this.n = n;
        this.arrnv = arrnv;
    }

    //Getter - Setter
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public NhanVien[] getArrnv() {
        return arrnv;
    }

    public void setArrnv(NhanVien[] arrnv) {
        this.arrnv = arrnv;
    }

    //Phương thức nhập danh sách nhân viên
    public void nhapDSNV() {
        System.out.print("Nhập số lượng nhân viên: ");
        n = Integer.parseInt(sc.nextLine());
        arrnv = new NhanVien[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Chọn chức vụ nhân viên cần nhập:");
            System.out.println("1. Trưởng phòng");
            System.out.println("2. Tạp vụ");
            System.out.println("3. Nhân viên");

            System.out.print("Nhập lựa chọn của bạn: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch(chon) {
                case 1:
                    arrnv[i] = new TruongPhong();
                    arrnv[i].nhap();
                    break;
                case 2:
                    arrnv[i] = new TapVu();
                    arrnv[i].nhap();
                    break;
                case 3:
                    arrnv[i] = new NhanVien();
                    arrnv[i].nhap();
                    break;
            }
        }
    }

    //Phương thức xuất danh sách nhân viên
    public void xuatDSNV() {
        if(arrnv == null) {
            System.out.println("Danh sách nhân viên đang trống!");
            return;
        }

        System.out.printf("|%-8s|%-25s|%-12s|%-8s|%-8s|%-9s|%-12s|%-8s\n",
                           "Mã NV", "Tên NV", "Chức vụ", "HS Lương", "Lương CB", "HS TNhiệm", "Giờ Làm Thêm", "Lương TL");
        for (int i = 0; i < n; i++) {
            if(arrnv[i] instanceof TruongPhong){
                TruongPhong trph = (TruongPhong) arrnv[i];
                trph.xuat();
            }
            else if (arrnv[i] instanceof TapVu){
                TapVu tv = (TapVu) arrnv[i];
                tv.xuat();
            }
            else {
                arrnv[i].xuat();
            }
        }
    }

    //Thêm 1 nhân viên vào danh sách
    public void themNhanVien() {
        System.out.println("Chọn chức vụ của nhân viên cần thêm:");
        System.out.println("1. Trưởng phòng");
        System.out.println("2. Tạp vụ");
        System.out.println("3. Nhân viên");

        System.out.print("Nhập lựa chọn của bạn: ");
        int chon = Integer.parseInt(sc.nextLine());

        if(arrnv == null) //nếu danh sách đang rỗng thì khởi tạo mảng nhân viên arrnv
        {
            arrnv = new NhanVien[0];
        }

        arrnv = Arrays.copyOf(arrnv, arrnv.length + 1);

        switch(chon) {
            case 1:
                arrnv[n] = new TruongPhong();
                arrnv[n].nhap();
                break;
            case 2:
                arrnv[n] = new TapVu();
                arrnv[n].nhap();
                break;
            case 3:
                arrnv[n] = new NhanVien();
                arrnv[n].nhap();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
        n++;
    }


    //Xóa 1 nhân viên khỏi danh sách
    public void xoaNhanVien() {
        System.out.print("Nhập mã số nhân viên cần xóa: ");
        String maNVCanXoa = sc.nextLine();

        int viTriXoa = -1;

        for(int i = 0; i < arrnv.length; i++) {
            if(arrnv[i].getMaNV().equalsIgnoreCase(maNVCanXoa)) {
                viTriXoa = i;
                break;
            }
        }

        if(viTriXoa != -1) {
            NhanVien[] newArr = new NhanVien[n + 1];
            for(int i = 0, j = 0; i < n; i++){
                if(i != viTriXoa){
                    newArr[j] = arrnv[i];
                    j++;
                }
            }
            arrnv  = newArr;
            n--;
            System.out.println("Nhân viên có mã số " + maNVCanXoa + " đã được xóa khỏi mảng!");

            if(n == 0) //nếu đã xóa hết nhân viên trong mảng thì dsnv rỗng, trỏ arrnv về null
            {
                arrnv = null;
            }
        }
        else {
            System.out.println("Không tìm thấy nhân viên cần xóa trong mảng!");
        }
    }

    //Sửa thông tin nhân viên
    public void suaThongTinNhanVien() {
        if(arrnv == null) {
            System.out.println("Danh sách nhân viên đang trống!");
            return;
        }

        System.out.print("Nhập mã nhân viên cần sửa thông tin: ");
        String maNVCanSua = sc.nextLine();

        int viTriSua = -1;

        for(int i = 0; i < arrnv.length; i++){
            if(arrnv[i].getMaNV().equalsIgnoreCase(maNVCanSua)){
                viTriSua = i;
                break;
            }
        }

        if(viTriSua != -1) {
            int chon;
            do {
                System.out.println("\nCHỌN THÔNG TIN CẦN SỬA: ");
                System.out.println("0. Thoát");
                System.out.println("1. Mã nhân viên");
                System.out.println("2. Họ tên nhân viên");
                System.out.println("3. Hệ số lương");

                if (arrnv[viTriSua] instanceof TruongPhong) {
                    System.out.println("4. Hệ số trách nhiệm");
                } else if (arrnv[viTriSua] instanceof TapVu) {
                    System.out.println("4. Số giờ làm thêm");
                }

                System.out.print("Nhập lựa chọn của bạn: ");
                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 0:
                        System.out.println("Đã hoàn tất chỉnh sửa thông tin nhân viên thành công!");
                    case 1:
                        System.out.print("Nhập mã nhân viên mới: ");
                        String maNV = sc.nextLine();
                        arrnv[viTriSua].setMaNV(maNV);
                        System.out.println("Thông tin nhân viên sau khi sửa đổi: ");
                        arrnv[viTriSua].xuat();
                        break;
                    case 2:
                        System.out.print("Nhập họ và tên mới: ");
                        String hoTen = sc.nextLine();
                        arrnv[viTriSua].setHoTen(hoTen);
                        System.out.println("Thông tin nhân viên sau khi sửa đổi: ");
                        arrnv[viTriSua].xuat();
                        break;
                    case 3:
                        System.out.print("Nhập hệ số lương mới: ");
                        double heSoLuong = Double.parseDouble(sc.nextLine());
                        arrnv[viTriSua].setHeSoLuong(heSoLuong);
                        System.out.println("Thông tin nhân viên sau khi sửa đổi: ");
                        arrnv[viTriSua].xuat();
                        break;
                    case 4:
                        if (arrnv[viTriSua] instanceof TruongPhong) {
                            System.out.print("Nhập hệ số trách nhiệm mới: ");
                            double heSoTN = Double.parseDouble(sc.nextLine());
                            ((TruongPhong) arrnv[viTriSua]).setHeSoTrachNhiem(heSoTN);
                            System.out.println("Thông tin nhân viên sau khi sửa đổi: ");
                            arrnv[viTriSua].xuat();
                        }
                        else if (arrnv[viTriSua] instanceof TapVu) {
                            System.out.print("Nhập số giờ làm thêm mới: ");
                            double gioLamThem = Double.parseDouble(sc.nextLine());
                            ((TapVu) arrnv[viTriSua]).setSoGioLamThem(gioLamThem);
                            System.out.println("Thông tin nhân viên sau khi sửa đổi: ");
                            arrnv[viTriSua].xuat();
                        }
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
                }
            }while(chon != 0);
        }
        else {
            System.out.println("Không tìm thấy nhân viên trong mảng!");
        }
    }
}
