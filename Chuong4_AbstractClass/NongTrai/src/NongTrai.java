import java.util.Scanner;

public class NongTrai {
    Scanner sc = new Scanner(System.in);
    //Các loại gia súc trong nông trại
    private Bo bo;
    private Cuu cuu;
    private De de;

    //Khởi tạo
    public NongTrai() {
        bo = new Bo();
        cuu = new Cuu();
        de = new De();
    }

    //Phương thức nhập số lượng ban đầu của mỗi loại gia súc
    public void nhapSoLuong() {
        System.out.print("Nhập vào số lượng đàn bò: ");
        bo.setSoLuong(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập vào số lượng đàn cừu: ");
        cuu.setSoLuong(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập vào số lượng đàn dê: ");
        de.setSoLuong(Integer.parseInt(sc.nextLine()));
    }

    //Phương thức xuất số lượng của mỗi loại gia súc
    public void xuatSoLuong() {
        System.out.println("Số lượng đàn bò là: " + bo.getSoLuong());
        System.out.println("Số lượng đàn cừu là: " + cuu.getSoLuong());
        System.out.println("Số lượng đàn dê là: " + de.getSoLuong());
    }

    //Phương thức sinh con của tất cả gia súc trong nông trại
    public void sinhCon() {
        bo.sinhCon();
        cuu.sinhCon();
        de.sinhCon();
    }

    //Phương thức cho sữa của tất cả gia súc trong nông trại
    public void choSua() {
        double suaBo = bo.choSua();
        double suaCuu = cuu.choSua();
        double suaDe = de.choSua();

        System.out.printf("Đàn bò cho %.2f lít sữa.\n", suaBo);
        System.out.printf("Đàn cuu cho %.2f lít sữa.\n", suaCuu);
        System.out.printf("Đàn dê cho %.2f lít sữa.\n", suaDe);

        double tongSua = suaBo + suaCuu + suaDe; //tổng sữa mà tất cả loại gia súc đã cho
        System.out.printf("Tổng số lít sữa mà các loại gia súc đã cho là: %.2f lít.\n", tongSua);
    }

    //Phương thức kêu của các loại gia súc
    public void keu() {
        bo.keu();
        cuu.keu();
        de.keu();
    }

    //Phương thức thống kê số lượng gia súc ở mỗi loại và tổng số lít sữa mà tất cả gia súc đã cho
    public void thongKeNongTrai() {
        System.out.println("\nSố lượng gia súc ở mỗi loại sau 1 lứa sinh và tổng số lít sữa mà tất cả gia súc đã cho:");
        xuatSoLuong();
        choSua();
    }

}