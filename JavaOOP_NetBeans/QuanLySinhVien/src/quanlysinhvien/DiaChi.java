
package quanlysinhvien;

import java.util.Scanner;

public class DiaChi {
    private String soNha;
    private String tenDuong;
    private String quan;
    private String thanhPho;
    
    //Constructor
    public DiaChi(){
        soNha = null;
        tenDuong = null;
        quan = null;
        thanhPho = null;
    }    

    public DiaChi(String soNha, String tenDuong, String quan, String thanhPho) {
        this.soNha = soNha;
        this.tenDuong = tenDuong;
        this.quan = quan;
        this.thanhPho = thanhPho;
    }
    
    //Getter - Setter
    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }
    
    public void nhapDC(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nhà: ");
        soNha = sc.nextLine();
        System.out.print("Nhập tên đường: ");
        tenDuong = sc.nextLine();
        System.out.print("Nhập quận: ");
        quan = sc.nextLine();
        System.out.print("Nhập thành phố: ");
        thanhPho = sc.nextLine();
    }
    

    @Override
    public String toString() {
        return soNha + " " + tenDuong + ", quận " + quan + ", " + thanhPho;
    }
    
    
}
