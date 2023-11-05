package Chuong2;

import java.util.Scanner;

public class main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG - CHƯƠNG 2");

        do{
            System.out.println();
            System.out.println("1 - Điểm tọa độ.");
            System.out.println("2 - Hình chữ nhật.");
            System.out.println("3 - Hình tròn.");
            System.out.println("4 - Số nguyên.");
            System.out.println("5 - Chuỗi.");
            System.out.println("6 - Danh sách sinh viên.");
            System.out.println("0 - Thoát chương trình.");

            System.out.print("\nNhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            System.out.println();
            
            if(choice == 0){
                System.out.println("Kết thúc chương trình!");
                break;
            }

            if(choice<0 || choice>6){
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }

            switch(choice){
                case 1:
                    DIEM diem = new DIEM();
                    diem.nhapDiem();
                    diem.xuatDiem();
                    diem.diChuyen();
                    System.out.print("Điểm sau khi di chuyển: ");
                    diem.xuatDiem();
                    break;
                case 2:
                    HINHCHUNHAT hcn = new HINHCHUNHAT();
                    hcn.nhapHCN();
                    hcn.xuatHCN();
                    hcn.menu();
                    break;
                case 3:
                    HINHTRON htron = new HINHTRON();
                    htron.nhapBk();
                    htron.xuatBk();
                    htron.menu();
                    break;
                case 4:
                    SoNguyen integer = new SoNguyen();
                    integer.nhapSoNguyen();
                    integer.menu();
                    break;
                case 5:
                    MyString string = new MyString();
                    string.nhapChuoi();
                    string.menu();
                    break;
                case 6:
                    DanhSachSinhVien dssv = new DanhSachSinhVien();
                    dssv.nhapDSSV();
                    dssv.xuatDSSV();
                    dssv.menu();
                    break;
            }

        }while(choice != 0);

        sc.close();
    }
}
