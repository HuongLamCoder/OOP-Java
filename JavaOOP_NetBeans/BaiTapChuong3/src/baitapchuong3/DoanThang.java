
package baitapchuong3;

import java.util.Scanner;

public class DoanThang {
    private Diem diem1;
    private Diem diem2;
    
    //Constructor
    public DoanThang(){
        diem1 = new Diem();
        diem2 = new Diem();
    }
    
    public DoanThang(Diem diem1, Diem diem2){
        this.diem1 = diem1;
        this.diem2 = diem2;
    }
    
    //Getter - Setter

    public Diem getDiem1() {
        return diem1;
    }

    public void setDiem1(Diem diem1) {
        this.diem1 = diem1;
    }

    public Diem getDiem2() {
        return diem2;
    }

    public void setDiem2(Diem diem2) {
        this.diem2 = diem2;
    }
    
    
    //Input
    public void nhapDoanThang(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập tọa độ điểm 1:");
        System.out.print("Nhập x1: ");
        double x1 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập y1: ");
        double y1 = Double.parseDouble(sc.nextLine());
        diem1 = new Diem(x1,y1);
        
        System.out.println("Nhập tọa độ điểm 2:");
        System.out.print("Nhập x2: ");
        double x2 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập y2: ");
        double y2 = Double.parseDouble(sc.nextLine());
        diem2 = new Diem(x2,y2);
    }
    
    //Tính khoảng cách giữa 2 điểm
    public double khoangCach(){
        double x1 = diem1.getX();
        double y1 = diem1.getY();
        
        double x2 = diem2.getX();
        double y2 = diem2.getY();
        
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    
    //Print
    public void xuat(){
        System.out.println("Thông tin đoạn thẳng: ");
        System.out.println("Điểm 1: " + diem1);
        System.out.println("Điểm 2: " + diem2);
        System.out.printf("Khoảng cách giữa 2 điểm: %.2f\n", khoangCach());
    }
}
