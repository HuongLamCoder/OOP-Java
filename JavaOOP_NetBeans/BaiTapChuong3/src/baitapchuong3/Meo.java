
package baitapchuong3;

import java.time.LocalDate;
import java.util.Scanner;

public class Meo extends DongVat{
    private String giongMeo;    //giống mèo
    private String mauLong;     //màu lông
    private String xuatXu;      //xuất xứ
    
    //Constructor
    public Meo(){
        giongMeo = null;
        mauLong = null;
        xuatXu = null;
    }

    public Meo(String giongMeo, String mauLong, String xuatXu, String ten, int namSinh) {
        super(ten, namSinh);
        this.giongMeo = giongMeo;
        this.mauLong = mauLong;
        this.xuatXu = xuatXu;
    }
    
    //Getter - Setter
    public String getGiongMeo() {
        return giongMeo;
    }

    public void setGiongMeo(String giongMeo) {
        this.giongMeo = giongMeo;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
    
    //Input
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        super.nhapDV();
        System.out.print("Nhập giống mèo: ");
        giongMeo = sc.nextLine();
        System.out.print("Nhập màu lông: ");
        mauLong = sc.nextLine();
        System.out.print("Nhập xuất xứ: ");
        xuatXu = sc.nextLine();
    }
    
    public int getTuoi(){
        int namHienTai = LocalDate.now().getYear();
        return namHienTai - namSinh;
    }
    
    //Xuất thông tin
    public void xuatThongTin(){
        System.out.printf("|%-15s|%-4d|%-10s|%-5s|%-10s|Tuổi: %3d|\n",
                            super.getTen(), super.getNamSinh(), giongMeo, mauLong, xuatXu, getTuoi());
    }
}
