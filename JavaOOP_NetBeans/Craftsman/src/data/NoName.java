package data;

public class NoName extends Shape{
    public NoName(String owner, String color, String borderColor) {
        super(owner, color, borderColor);
    }

    @Override
    public double getArea() {
        //Hình cắt bên Word là hình duy nhất, diện tích không thể có công thức được mà là con số đo được bằng thước/tích phân
        //đảm bảo S là con số, còn tính theo công thức hay đo đạc không ảnh hưởng
        //Nếu chế tạo Khuôn -> công thức sẽ được nhân bản, nhưng hình đang là duy nhất
        //  --> Không xếp hình vào nhóm NoName
        return 50; //giả bộ cho hình bên Word
    }

    @Override
    public double getPerimeter() {
        return 40;
    }

    @Override
    public void paint() {

    }

    //NẾU TA LÀM RIÊNG 1 KHUÔN CHO 1 HÌNH CỤ THỂ KHÔNG HÌNH DẠNG
    //SAU NÀY TA NHÂN BẢN HÌNH NÀO CŨNG VÔ LÝ, CẮT NGẪU NHIÊN
    //NẾU CHỦ ĐỘNG LÀM CLASS CON THẾ NÀY, THÌ NÓ LẶP LẠI GIỐNG HV, HCN

    //KHÔNG THỂ DÙNG KHUÔN RỜI NONAME ĐANG LÀM ĐƯỢC
    //TA SẼ CHẾ NHANH THEO SHAPE, ĂN KÉ SHAPE MÀ NEW TRỰC TIẾP, TRẢ RA S, P, HARD-CODE ĐÚNG NGHĨA LÀ 1 HÌNH DUY NHẤT
    //CHẾ KHUÔN/CLASS LÀ DÀNH CHO NHÂN BẢN
}
