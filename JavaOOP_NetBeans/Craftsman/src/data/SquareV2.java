
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

public class SquareV2 extends Shape{
    //quá dị biệt -> phải khai báo biến cạnh, không owner, color, borderColor vì Cha đã lo rồi
    private double edge;

    public SquareV2(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return edge * edge;
    }

    @Override
    public double getPerimeter() {
        return edge * 4;
    }

    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%4.1f|%-3s|%7.2f|%7.2f|\n",
                owner, color, borderColor, edge, " - ", getArea(), getPerimeter());
    }
}
