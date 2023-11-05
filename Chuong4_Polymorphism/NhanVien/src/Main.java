import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========QUẢN LÝ NHÂN VIÊN=========");
        int choice;
        DanhSachNhanVien mangNv = new DanhSachNhanVien();
        do {
            System.out.println("\nMENU THAO TÁC");
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Thêm 1 nhân viên vào danh sách");
            System.out.println("4. Xóa 1 nhân viên khỏi danh sách");
            System.out.println("5. Sửa thông tin nhân viên");
            System.out.println("6. Tìm kiếm nhân viên trong danh sách");
            System.out.println("0. Thoát chương trình!");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:
                    mangNv.nhapDSNV();
                    break;
                case 2:
                    mangNv.xuatDSNV();
                    break;
                case 3:
                    mangNv.themNhanVien();
                    break;
                case 4:
                    mangNv.xoaNhanVien();
                    break;
                case 5:
                    mangNv.suaThongTinNhanVien();
                    break;
            }
        }while(choice > 0 && choice <= 6);
    }
}