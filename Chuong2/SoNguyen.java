package Chuong2;

import java.util.Scanner;

public class SoNguyen {
    Scanner sc = new Scanner(System.in);
    private int soNguyen;

    //Khởi tạo không có tham số truyền vào
    public SoNguyen(){
        this.soNguyen = 0;
    }

    //Khởi tạo có tham số truyền vào
    public SoNguyen(int soNguyen){
        this.soNguyen = soNguyen;
    }

    //Phương thức set
    public void setSoNguyen(int soNguyen){
        this.soNguyen = soNguyen;
    }

    //Phương thức get
    public int getSoNguyen(){
        return this.soNguyen;
    }

    //Phương thức nhập số nguyên
    public void nhapSoNguyen(){
        System.out.print("Nhập số nguyên: ");
        soNguyen = sc.nextInt();
    }

    //Phương thức kiểm tra số nguyên tố
    public boolean isPrime(int soNguyen){
        if (soNguyen < 2) return false;
        int k = (int)Math.sqrt(soNguyen);
        for(int i=2;i<=k;i++){
            if(soNguyen % i == 0)
                return false;
        }
        return true;
    }

    //Phương thức kiểm tra số chính phương
    public boolean isSquare(int soNguyen){
        int canBacHai = (int)Math.sqrt(soNguyen);
        return canBacHai * canBacHai == soNguyen;
    }

    //Phương thức kiểm tra số hoàn hảo
    public boolean isPerfect(int soNguyen){
        if(soNguyen <= 1)
            return false;
        int tongUocSo = 0;
        for(int i=1;i<soNguyen;i++){
            if(soNguyen % i == 0){
                tongUocSo += i;
            }
        }
        return tongUocSo == soNguyen;
    }

    //Phương thức in các số nguyên tố <= soNguyen
    public void Prime(){
        System.out.println("\nCác số nguyên tố <= " + soNguyen);
        for(int i = 1; i <= soNguyen; i++){
            if(isPrime(i)==true){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Phương thức in các số chính phương <= soNguyen
    public void Square(){
        System.out.println("\nCác số chính phương <= " + soNguyen);
        for(int i = 1; i <= soNguyen; i++){
            if(isSquare(i)==true){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Phương thức in các số hoàn hảo <= soNguyen
    public void Perfect(){
        System.out.println("\nCác số hoàn hảo <= " + soNguyen);
        for(int i = 1; i <= soNguyen; i++){
            if(isPerfect(i) == true){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Phương thức kiểm tra số chẵn
    public boolean isEven(){
        return soNguyen % 2 == 0;
    }

    //Phương thức kiểm tra số lẻ
    public boolean isOdd(){
        return soNguyen % 2 != 0;
    }

    //Tạo menu
    public void menu(){
        int choice;
        do{
            System.out.println();
            System.out.println("1 - Là số nguyên tố?");
            System.out.println("2 - Là số chính phương?");
            System.out.println("3 - Là số hoàn hảo?");
            System.out.println("4 - Là số chẵn?");
            System.out.println("5 - Là số lẻ?");
            System.out.println("6 - In các số nguyên tố <= " + soNguyen);
            System.out.println("7 - In các số chính phương <= " + soNguyen);
            System.out.println("8 - In các số hoàn hảo <= " + soNguyen);
            System.out.println("0 - Trở về.");

            System.out.print("\nNhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            System.out.println();
            
            if(choice == 0){
                System.out.println("Menu chọn bài:");
                break;
            }

            if(choice<0 || choice>8){
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }

            switch(choice){
                case 1:
                    if(isPrime(soNguyen) == true)
                        System.out.println(soNguyen + " là số nguyên tố!");
                    else
                        System.out.println(soNguyen + " không phải số nguyên tố!");
                    break;
                case 2:
                    if(isSquare(soNguyen) == true)
                        System.out.println(soNguyen + " là số chính phương!");
                    else
                        System.out.println(soNguyen + " không phải số chính phương!");
                    break;
                case 3:
                    if(isPerfect(soNguyen) == true)
                        System.out.println(soNguyen + " là số hoàn hảo!");
                    else
                        System.out.println(soNguyen + " không phải số hoàn hảo!");
                    break;
                case 4:
                    if(isEven() == true)
                        System.out.println(soNguyen + " là số chẵn!");
                    else
                        System.out.println(soNguyen + " không phải số chẵn!");
                    break;
                case 5:
                    if(isOdd() == true)
                        System.out.println(soNguyen + " là số lẻ!");
                    else
                        System.out.println(soNguyen + " không phải số lẻ!");
                    break;
                case 6:
                    Prime();
                    break;
                case 7:
                    Square();
                    break;
                case 8:
                    Perfect();
                    break;
            }
        }while(choice != 0);
    }
}
