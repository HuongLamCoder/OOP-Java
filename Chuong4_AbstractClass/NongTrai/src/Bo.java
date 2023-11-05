import java.util.Random;

public class Bo extends GiaSuc {
    //Số lít sữa tối đa mà bò có thể cho
    private static final double SUA_TOI_DA = 20;

    //Constructor
    public Bo() {
        super();
    }

    public Bo(int soLuong) {
        super(soLuong);
    }

    @Override
    public void keu() {
        System.out.println("Mooo Moooo");
    }

    @Override
    public void sinhCon() {
        int soCon = new Random().nextInt(soLuong + 1);  //nextInt() trả về giá trị ngẫu nhiên từ 0 đến số lượng hiện có
        soLuong += soCon;   //cập nhật lại số lượng bò
        System.out.println("Bò sinh được " + soCon + " con!");
    }

    @Override
    public double choSua() {
        double tongSua = 0;
        for (int i = 0; i < soLuong; i++) {
            //số lít sữa mỗi con bò cho là ngẫu nhiên từ 0 đến SUA_TOI_DA
            //nextDouble() trong Random trả về giá trị ngẫu nhiên trong khoảng [0,1]
            double sua = new Random().nextDouble() * SUA_TOI_DA;
            tongSua += sua;
        }
        return tongSua;
    }
}
