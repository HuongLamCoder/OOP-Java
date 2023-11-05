import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\nLẬP TRÌNH HƯỚNG ĐỐI TƯỢNG");

        do{
            System.out.println();
            System.out.println("1 - Bài tập 1.");
            System.out.println("2 - Bài tập 2.");
            System.out.println("3 - Bài tập 3.");
            System.out.println("4 - Bài tập 4.");
            System.out.println("5 - Bài tập 5.");
            System.out.println("6 - Bài tập 6.");
            System.out.println("7 - Bài tập 7.");
            System.out.println("8 - Bài tập 8.");
            System.out.println("9 - Bài tập 9.");
            System.out.println("0 - Thoát chương trình.");

            System.out.print("\nNhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            System.out.println();
            
            if(choice == 0){
                System.out.println("Kết thúc chương trình!");
                break;
            }

            if(choice<0 || choice>9){
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }

            switch(choice){
                case 1:
                    BT0_1 bai1 = new BT0_1();
                    bai1.taoMenu();
                    break;
                case 2:
                    BT0_2 bai2 = new BT0_2();
                    bai2.taoMenu();
                    break;
                case 3:
                    BT0_3 bai3 = new BT0_3();
                    bai3.taoMenu();
                    break;
                case 4:
                    BT0_4 bai4 = new BT0_4();
                    bai4.Odd_or_Even();
                    break;
                case 5:
                    BT0_5  bai5 = new BT0_5();
                    bai5.checkN();
                    break;
                case 6:
                    BT0_6 bai6 = new BT0_6();
                    bai6.primeCheck();
                    break;
                case 7:
                    BT0_7 bai7 = new BT0_7();
                    bai7.taoMenu();
                    break;
                case 8:
                    BT0_8 bai8 = new BT0_8();
                    bai8.readArr();
                    bai8.printArr();
                    bai8.taoMenu();
                    break;
                case 9:
                    BT0_9 bai9 = new BT0_9();
                    bai9.nhapChuoi();
                    bai9.taoMenu();
                    break;
            }

        }while(choice != 0);

        sc.close();
    }
}
