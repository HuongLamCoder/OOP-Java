
package baitapchuong3;


public class DiemMau extends Diem{
    private int mau;
    
    //Constructor
    public DiemMau(){
        super();
        mau = 0;
    }
    
    //Getter - Setter

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    
    //Input
    public void nhap(){
        super.nhapDiem();
        System.out.print("Nhập màu: ");
        mau = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Điểm: " + super.toString() + ", màu: " + mau;
    }
    
}
