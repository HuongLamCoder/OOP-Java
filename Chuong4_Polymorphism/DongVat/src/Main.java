import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*DongVat dv = new Cho();
        dv.phuongThucCuaDV();

        dv = new Cho();
        dv.phuongThucCuaDV();

        Cho c = new Cho();
        c.phuongThucCuaCho();*/

        //Tạo mảng DongVat
        DongVat[] arrdv = new DongVat[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Chọn con vật cần nhập: ");
            System.out.println("1. Nhập chó");
            System.out.println("2. Nhập mèo");
            System.out.println("3. Nhập con vật chưa xác định");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    arrdv[i] = new Cho();
                    arrdv[i].nhap();
                    arrdv[i].an();
                    arrdv[i].keu();
                    break;
                case 2:
                    arrdv[i] = new Meo();
                    arrdv[i].nhap();
                    arrdv[i].an();
                    arrdv[i].keu();
                    break;
                case 3:
                    arrdv[i] = new DongVat();
                    arrdv[i].nhap();
                    arrdv[i].an();
                    arrdv[i].keu();
                    break;
            }
        }
    }
}