import java.util.Scanner;

public class BT0_5 {
    Scanner inp = new Scanner(System.in);
    public int n;

    public void nhapN(){
        System.out.print("Nhập N: ");
        n = inp.nextInt();
    }

    public void checkN(){

        nhapN();

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
    }
}
