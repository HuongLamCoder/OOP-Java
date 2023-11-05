import java.util.Scanner;

public class BT0_3 {
    Scanner sc = new Scanner(System.in);
    public double r;

    public void nhapBk(){
        System.out.print("Nhập bán kính: "); 
        r = sc.nextDouble();
    }

    public void taoMenu(){
        System.out.println("CHƯƠNG TRÌNH TÍNH CHU VI & DIỆN TÍCH HÌNH TRÒN!");
        int choice;
        nhapBk();
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
                    double cv = chuvi(r);
                    System.out.println("Chu vi: " + cv);
                    break;
                case 2:
                    double dt = dientich(r);
                    System.out.println("Diện tích: " + dt);
                    break;
            }
        }
        while(choice != 0);
    }

    public double chuvi(double r){
        return r*2*3.14;
    }
    public double dientich(double r){
        return r*r*3.14;
    }
}
