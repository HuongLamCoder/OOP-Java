import java.util.Scanner;

public class BT0_2 {
    public static void main(String[] args)
    {
        double cd,cr,cv,dt;
        Scanner inp = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH TÍNH CHU VI & DIỆN TÍCH HCN!");
        System.out.print("Nhập chiều dài: "); cd = inp.nextDouble();
        System.out.print("Nhập chiều rộng: "); cr = inp.nextDouble();

        cv = (cd + cr)*2;
        dt = cd * cr;

        System.out.println("Chu vi HCN: "+cv);
        System.out.println("Diện tích HCN: "+dt);
        inp.close();
    }
}
