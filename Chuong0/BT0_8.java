import java.util.Vector;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class BT0_8{
    static Scanner inp = new Scanner(System.in);
    
    public static void readArr(int[] a, int n){
        System.out.print("Nhập phần tử của mảng: ");
        for(int i=0;i<n;i++){
            a[i] = inp.nextInt();
        }
    }

    public static void printArr(int[] a, int n){
        System.out.println("Các phần tử của mảng là: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
    }

    public static int sumArr(int[] a, int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += a[i];
        }
        return sum;
    }

    public static void sumEven(int[] a, int n){
        System.out.print("b) Các phần tử chẵn trong mảng: ");
        int sum = 0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                System.out.print(a[i] + " ");
                sum += a[i];
            }
        }
        System.out.println("\nTổng các phần tử chẵn trong mảng là: "+ sum);
    }

    public static void sumOdd(int[] a, int n){
        System.out.print("c) Các phần tử lẻ trong mảng: ");
        int sum = 0;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                System.out.print(a[i] + " ");
                sum += a[i];
            }
        }
        System.out.println("\nTổng các phần tử lẻ trong mảng là: "+ sum);
    }

    public static int isPrime(int n){
        if(n<2)
            return 0;
        int k = (int)Math.sqrt(n);
        for(int i=2;i<=k;i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }

    public static void sumPrime(int[] a, int n){
        int sum = 0;
        System.out.println("d) Các số nguyên tố trong mảng là: ");
        for(int i=0;i<n;i++){
            if(isPrime(a[i]) == 1){
                System.out.print(a[i] + " ");
                sum += a[i];
            }
        }
        System.out.println("\nTổng các số nguyên tố là: " + sum);
    }

    

    public static void findX(int[] a, int n){
        System.out.print("Nhập giá trị x: ");
        int x = inp.nextInt();
        for(int i=0;i<n;i++){
            if(a[i] == x){
                System.out.println("Vị trí của x: " + i);
                return;
            }
        }
        System.out.println("Không tìm thấy x trong mảng a!");
    }

    public static void main(String[] args){
        int n, choice, x, k;
        
        System.out.print("Nhập số phần tử của mảng: ");
        n = inp.nextInt();
        int[] a = new int[n+1];
        readArr(a,n);
        

        do{
            System.out.println("\nCHỌN KẾT QUẢ MUỐN XUẤT:");
            System.out.println("1. Các phần tử của mảng a và tổng của chúng.");
            System.out.println("2. Các phần tử chẵn của mảng a và tổng của chúng.");
            System.out.println("3. Các phần tử lẻ của mảng a và tổng của chúng.");
            System.out.println("4. Các phần tử là số nguyên tố của mảng a và tổng của chúng.");
            System.out.println("5. Thêm 1 phần tử mới vào mảng (Vector/ArrayList).");
            System.out.println("6. Thêm 1 phần tử mới vào vị trí k của mảng.");
            System.out.println("7. Xóa phần tử thứ k của mảng a.");
            System.out.println("8. Kiểm tra x có trong mảng a không.");
            System.out.println("0. Thoát chương trình.");

            System.out.print("\nNhập lựa chọn của bạn: ");
            choice = inp.nextInt();
            System.out.println();

            if(choice < 0 || choice > 8){
                System.out.println("Lựa chọn không hợp lệ!\n");
                continue;
            }

            if(choice == 0){
                System.out.println("Kết thúc chương trình!");
                break;
            }

            switch(choice){
                case 1:
                    printArr(a,n);
                    System.out.println("a) Tổng các phần tử trong mảng là: " + sumArr(a,n));
                    break;
                case 2: 
                    sumEven(a,n);
                    break;
                case 3:
                    sumOdd(a,n);
                    break;
                case 4:
                    sumPrime(a,n);
                    break;
                case 5: //Vector & ArrayList
                    System.out.println("\nBạn muốn dùng Vector hay ArrayList?\n1. Vector.\n2. ArrayList.");
                    System.out.print("Nhập lựa chọn: ");
                    int choice_2 = inp.nextInt();
                    if(choice_2 == 1){
                        Vector<Integer> b = new Vector<>();
                        for(int i : a)
                        {
                            b.add(i);
                        }
                        System.out.print("Nhập phần tử cần chèn: ");
                        x = inp.nextInt();
                        b.add(x);
                        System.out.println("Mảng sau khi chèn: ");
                        for(int j : b){
                            System.out.print(j + " ");
                        }
                    }
                    else{
                        ArrayList<Integer> b = new ArrayList<>();
                        for(int i=0;i<n;i++){
                            b.add(a[i]);
                        }
                        System.out.print("Nhập phần tử cần chèn: ");
                        x = inp.nextInt();
                        System.out.print("Nhập vị trí cần chèn: ");
                        k = inp.nextInt();
                        b.add(k,x);
                        System.out.println("Mảng sau khi chèn: " + b);
                    }
                    

                    break;
                case 6: //Thay đổi trên mảng
                    System.out.print("Nhập phần tử cần thêm: ");
                    x = inp.nextInt();
                    System.out.print("Nhập vị trí cần chèn (tính từ 0): ");
                    k = inp.nextInt();
                    for(int i=n;i>k;i--){
                        a[i] = a[i-1];
                    }
                    a[k] = x;
                    n++;
                    System.out.print("Mảng a sau khi chèn thêm phần tử: ");
                    printArr(a,n);
                    break;
                case 7:
                    System.out.print("Nhập vị trí của phần tử cần xóa (tính từ 0): ");
                    k = inp.nextInt();
                    for(int i=k;i<n;i++){
                        a[i] = a[i+1];
                    }
                    n--;
                    printArr(a,n);
                    
                    break;
                case 8:
                    findX(a,n);
                    break;
            }

        }while(choice != 0);
        
        
        inp.close();
    }
}
