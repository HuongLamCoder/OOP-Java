import java.util.Scanner;
import java.text.DecimalFormat;

public class BT0_3 {
    public static void main(String[] args){
        System.out.print("Nhập bán kính hình tròn: ");
        Scanner inp = new Scanner(System.in);
        double r = inp.nextDouble();
        inp.close();

        double cv = r*2*3.14;
        double dt = r*r*3.14;

        //Tạo đối tượng DecimalFormat mẫu 0.00 để làm tròn 2 chữ số thập phân
        DecimalFormat df = new DecimalFormat("0.00");
        String cvDF = df.format(cv);
        String dtDF = df.format(dt);


        System.out.println("Chu vi hình tròn: " +cvDF);
        System.out.println("Diện tích hình tròn: " +dtDF);
        
    }
}
