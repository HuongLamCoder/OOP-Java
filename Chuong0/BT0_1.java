//Làm menu cho người dùng lựa chọn
import java.util.Scanner;


public class BT0_1{
    public static void main(String[] args){
        System.out.println("CHƯƠNG TRÌNH TÍNH TOÁN");
        Scanner inp = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Tổng");
            System.out.println("2. Hiệu");
            System.out.println("3. Tích");
            System.out.println("4. Thương");
            System.out.println("0. Thoát chương trình!");
            
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = inp.nextInt();

            if (choice == 0){
                System.out.println("Kết thúc!");
                break;
            }

            if (choice < 0 || choice > 4){
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }

            int a, b;
            System.out.print("Nhập số a: ");
            a = inp.nextInt();
            System.out.print("Nhập sô2 b: ");
            b = inp.nextInt();

            switch(choice){
                case 1:
                    int tong = a + b;
                    System.out.println("Tổng là: " + tong);
                    break;
                case 2:
                    int hieu = a - b;
                    System.out.println("Hiệu là: " + hieu);
                    break;
                case 3:
                    int tich  = a * b;
                    System.out.println("Tích là: " + tich);
                    break;
                case 4:
                    if(b != 0){
                        double thuong = a*1.0/b;
                        System.out.println("Thương là: " + thuong);
                    }
                    else{
                        System.out.println("Không thể chia một số cho 0!");
                    }
                    break;
            }
        }
        while(choice != 0);

        inp.close();
    } 
}
