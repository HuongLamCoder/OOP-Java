import java.util.Scanner;

public class BT0_5 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = inp.nextInt();

        if(n<0){
            System.out.println("N là số âm!");
        }
        else{
            if(n>0){
                System.out.println("N là số dương!");
            }
            else{
                System.out.println("N là số 0!");
            }
        }

        inp.close();
    }
}
