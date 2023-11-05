import java.util.Scanner;
import java.lang.Math;

public class BT0_7 {
    Scanner inp = new Scanner(System.in);
    public int N;

    public void nhapN(){
        System.out.print("Nhập N: ");
        N = inp.nextInt();
    }

    public void taoMenu(){
        int choice;
        nhapN();

        do{
            System.out.println("\nCHỌN KẾT QUẢ MUỐN XUẤT:");
            System.out.println("1. Các số tự nhiên <= N và tổng của chúng.");
            System.out.println("2. Các số tự nhiên chẵn <= N và tổng của chúng.");
            System.out.println("3. Các số tự nhiên lẻ <= N và tổng của chúng.");
            System.out.println("4. Các số tự nhiên là số nguyên tố <= N và tổng của chúng.");
            System.out.println("5. N số tự nhiên đầu tiên.");
            System.out.println("0. Quay về menu chọn bài tập.");

            System.out.print("\nNhập lựa chọn của bạn: ");
            choice = inp.nextInt();
            System.out.println();
            
            if(choice == 0){
                System.out.println("Kết thúc chương trình!");
                break;
            }

            if(choice < 0 || choice > 5){
                System.out.println("Lựa chọn không hợp lệ!\n");
                continue;
            }

            switch (choice){
                case 1:
                    cauA(N);
                    break;
                case 2:
                    cauB(N);
                    break;
                case 3:
                    cauC(N);
                    break;
                case 4:
                    cauD(N);
                    break;
                case 5:
                    cauE(N);
                    break;
            }
            
        }while(choice != 0);

    }

    public void cauA(int N){
        int sum = 0;
        for(int i=0;i<=N;i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nTổng các số <= N: " + sum);
    }

    public void cauB(int N){
        int sum = 0;
        for(int i=0;i<=N;i++){
            if(i%2==0){
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nTổng các số chẵn <= N: " + sum);
    }

    public void cauC(int N){
        int sum = 0;
        for(int i=0;i<=N;i++){
            if(i%2!=0){
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nTổng các số lẻ <= N: " + sum);
    }

    public int isPrime(int N){
        if(N<2) return 0;
        int k = (int) Math.sqrt(N);
        for(int i=2;i<=k;i++){
            if(N%i==0)
                return 0;
        }
        return 1;
    }

    public void cauD(int N){
        int sum = 0;
        for(int i=0;i<=N;i++){
            if(isPrime(i)==1){
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nTổng các số nguyên tố <= N: " + sum);
    }

    public void cauE(int N){
        int count = 1;
        int i = 2;
        System.out.println("N số nguyên tố đầu tiên: ");
        while(count <= N){
            if(isPrime(i)==1){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println();
    }
}
