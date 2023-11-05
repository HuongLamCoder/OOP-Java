import java.util.Scanner;
import java.util.Arrays;

//Thêm, sửa, xóa, tìm kiếm
public class DSSV {
    private int n;
    SinhVien[] arrsv;
    Scanner sc = new Scanner(System.in);
    
    public DSSV(){
        arrsv = null;
        n=0;
    }

    public void nhapDSSV(){
        System.out.print("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        arrsv = new SinhVien[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin SV thứ " + (i+1));
            SinhVien a = new SinhVien();
            a.nhapSV();
            arrsv[i] = a;
        }
    }

    public void xuatDSSV(){
        System.out.println("Danh sách sinh viên vừa nhập: ");
        System.out.printf("%-12s%-20s%-12s%-25s%-15s%-12s\n", "Mã SV","Họ và tên","Ngày sinh","Địa chỉ","SĐT","Trường");
        for(SinhVien i : arrsv){    //cho biến i có kiểu dữ liệu SinhVien duyệt qua từng phần tử của mảng arrsv
            i.xuatSV();
            
        }
    }

    public static void main(String[] args){
        DSSV mangsv = new DSSV();
        mangsv.nhapDSSV();
        mangsv.xuatDSSV();
    }
}
