import java.util.Scanner;

public class BT0_4 {
    Scanner inp = new Scanner(System.in);
    public int n;
    public void Odd_or_Even(){
        System.out.print("Nhập số nguyên n: ");
        n = inp.nextInt();

        if(n%2 == 0){
            System.out.println(n + " là số chẵn.");
        }
        else{
            System.out.println(n + " là số lẻ.");
        }
    }
}
