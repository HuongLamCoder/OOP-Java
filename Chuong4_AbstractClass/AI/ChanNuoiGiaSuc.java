// Tạo một lớp cha abstract để biểu diễn các gia súc chung
public abstract class GiaSuc {
    // Khai báo các thuộc tính chung của các gia súc
    private String ten; // Tên của gia súc
    private int soLuong; // Số lượng của gia súc
    private double soLitSua; // Số lit sữa mà gia súc cho

    // Khai báo các phương thức getter và setter cho các thuộc tính
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getSoLitSua() {
        return soLitSua;
    }

    public void setSoLitSua(double soLitSua) {
        this.soLitSua = soLitSua;
    }

    // Khai báo một constructor có tham số để khởi tạo đối tượng gia súc
    public GiaSuc(String ten, int soLuong) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.soLitSua = 0; // Ban đầu số lit sữa bằng 0
    }

    // Khai báo các phương thức abstract để biểu diễn các hành vi riêng của từng
    // loại gia súc
    public abstract void keu(); // Phương thức để gia súc kêu khi đói

    public abstract void sinhCon(); // Phương thức để gia súc sinh con

    public abstract void choSua(); // Phương thức để gia súc cho sữa

}

// Tạo một lớp con kế thừa từ lớp GiaSuc để biểu diễn loại bò
public class Bo extends GiaSuc {

    // Khai báo một constructor có tham số để khởi tạo đối tượng bò
    public Bo(int soLuong) {
        super("Bò", soLuong); // Gọi constructor của lớp cha với tên là "Bò" và số lượng là tham số truyền vào
    }

    // Định nghĩa lại các phương thức abstract của lớp cha theo đặc điểm của loại bò
    @Override
    public void keu() {
        System.out.println("Bò kêu: Ò ò ò...");
    }

    @Override
    public void sinhCon() {
        int soCon = (int) (Math.random() * 3) + 1; // Số con sinh ra là ngẫu nhiên từ 1 đến 3
        System.out.println("Bò sinh được " + soCon + " con");
        setSoLuong(getSoLuong() + soCon); // Cập nhật lại số lượng bò sau khi sinh con
    }

    @Override
    public void choSua() {
        double soLit = Math.random() * 20; // Số lit sữa cho là ngẫu nhiên từ 0 đến 20
        System.out.println("Bò cho được " + soLit + " lít sữa");
        setSoLitSua(getSoLitSua() + soLit); // Cập nhật lại số lit sữa của bò sau khi cho sữa
    }

}

// Tạo một lớp con kế thừa từ lớp GiaSuc để biểu diễn loại cừu
public class Cuu extends GiaSuc {

    // Khai báo một constructor có tham số để khởi tạo đối tượng cừu
    public Cuu(int soLuong) {
        super("Cừu", soLuong); // Gọi constructor của lớp cha với tên là "Cừu" và số lượng là tham số truyền
                               // vào
    }

    // Định nghĩa lại các phương thức abstract của lớp cha theo đặc điểm của loại
    // cừu
    @Override
    public void keu() {
        System.out.println("Cừu kêu: Bé bé...");
    }

    @Override
    public void sinhCon() {
        int soCon = (int) (Math.random() * 4) + 1; // Số con sinh ra là ngẫu nhiên từ 1 đến 4
        System.out.println("Cừu sinh được " + soCon + " con");
        setSoLuong(getSoLuong() + soCon); // Cập nhật lại số lượng cừu sau khi sinh con
    }

    @Override
    public void choSua() {
        double soLit = Math.random() * 5; // Số lit sữa cho là ngẫu nhiên từ 0 đến 5
        System.out.println("Cừu cho được " + soLit + " lít sữa");
        setSoLitSua(getSoLitSua() + soLit); // Cập nhật lại số lit sữa của cừu sau khi cho sữa
    }

}

// Tạo một lớp con kế thừa từ lớp GiaSuc để biểu diễn loại dê
public class De extends GiaSuc {

    // Khai báo một constructor có tham số để khởi tạo đối tượng dê
    public De(int soLuong) {
        super("Dê", soLuong); // Gọi constructor của lớp cha với tên là "Dê" và số lượng là tham số truyền vào
    }

    // Định nghĩa lại các phương thức abstract của lớp cha theo đặc điểm của loại dê
    @Override
    public void keu() {
        System.out.println("Dê kêu: Mê mê...");
    }

    @Override
    public void sinhCon() {
        int soCon = (int) (Math.random() * 3) + 1; // Số con sinh ra là ngẫu nhiên từ 1 đến 3
        System.out.println("Dê sinh được " + soCon + " con");
        setSoLuong(getSoLuong() + soCon); // Cập nhật lại số lượng dê sau khi sinh con
    }

    @Override
    public void choSua() {
        double soLit = Math.random() * 10; // Số lit sữa cho là ngẫu nhiên từ 0 đến 10
        System.out.println("Dê cho được " + soLit + " lít sữa");
        setSoLitSua(getSoLitSua() + soLit); // Cập nhật lại số lit sữa của dê sau khi cho sữa
    }

}

// Tạo một lớp chứa hàm main để chạy chương trình và kiểm tra kết quả
public class NongTrai {

    public static void main(String[] args) {
        // Khởi tạo các đối tượng gia súc với số lượng ban đầu nhập từ bàn phím hoặc cố định
        Bo bo = new Bo(10); // Có 10 con bò ban đầu
        // Tạo một lớp cha abstract để biểu diễn các gia súc chung
public abstract class GiaSuc {
    // Khai báo các thuộc tính chung của các gia súc
    private String ten; // Tên của gia súc
    private int soLuong; // Số lượng của gia súc
    private double soLitSua; // Số lit sữa mà gia súc cho

    // Khai báo các phương thức getter và setter cho các thuộc tính
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getSoLitSua() {
        return soLitSua;
    }

    public void setSoLitSua(double soLitSua) {
        this.soLitSua = soLitSua;
    }

    // Khai báo một constructor có tham số để khởi tạo đối tượng gia súc
    public GiaSuc(String ten, int soLuong) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.soLitSua = 0; // Ban đầu số lit sữa bằng 0
    }

    // Khai báo các phương thức abstract để biểu diễn các hành vi riêng của từng loại gia súc
    public abstract void keu(); // Phương thức để gia súc kêu khi đói
    public abstract void sinhCon(); // Phương thức để gia súc sinh con
    public abstract void choSua(); // Phương thức để gia súc cho sữa

}

// Tạo một lớp con kế thừa từ lớp GiaSuc để biểu diễn loại bò
public class Bo extends GiaSuc {

    // Khai báo một constructor có tham số để khởi tạo đối tượng bò
    public Bo(int soLuong) {
        super("Bò", soLuong); // Gọi constructor của lớp cha với tên là "Bò" và số lượng là tham số truyền vào
    }

    // Định nghĩa lại các phương thức abstract của lớp cha theo đặc điểm của loại bò
    @Override
    public void keu() {
        System.out.println("Bò kêu: Ò ò ò...");
    }

    @Override
    public void sinhCon() {
        int soCon = (int) (Math.random() * 3) + 1; // Số con sinh ra là ngẫu nhiên từ 1 đến 3
        System.out.println("Bò sinh được " + soCon + " con");
        setSoLuong(getSoLuong() + soCon); // Cập nhật lại số lượng bò sau khi sinh con
    }

    @Override
    public void choSua() {
        double soLit = Math.random() * 20; // Số lit sữa cho là ngẫu nhiên từ 0 đến 20
        System.out.println("Bò cho được " + soLit + " lít sữa");
        setSoLitSua(getSoLitSua() + soLit); // Cập nhật lại số lit sữa của bò sau khi cho sữa
    }

}

// Tạo một lớp con kế thừa từ lớp GiaSuc để biểu diễn loại cừu
public class Cuu extends GiaSuc {

    // Khai báo một constructor có tham số để khởi tạo đối tượng cừu
    public Cuu(int soLuong) {
        super("Cừu", soLuong); // Gọi constructor của lớp cha với tên là "Cừu" và số lượng là tham số truyền vào
    }

    // Định nghĩa lại các phương thức abstract của lớp cha theo đặc điểm của loại cừu
    @Override
    public void keu() {
        System.out.println("Cừu kêu: Bé bé...");
    }

    @Override
    public void sinhCon() {
        int soCon = (int) (Math.random() * 4) + 1; // Số con sinh ra là ngẫu nhiên từ 1 đến 4
        System.out.println("Cừu sinh được " + soCon + " con");
        setSoLuong(getSoLuong() + soCon); // Cập nhật lại số lượng cừu sau khi sinh con
    }

    @Override
    public void choSua() {
        double soLit = Math.random() * 5; // Số lit sữa cho là ngẫu nhiên từ 0 đến 5
        System.out.println("Cừu cho được " + soLit + " lít sữa");
        setSoLitSua(getSoLitSua() + soLit); // Cập nhật lại số lit sữa của cừu sau khi cho sữa
    }

}

// Tạo một lớp con kế thừa từ lớp GiaSuc để biểu diễn loại dê
public class De extends GiaSuc {

    // Khai báo một constructor có tham số để khởi tạo đối tượng dê
    public De(int soLuong) {
        super("Dê", soLuong); // Gọi constructor của lớp cha với tên là "Dê" và số lượng là tham số truyền vào
    }

    // Định nghĩa lại các phương thức abstract của lớp cha theo đặc điểm của loại dê
    @Override
    public void keu() {
        System.out.println("Dê kêu: Mê mê...");
    }

    @Override
    public void sinhCon() {
        int soCon = (int) (Math.random() * 3) + 1; // Số con sinh ra là ngẫu nhiên từ 1 đến 3
        System.out.println("Dê sinh được " + soCon + " con");
        setSoLuong(getSoLuong() + soCon); // Cập nhật lại số lượng dê sau khi sinh con
    }

    @Override
    public void choSua() {
        double soLit = Math.random() * 10; // Số lit sữa cho là ngẫu nhiên từ 0 đến 10
        System.out.println("Dê cho được " + soLit + " lít sữa");
        setSoLitSua(getSoLitSua() + soLit); // Cập nhật lại số lit sữa của dê sau khi cho sữa
    }

}

// Tạo một lớp chứa hàm main để chạy chương trình và kiểm tra kết quả
public class ChanNuoiGiaSuc {

    public static void main(String[] args) {
        // Khởi tạo các đối tượng gia súc với số lượng ban đầu nhập từ bàn phím hoặc cố định
        Bo bo = new Bo(10); // Có 10 con bò ban đầu
        Cuu cuu = new Cuu(20); // Có 20 con cừu ban đầu
        De de = new De(15); // Có 15 con dê ban đầu
        
        // Tạo một mảng để lưu trữ các đối tượng gia súc
        GiaSuc[] giaSuc = new GiaSuc[3];
        giaSuc[0] = bo;
        giaSuc[1] = cuu;
        giaSuc[2] = de;
        
        // Mô phỏng một hôm người chủ nông trại đi vắng, tất cả gia súc đều đói
        System.out.println("Một hôm người chủ nông trại đi vắng, tất cả gia súc trong nông trại đều đói.");
        for (int i = 0; i < giaSuc.length; i++) {
            giaSuc[i].keu(); // Gọi phương thức kêu của từng loại gia súc
        }
        
        // Mô phỏng một lứa sinh và một lượt cho sữa của tất cả gia súc
        System.out.println("Sau một thời gian chăn nuôi, tất cả gia súc trong nông trại đều sinh con và cho sữa.");
        for (int i = 0; i < giaSuc.length; i++) {
            giaSuc[i].sinhCon(); // Gọi phương thức sinh con của từng loại gia súc
            giaSuc[i].choSua(); // Gọi phương thức cho sữa của từng loại gia súc
        }
        
        // Thống kê số lượng và số lit sữa của tất cả gia súc trong nông trại
        System.out.println("Người chủ nông trại muốn thống kê xem trong nông trại có bao nhiêu gia súc ở mỗi loại, tổng số lit sữa mà tất cả các gia súc của ông đã cho.");
        int tongSoLuong = 0; // Biến để lưu tổng số lượng của tất cả gia súc
        double tongSoLitSua = 0; // Biến để lưu tổng số lit sữa của tất cả gia súc
        for (int i = 0; i < giaSuc.length; i++) {
            System.out.println("Số lượng " + giaSuc[i].getTen() + " là: " + giaSuc[i].getSoLuong()); // In ra số lượng của từng loại gia súc
            System.out.println("Số lit sữa của " + giaSuc[i].getTen() + " là: " + giaSuc[i].getSoLitSua()); // In ra số lit sữa của từng loại gia súc
            tongSoLuong += giaSuc[i].getSoLuong(); // Cộng dồn số lượng vào biến tổng
            tongSoLitSua += giaSuc[i].getSoLitSua(); // Cộng dồn số lit sữa vào biến tổng
        }
        System.out.println("Tổng số lượng của tất cả các gia súc là: " + tongSoLuong); // In ra tổng số lượng của tất cả các gia súc
        System.out.println("Tổng số lit sữa của tất cả các gia súc là: " + tongSoLitSua); // In ra tổng số lit sữa của tất cả các gia súc
    }
}
