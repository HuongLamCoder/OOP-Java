import java.util.Scanner;

public class BT0_9 {
    static Scanner inp = new Scanner(System.in);

    public static void StrLength(String s){
        System.out.println("Độ dài của s là: " + s.length());
    }

    public static void trimStr(String s){
        s = s.trim().replaceAll("\\s+", " ");
        System.out.println("Chuỗi sau khi xóa bỏ các khoảng trắng thừa: " + s);
    }

    public static void wordCount(String s){
        String[] words = s.split("\\s+");
        int count = words.length;
        System.out.println("Số từ của chuỗi s là: " + count);
        for(String word : words){
            System.out.println(word);
        }
    }

    public static void leftStr(String s){
        int k;
        do{
            System.out.print("Nhập số kí tự bên trái cần in: ");
            k = inp.nextInt();
        }while(k>0 & k>s.length());
        String left = s.substring(0, k);
        System.out.println(k + " kí tự bên trái của chuỗi s là: " + left);
    }

    public static void rightStr(String s){
        int k;
        do{
            System.out.print("Nhập số kí tự bên phải cần in: ");
            k = inp.nextInt();
        }while(k>0 & k>s.length());
        String right = s.substring(s.length()-k);
        System.out.println(k + " kí tự bên phải của chuỗi s là: " + right);
    }

    public static void nChar(String s){
        int n,k;
        System.out.print("Nhập số kí tự cần in: ");
        n = inp.nextInt();
        System.out.print("Nhập số vị trí k: ");
        k = inp.nextInt();
        
        String newString = s.substring(k,n+k);
        System.out.println(n + " kí tự của chuỗi s kể từ vị trí " + k + ": " + newString);
    }


    public static void main(String[] args){
        String s;
        int choice;
        System.out.print("Nhập chuỗi s (không dấu): ");
        s = inp.nextLine();

        do{
            System.out.println("\nCHỌN THAO TÁC VỚI CHUỖI:");
            System.out.println("1. Độ dài của chuỗi s.");
            System.out.println("2. Xóa bỏ khoảng trắng thừa của s.");
            System.out.println("3. Đếm số từ của s và xuất mỗi từ nằm trên 1 dòng.");
            System.out.println("4. Xuất k kí tự bên trái của s.");
            System.out.println("5. Xuất k kí tự bên phải của s.");
            System.out.println("6. Xuất n kí tự của s kể từ vị trí k.");
            System.out.println("0. Thoát chương trình.");

            System.out.print("\nNhập lựa chọn của bạn: ");
            choice = inp.nextInt();
            System.out.println();
            
            if(choice == 0){
                System.out.println("Kết thúc chương trình!");
                break;
            }

            if(choice < 0 || choice > 6){
                System.out.println("Lựa chọn không hợp lệ!\n");
                continue;
            }

            switch(choice){
                case 1:
                    StrLength(s);
                    break;
                case 2:
                    trimStr(s);
                    break;
                case 3:
                    wordCount(s);
                    break;
                case 4:
                    leftStr(s);
                    break;
                case 5:
                    rightStr(s);
                    break;
                case 6:
                    nChar(s);
                    break;                
            }

        }while(choice != 0);
        
        inp.close();
    }

    
}
