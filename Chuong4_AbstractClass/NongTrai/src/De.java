import java.util.Random;

public class De extends GiaSuc {
    //Số lít sữa tối đa mà dê cho được
    private static final double SUA_TOI_DA = 10;

    public De() {
        super();
    }

    public De(int soLuong) {
        super(soLuong);
    }

    @Override
    public void keu() {
        System.out.println("Mee mee");
    }

    @Override
    public void sinhCon() {
        int soCon = new Random().nextInt(soLuong + 1);
        soLuong += soCon;
        System.out.println("Dê sinh được " + soCon + " con!");
    }

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
