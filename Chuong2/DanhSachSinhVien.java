package Chuong2;

import java.util.Scanner;

public class DanhSachSinhVien {
    Scanner sc = new Scanner(System.in);

    private int siSo;
    SinhVien[] arrsv;

    // Khởi tạo danh sách sinh viên
    public DanhSachSinhVien() {
        arrsv = null;
        siSo = 0;
    }

    // Phương thức nhập danh sách sinh viên
    public void nhapDSSV() {
        System.out.print("Nhập số lượng sinh viên: ");
        siSo = Integer.parseInt(sc.nextLine());
        arrsv = new SinhVien[siSo];
        for (int i = 0; i < siSo; i++) {
            System.out.println("Nhập vào sinh viên thứ " + (i + 1) + ": ");
            // Cách 1
            SinhVien a = new SinhVien();
            a.nhapSV();
            arrsv[i] = a;

            // Cách 2:
            // SinhVien arrsv[i] = new SinhVien();
            // arrsv[i].nhapSV();
        }
    }

    // Phương thức in danh sách sinh viên
    public void xuatDSSV() {
        System.out.println("Sĩ số: " + siSo);
        System.out.printf("%-12s%-30s%-12s%-12s%-12s%-12s%-12s%-15s\n", "Mã SV", "Họ tên SV", "Lớp", "Điểm môn 1",
                "Điểm môn 2", "Điểm môn 3", "ĐTB", "Xếp loại");
        for (SinhVien sv : arrsv) {
            sv.xuatSV();
        }
    }

    // Phương thức tìm kiếm sinh viên (Cách 1)
    public void timkiemSinhvien() {
        System.out.print("Nhập mã sinh viên cần tìm: ");
        String masv = sc.nextLine();
        for (int i = 0; i < arrsv.length; i++) {
            if (arrsv[i].getMasv().equalsIgnoreCase(masv)) {
                arrsv[i].xuatSV();
            }
        }
    }

    // Phương thức tìm kiếm sinh viên (trả về vị trí)
    public int timkiemSinhvien(String masv) {
        int vitri = 0;
        for (int i = 0; i < arrsv.length; i++) {
            if (arrsv[i].getMasv().equalsIgnoreCase(masv)) {
                vitri = i;
            }
        }
        return vitri;
    }

    // Phương thức tìm kiếm sinh viên (Cách 2)
    public SinhVien timkiemSinhVien_2() {
        SinhVien sv = null;
        System.out.print("Nhập mã sinh viên cần tìm: ");
        String masv = sc.nextLine();
        for (int i = 0; i < arrsv.length; i++) {
            if (arrsv[i].getMasv().equalsIgnoreCase(masv)) {
                sv = arrsv[i];
                break;
            }
        }
        return sv;
    }

    // Phương thức xóa 1 sinh viên khỏi danh sách
    public void xoaSinhVien() {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        sc.nextLine(); // tránh trường hợp đọc kí tự newline
        String masvXoa = sc.nextLine();

        int vitriXoa = -1; // khởi tạo vị trí ban đầu -1 (không tìm thấy)

        // Tìm vị trí của sinh viên cần xóa trong mảng
        for (int i = 0; i < siSo; i++) {
            if (arrsv[i].getMasv().equalsIgnoreCase(masvXoa)) {
                vitriXoa = i;
                break; // tìm được sinh viên cần xóa và thoát khỏi vòng lặp
            }
        }

        if (vitriXoa != -1) {
            SinhVien[] newArr = new SinhVien[siSo - 1];
            for (int i = 0, j = 0; i < siSo; i++) {
                if (i != vitriXoa) {
                    newArr[j] = arrsv[i]; // sao chép danh sách sinh viên sang ds tạm (trừ sinh viên cần xóa)
                    j++;
                }
            }

            arrsv = newArr; // sao chép lại sinh viên từ ds tạm về dssv sau khi xóa 1 sinh viên
            siSo--;
            System.out.println("Sinh viên có mã " + masvXoa + " đã được xóa khỏi danh sách!");
        } else {
            System.out.println("Sinh viên có mã " + masvXoa + " không có trong danh sách!");
        }

    }

    // Phương thức thêm 1 sinh viên mới vào danh sách
    public void themSinhVien() {
        SinhVien svMoi = new SinhVien();
        svMoi.nhapSV();

        SinhVien[] newArr = new SinhVien[siSo + 1];
        for (int i = 0; i < siSo; i++) {
            newArr[i] = arrsv[i];
        }
        newArr[siSo] = svMoi;
        arrsv = newArr;
        siSo++;
        System.out.println("Sinh viên đã được thêm vào danh sách!");
    }

    // Tạo menu
    public void menu() {
        int choice;
        do {
            System.out.println();
            System.out.println("1 - Tìm kiếm sinh viên");
            System.out.println("2 - Thêm 1 sinh viên vào danh sách");
            System.out.println("3 - Xóa 1 sinh viên khỏi danh sách");
            System.out.println("0 - Trở về.");

            System.out.print("\nNhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            System.out.println();

            if (choice == 0) {
                System.out.println("Menu chọn bài:");
                break;
            }

            if (choice < 0 || choice > 3) {
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }

            switch (choice) {
                case 1:
                    timkiemSinhvien();
                    break;
                case 2:
                    themSinhVien();
                    System.out.println("Danh sách sau khi thêm 1 sinh viên: ");
                    xuatDSSV();
                    break;
                case 3:
                    xoaSinhVien();
                    System.out.println("Danh sách sau khi xóa 1 sinh viên: ");
                    xuatDSSV();
                    break;
            }
        } while (choice != 0);
    }
}
