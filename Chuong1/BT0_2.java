import java.util.Scanner;

public class BT0_2 {
    Scanner sc = new Scanner(System.in);
    public double cd,cr;

    public void nhap(){
        System.out.print("Nhập chiều dài: "); cd = sc.nextDouble();
        System.out.print("Nhập chiều rộng: "); cr = sc.nextDouble();
    }

    public void taoMenu(){
        System.out.println("CHƯƠNG TRÌNH TÍNH CHU VI & DIỆN TÍCH HCN!");
        int choice;
        nhap();
        do{
            System.out.println("\nMenu:");
            System.out.println("1. Tính chu vi");
            System.out.println("2. Tính diện tích");
            System.out.println("0. Quay về menu chọn bài tập.");
            
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();

            if (choice == 0){
                System.out.println("Kết thúc!");
                break;
            }

            if (choice < 0 || choice > 2){
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }

            switch(choice){
                case 1:
                    double cv = chuvi(cd, cr);
                    System.out.println("Chu vi: " + cv);
                    break;
                case 2:
                    double dt = dientich(cd, cr);
                    System.out.println("Diện tích: " + dt);
                    break;
            }
        }
        while(choice != 0);
    }

    public double chuvi(double cd, double cr){
        return (cd+cr)*2;
    }
    public double dientich(double cd, double cr){
        return cd*cr;
    }
}

