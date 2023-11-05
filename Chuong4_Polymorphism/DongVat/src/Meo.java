public class Meo extends DongVat {
    //Constructor
    public Meo() {
        super();
    }

    public Meo(String tenDV, double chieuCao, double canNang, String tiengKeu, String thucAn, int soChan) {
        super(tenDV, chieuCao, canNang, tiengKeu, thucAn, soChan);
    }

    //Methods
    @Override
    public void an() {
        super.thucAn = "Cá";
    }

    @Override
    public void keu() {
        super.tiengKeu = "Meow meow";
    }

    public void phuongThucCuaMeo() {
        System.out.println("Phương thức của mèo");
    }
}
