public abstract class GiaSuc {
    protected int soLuong;  //số lượng gia súc

    //Constructor
    public GiaSuc() {
        soLuong = 0;
    }

    public GiaSuc(int soLuong) {
        this.soLuong = soLuong;
    }

    //Getter - Setter

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    //Phương thức kêu
    public abstract void keu();

    //Phương thức sinh con
    public abstract void sinhCon();

    //Phương thức cho sữa
    public abstract double choSua();
}
