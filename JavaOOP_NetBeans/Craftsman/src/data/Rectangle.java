
package data;
    //1. IS-A extends

    //2. Đặc điểm: nếu Con hoàn toàn nhờ Cha, khỏi làm gì, nếu có dị biệt, cứ làm

    //3. Phễu: giữ bản sắc, thỏa hiệp, độ thứ tự biến, độ thứ tự lệnh (cẩn thận)

    //4. Nếu CON có CHA là ABSTRACTm thì CON CHỈ ĐƯỢC LỰA CHỌN 1 TRONG 2 THỨ SAU:
    //   (Con có Cha đầy đủ code, Con xài lại hết cũng được, không cần làm gì, thích thì làm thêm biến dị và @Override)
        //4.1 Con phải là ABSTRACT luôn, nếu làm biếng hoàn tất lời nói của Cha
        //    Cha: chỉ nói vậy (hàm abstract), Con làm đi
        //                                     Con lười không làm, Con chứa hàm abstract kế thừa từ Cha
        //                                     vậy class chứa hàm abstract/hàm chưa hoàn hảo, Con cũng sẽ không hoàn hảo -> CON PHẢI ABSTRACT
        //    Rectangle giả bộ abstract thì hàm getArea() chưa code, vậy không thể new Rectangle() -> sản phẩm không hoàn hảo, không đủ code lấy gì mà chạy?
        //    Cả Cha và Con không hoàn hảo, bản concept, chưa thể dùng được -> DÒNG HỌ VÔ SINH (không đẻ ra được object)

        //4.2: Con phải viết tiếp giấc mơ của Cha (Cha nói con làm), Con triển khai
        //     Đủ cạnh -> dư sức tính diện tích, chu vi,...
        //     Con viết hết code cho Cha luôn (không viết hết thì Con vô sinh, không new object)
        //     Viết hết code hàm Cha -> @Override
        //     Con thực thi theo lời Cha dặn, IMPLEMENT ABSTRACT METHODS, VIẾT CODE CHO HÀM Ý TƯỞNG
        //                                    IMPLEMENT THE BODY OF PARENT'S ABSTRACT METHODS

public class Rectangle extends Shape {
    protected double a, b;    //width,length

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);   //1st statement
                                            //Ba sẽ là cánh chim, đưa Con vùng extends
        this.a = a;     //extends
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|%7.2f|\n",
                                owner, color, borderColor, a, b, getArea(), getPerimeter());
    }


}
