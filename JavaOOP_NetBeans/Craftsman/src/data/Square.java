
package data;

//Hình vuông sẽ kế thừa ai?
//Kế thừa SHAPE có được không? -> Được nhưng cần làm tiếp: extends, đặc tính - edge, phễu - thỏa hiệp
//                                                            PHẢI VIẾT CODE CHO 3 HÀM ABSTRACT CHA
//Kế thừa RECTANGLE -> Được, cần phải làm: extends, đặc điểm Square trọn vẹn, không biến dị thì không làm gì cả,
//                                         có thì khai báo bình thường, nhưng chắc chắn không khai báo lại cạnh
//                                         làm phiễu tiếp
//                                         DONE!!! (vì Rectangle đã làm hết rồi, Square chỉ cần thừa kế lại
//                                         Nếu không hoàn hảo/abstract thì bạn phải code tiếp
//                                         Nếu muốn độ thì chỉ cần paint() là đủ, không cần S() và P(), HCN đã lo giùm

//owner lấy từ Rectangle, mà Rect lấy từ Shape -> Shape là Cha của Cha của Square
//Shape là Ông Nội, cây gia phả được hình thành

public class Square extends Rectangle{
    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }

    //không thích in kiểu của Cha là RECTANGLE, tự mở lối đi riêng
    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%4.1f|%7.2f|%7.2f|\n",
                owner, color, borderColor, a, getArea(), getPerimeter());
    }

    //dị biệt hoàn toàn từ Cha và Ông Nội
    public void sayHi() {
        System.out.println("Hello, I'm Nephew!");
    }
}
