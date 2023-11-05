import java.util.Random;

public class Cuu extends GiaSuc {
    //Số lít sữa tối đa của cừu
    private static final double SUA_TOI_DA = 5;

    //Constructor
    public Cuu() {
        super();
    }

    public Cuu(int soLuong) {
        super(soLuong);
    }

    //Phương thức kêu
    @Override
    public void keu() {
        System.out.println("Bee bee");
    }

    //Phương thức sinh con
    @Override
    public void sinhCon() {
        int soCon = new Random().nextInt(soLuong + 1);
        soLuong += soCon;
        System.out.println("Cừu sinh được " + soCon + " con!");
    }

    //Phương thức cho sữa
    @Override
    public double choSua() {
        double tongSua = 0;
        for (int i = 0; i < soLuong; i++) {
            double sua = new Random().nextDouble() * SUA_TOI_DA;
            tongSua += sua;
        }
        return tongSua;
    }
}
