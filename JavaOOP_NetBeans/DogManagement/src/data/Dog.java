
package data;

public class Dog {
    // Chứa đặc điểm, chi tiết mà cái Khuôn, object tương lai sẽ có
    // Khuôn design ra sao, mia mốt object có thế
    public String name;
    private int yob;
    private double weight;

    // Có Khuôn thì phải có miệng/phễu để hứng vật liệu/data đổ vào
    // Phễu dùng để nhận vật liệu đúc ra, tạo ra, construct cái object
    //Tạo CONSTRUCTOR bằng máy ==> Right click -> Insert Code -> Constructor...
    public Dog(String name, int yob, double weight) {    
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    // Phễu còn gọi là constructor/hàm khởi tạo/hàm đúc/hàm tạo dựng ra object vì thông qua nó, vật liệu chảy vào trong Khuôn
    // Vật liệu khô ra object/bức tượng
    // CONSTRUCTOR/PHỄU LÀ HÀM CỰC KỲ ĐẶC BIỆT, VÌ NÓ DÙNG ĐỂ TẠO RA OBJECT
    // CỨ MỖI LẦN XÀI NÓ, TỨC LÀ PHẢI ĐƯA VẬT LIỆU VÀO, TỨC LÀ CÓ 1 OBJECT MỚI
    // PHỄU LÀ HÀM ĐẶC BIỆT, KHÔNG CÓ GIÁ TRỊ TRẢ VỀ, KHÔNG 'VOID', TRẢ VỀ NGUYÊN OBJECT
    // tên của phễu phải giống 100% với tên class!!!
    
    // Viết hàm xử lý data, Vd như giao tiếp hỏi năm sinh
    // Object thì gọi là hành động, behaviour, xử lý tính toán trên
    // Biến được đổ value từ lúc đúc ra
    
    // Hàm gọi n lần tương đương các hành động mà object nào đó lặp đi lặp lại
    // Hành động của object gọi n lần trên object đó
    
    //Chủ động đưa info của ta ra
    public void bark() {
        System.out.println("Gâu gâu gâu.....Tên tui là " + name);
        System.out.println("Gâu gâu gâu.....Tui sinh năm " + yob);
        System.out.println("Gâu gâu gâu.....Tui nặng " + weight + " kg");
    }
    
    //Mình đi xăm mình/nhuộm tóc
    //Thay đổi info ba má từng cho lúc ba má new/đúc ra mình
    
    //Vì mặc định info sẽ đc giấu, khi cần thiết mình mới công khai nó ra
    //Chia sẻ info khi đc hỏi, đó chính là method/hàm hành động get()
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //Một object bất kỳ luôn có nhiều info mô tả, ví dụ: xem ĐTDĐ trên TGDĐ, ghi các thông số...
    //Việc show info của object là tự nhiên
    //Đó là một hành động nên có của mỗi object, mô tả, đặc tả về object
    //Hành động này có thể do ta chủ động đưa ra, hoặc tự generate theo template có sẵn
    //Template có sẵn mà JAVA giúp mình, không cần code (Insert Code)

    
    @Override   //Khác Overload, dính đến kế thừa
    //Nhưng cả 2 đều có liên quan đến khái niệm POLYMORPHISM - tính đa hình
    public String toString() {
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        //Được quyền sửa lại thân hàm, vì chỉ cần trả về chuỗi chứa info của mình
        
        //String tmpMsg = String.format("|GâuGâu|%-10s|%4d|%4.1f|",name,yob,weight);
        //trả về chuỗi thô, không cần '\n' để xuống hàng
        
        return String.format("|GâuGâu|%-10s|%4d|%4.1f|",name,yob,weight);
    }
    
    
    //Hàm gắn với việc xử lý info của chính object. Ai giàu info, người đó nên xử lý
    public int getAge(){
        return 2023 - yob;
    }
    //Viết code kiểu này không hay (HARD-CODE), fix value, năm sau phải sửa code thì tuổi mới đúng
    //Chuẩn: lấy giờ hệ thống Windows - yob;
    
    
}

//Code bên ngoài như Khuôn bị lủng

//ENCAPSULATIOM: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM VÀ BIẾN PHẢI ĐI KÈM VỚI NHAU ĐẠI DIỆN/MÔ TẢ CHO MỘT OBJECT/MỘT THỰC THỂ (SỐNG) NÀO ĐÓ


