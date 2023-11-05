import java.util.Scanner;

public class BT0_4 {
    public static void main(String[] args){
        System.out.print("Nhập số nguyên n: ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();

        if(n%2 == 0){
            System.out.println(n + " là số chẵn.");
        }
        else{
            System.out.println(n + " là số lẻ.");
        }
    }
}
