
package quanlysinhvien;

import java.util.Scanner;

public class DanhSachSinhVien {
    private int siSo;
    SinhVien[] arrsv;
    Scanner sc = new Scanner(System.in);
    
    //Constructor
    public DanhSachSinhVien(){
        arrsv = null;
        siSo = 0;
    }
    
    //Nhập danh sách sinh viên
    public void nhapDS(){
        System.out.print("Nhập sĩ số: ");
        siSo = Integer.parseInt(sc.nextLine());
        
        arrsv = new SinhVien[siSo];
        
        for(int i = 0; i < siSo; i++){
            System.out.println("Nhập sinh viên thứ #" + (i+1) + "/" + siSo);
            arrsv[i] = new SinhVien();
            arrsv[i].nhapSV();
        }
    }
    
    //Xuất danh sách sinh viên
    public void xuatDS(){
        System.out.printf("|%-10s|%-25s|%-4s|%-12s|%-25s|%-6s|\n",
                          "Mã SV", "Họ tên", "NS", "Điện thoại", "Địa chỉ", "ĐTB");
        for(int i = 0; i < siSo; i++){
            arrsv[i].xuatSV();
        }
    }
    
    //Phương thức tìm kiếm sinh viên
    public void timKiemSinhVien_1(){
        System.out.print("Nhập mã số sv cần tìm: ");
        String maSVCanTim = sc.nextLine();
        for (SinhVien sv : arrsv) {
            if (sv.getMaSV().equalsIgnoreCase(maSVCanTim)) {
                System.out.println("Sinh viên cần tìm: ");
                sv.xuatSV();
            }
        }
    }
    
    public SinhVien timKiemSinhVien_2(){
        SinhVien sv = new SinhVien();
        System.out.print("Nhập mã số sv cần tìm: ");
        String maSVCanTim = sc.nextLine();
        for(int i = 0; i < arrsv.length; i++){
            if(arrsv[i].getMaSV().equalsIgnoreCase(maSVCanTim)){
                sv = arrsv[i];
                break;
            }
        }
        return sv;
    }
    
    //Phương thức xóa 1 sinh viên khỏi danh sách
    public void xoaSinhVien(){
        System.out.print("Nhập mã số sv cần xóa: ");
        String maSVCanXoa = sc.nextLine();
        
        int viTriXoa = -1; //không tìm thấy
        
        for(int i = 0; i < arrsv.length; i++){
            if(arrsv[i].getMaSV().equalsIgnoreCase(maSVCanXoa)){
                viTriXoa = i;   //tìm được vị trí của sinh viên cần xóa
                break;
            }
        }
        
        if(viTriXoa != -1){
            SinhVien[] newArr = new SinhVien[siSo - 1];
            for(int i=0, j=0; i < siSo; i++){
                if(i != viTriXoa){
                    newArr[j] = arrsv[i];
                    j++;
                }
            }
            
            arrsv = newArr;
            siSo--;
            System.out.println("Sinh viên có mã " + maSVCanXoa + " đã được xóa khỏi danh sách!");
        }
        else {
            System.out.println("Sinh viên có mã " + maSVCanXoa + " không có trong danh sách!");
        }
    }
    
    //Phương thức thêm 1 sinh viên vào danh sách
    public void themSinhVien(){
        SinhVien svMoi = new SinhVien();
        svMoi.nhapSV();

        SinhVien[] newArr = new SinhVien[siSo + 1];
        for (int i = 0; i < siSo; i++) {
            newArr[i] = arrsv[i];
        }
        newArr[siSo] = svMoi;
        arrsv = newArr;
        siSo++;
        System.out.println("Sinh viên đã được thêm vào danh sách!");
    }
    
    
    public static void main(String[] args) {
        DanhSachSinhVien mangSV = new DanhSachSinhVien();
        mangSV.nhapDS();
        mangSV.xuatDS();
        mangSV.timKiemSinhVien_1();
        System.out.println(mangSV.timKiemSinhVien_2());
    }
}
