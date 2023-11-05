
package baitapchuong3;

import java.util.Scanner;

public class DongVat {
    private String ten;
    protected int namSinh;
    
    //Constructor
    public DongVat() {
        ten = null;
        namSinh = 0;
    }
    
    public DongVat(String ten, int namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }
    
    //Getter - Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    //Input
    public void nhapDV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        namSinh = Integer.parseInt(sc.nextLine());
    }
}
