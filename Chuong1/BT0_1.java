//Làm menu cho người dùng lựa chọn
import java.util.Scanner;


public class BT0_1{
    Scanner sc = new Scanner(System.in);
    public int a,b;

    public void nhapso(){
        System.out.print("Nhập số a: ");
        a = sc.nextInt();
        System.out.print("Nhập số b: ");
        b = sc.nextInt();
    }

    public void taoMenu(){
        System.out.println("\nCHƯƠNG TRÌNH TÍNH TOÁN");
        int choice;
        nhapso();
        do{
            System.out.println("\nMenu:");
            System.out.println("1. Tổng");
            System.out.println("2. Hiệu");
            System.out.println("3. Tích");
            System.out.println("4. Thương");
            System.out.println("0. Quay về menu chọn bài tập.");
            
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();

            if (choice == 0){
                System.out.println("Kết thúc!");
                break;
            }

            if (choice < 0 || choice > 4){
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }

            switch(choice){
                case 1:
                    int tong = tong(a,b);
                    System.out.println("Tổng là: " + tong);
                    break;
                case 2:
                    int hieu = hieu(a,b);
                    System.out.println("Hiệu là: " + hieu);
                    break;
                case 3:
                    int tich  = tich(a,b);
                    System.out.println("Tích là: " + tich);
                    break;
                case 4:
                    thuong(a,b);
                    break;
            }
        }
        while(choice != 0);
    }

    public int tong(int a, int b){
        return a+b;
    }
    public int hieu(int a, int b){
        return a-b;
    }
    public int tich(int a, int b){
        return a*b;
    }
    public void thuong(int a, int b){
        if(b != 0){
            double thuong = a*1.0/b;
            System.out.println("Thương là: " + thuong);
        }
        else{
            System.out.println("Không thể chia một số cho 0!");
        }

    }
}
