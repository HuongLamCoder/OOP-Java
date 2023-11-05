public class Cho extends DongVat {
    //Constructor
    public Cho() {

    }

    public Cho(String tenDV, double chieuCao, double canNang, String tiengKeu, String thucAn, int soChan) {
    }

    //Methods
    @Override
    public void an() {
        super.setThucAn("Xương");
    }

    @Override
    public void keu() {
        super.setTiengKeu("Gâu gâu");
    }

    public void phuongThucCuaCho() {
        System.out.println("Phương thức của chó");
    }
}
