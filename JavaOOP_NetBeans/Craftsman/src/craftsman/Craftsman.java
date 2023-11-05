
package craftsman;

import data.*;


public class Craftsman {

    public static void main(String[] args) {
        //playWithShape();
        //sortShapes();
        //playWithAnonymousClass();
        sortShapesWithAnonymous();
    }

    public static void sortShapesWithAnonymous() {
        //Anonymous here!!!
        Shape onTheGo = new Shape("THIS-TUI", "RANDOM", "RANDOM") {
            @Override
            public double getArea() {
                //cắt hình ngẫu nhiên thì diện tích phải tự đo
                return 50;
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void paint() {
                System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4s|%4s|%7.2f|%7.2f|\n",
                                    "TAKE-AWAY", owner, color, borderColor, " ", " ", getArea(), getPerimeter());
            }
        };

        Rectangle r1 = new Rectangle("TÍA", "PINK", "MEGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "PINK", "MEGENTA", 6.0, 5.0);

        Square s1 = new Square("MÁ", "PINK", "MEGENTA", 7);
        Rectangle s2 = new Square("MÁ", "PINK", "MEGENTA", 8);
        Shape s3 = new Square("MÁ", "PINK", "MEGENTA", 9);

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6.0);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 7.0);

        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);

        Shape[] box = new Shape[]{r1, r2, s1, s2, s3, d1, d2, t1, t2, onTheGo};
                                                                    //hình ngẫu nhiên thì vẫn là hình
        System.out.println("The list of shapes:");
        for (Shape x : box) {
            x.paint();
        }

        for (int i = 0; i < box.length - 1; i++) {
            for (int j = i + 1; j < box.length; j++) {
                if (box[i].getArea() > box[j].getArea()) {
                    Shape temp = box[j];
                    box[j] = box[i];
                    box[i] = temp;
                }
            }
        }

        System.out.println("The list of shapes sorting ascending by area:");
        for (Shape x : box) {
            x.paint();
        }
    }

    //Kỹ thuật tạo object mà không cần Khuôn cụ thể
    //chỉ dành cho những object vô định hình, không có công thức tính toán và nhân bản, không có Khuôn cố định
    //cắt hình ngẫu nhiên, không biết nhóm nào
    //NHƯNG VẪN CHẮC CHẮN LÀ HÌNH: CÓ NÉT, MÀU, CẠNH, BỀ MẶT
    //KHÔNG CÓ CÔNG THỨC CHUNG
    //OBJECT VÃNG LAI, KHÔNG THƯỜNG XUYÊN XUẤT HIỆN/SỬ DỤNG/LÀM/GẶP
    //DÙ LÀ HÌNH KIỂU GÌ, CÔNG THỨC CHUNG LÀ: NEW CHA/SUPER CHA + @OVERRIDE
    public static void playWithAnonymousClass() {
        //Shape vangLai = new NoName(...);    //bên trong phải full code cho Cha
        //Shape x = new HCN(...);   //bên trong có code HCN
        //Shape vangLai =
        new Shape("CHÍNH MÌNH", "GREEN", "BLUE") {
        //vừa Anonymous Object (không gán new vào biến con trỏ) vừa Anonymous Class
            @Override
            public double getArea() {
                return 50;  //vì hình cụ thể, không theo hình dạng nào cả (tự đo)
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void paint() {
                //khai báo là Con của Shape nên vẫn thừa kế được như bình thường
                System.out.printf("|NGẪU NHIÊN|%-10s|%-10s|%-10s|%4.1f|%4.1f|\n",
                                    owner, color, borderColor, getArea(), getPerimeter());
            }
        }.paint();  //có CHẤM PHẨY
        //Mày là 1 hình nên vẫn vô tư vào mảng Shape để sort
        //vẫn là Shape, kiểu Shape, có đủ code cho Cha
        //kỹ thuật "Mượn gió bẻ măng", mượn Cha tạo Con, mượn Shape new Con
        //NEW ABSTRACT CLASS SẼ BUNG RỘNG MÀN HÌNH ĐỂ GÕ CODE @OVERRIDE
        //VẪN THỎA CÔNG THỨC CON = NEW CHA + @OVERRIDE
        //CHỈ XÀI CÁCH NÀY NẾU CHỈ CẦN LÀM 1 OBJECT ON THE GO, MÀ LÀM BIẾNG LÀM KHUÔN RIÊNG LẺ, THEO CÔNG THỨC NHÂN BẢN

        //vangLai.paint();

    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MEGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "PINK", "MEGENTA", 6.0, 5.0);

        Square s1 = new Square("MÁ", "PINK", "MEGENTA", 7);
        Rectangle s2 = new Square("MÁ", "PINK", "MEGENTA", 8);
        Shape s3 = new Square("MÁ", "PINK", "MEGENTA", 9);
        //Ông Nội         Cháu, cùng họ IS A
        //((Square)s2).sayHi();
        //((Square)s3).sayHi();

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6.0);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 7.0);

        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);

        //In kết quả 9 hình
        //NẾU TA THAY 9 BIẾN NÀY THÀNH SHAPE, OKIE
        //ĐỘI HÌNH CỰC ĐẸP, CÓ 9 SHAPE, MỖI ĐỨA LÀ V, TR, HCN, TG...
        //                  n thứ khác nhau tụ chung về SHAPE
        //                  n Khuôn được chế từ 1 Khuôn tổ SHAPE
        //Đa hình:
        //Câu hỏi: paint() của ai? Ai chạy?
        r1.paint();     //Con, new Con      --> chạy RECT (con của Shape)
        r2.paint();     //Cha, new Con      --> chạy Con - RECT (qua mặt Shape)
        s1.paint();     //Cháu, new Cháu    --> chạy SQR
        s2.paint();     //Cha, new Con      --> chạy Con - SQR (qua mặt RECT)
        s3.paint();     //Ông, new Cháu     --> chạy Cháu - SQR (qua mặt Shape)
        d1.paint();     //Con, new Con      --> chạy Disk
        d2.paint();     //Cha, new Con      --> chạy Disk (qua mặt Shape)
        t1.paint();
        t2.paint();

        //Sắp xếp tăng dần theo diện tích
//        Shape[] box = new Shape[9]; //mảng là khai báo nhiều biến
//        //box[0] là một biến Shape, box[1] là một biến Shape, biến [i] cần lắm luôn [i] trỏ vùng new
//        //box[0] = new Rectangle() new Square() new Disk()...
//        box[0] = new Rectangle("TÍA", "PINK", "MEGENTA", 5.0, 6.0);
//        box[1] = new Disk("", "", "", "", 3.0);
//        box[2] = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);
//        box[3] = r1;    //2 chàng 1 nàng
//        box[4] = r1;
//        box[5] = box[0];

        //Shape box[] = new Shape[] {new Rectangle(...), new Disk(...), , , , , , , };

        Shape box[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, t1, t2};
        System.out.println("The list of shapes:");
        for (Shape x : box) {
            x.paint();
        }
        //CHỈ CÒN 1 HÀM PAINT() CỦA SHAPE, NHƯNG KHI CHẠY THÌ ĐÁM CON QUA MẶT, HƯỞNG ỨNG THEO CÁCH CỦA NÓ
        //ĐẠI CA SHAPE GỌI ĐÁM ĐÀN EM (V, TR, HCN, TG) CỨ THẾ LÀM THEO CÁCH CỦA CHÚNG
        //TỪ 1 HÀM PAINT() CHỈ CÓ CÁI TÊN, MÀ TA CÓ ĐẾN N CÁI CÀI ĐẶT VIẾT CODE
        //                 LÚC CHẠY THÌ CÓ N CÁCH OVERRIDE QUA MẶT KHÁC NHAU
        //TỪ 1 CÓ NHIỀU CÁCH, TA GỌI LÀ TỪ 1 ÁNH XẠ RA NHIỀU
        //TỪ 1 ABSTRACT CÓ NHIỀU CÁCH IMPLEMENT, THỰC THI (CHẠY)
        //TỪ 1 BIẾN THIÊN, BIẾN HÓA, THIÊN BIẾN VẠN HÓA, ĐA ÁNH XẠ RA NHIỀU
        //KỸ THUẬT DÙNG 1 TÊN HÀM, SAU ĐÓ CÓ N CÁCH THỂ HIỆN
        //CHỈ GỌI 1 HÀM, N CÁCH HƯỞNG ỨNG, KỸ THUẬT NÀY GỌI LÀ TÍNH ĐA HÌNH (POLYMORPHISM)

        //if(box[i] > box[j]) swap(); //sai vì không thể so sánh 2 biến con trỏ
        for (int i = 0; i < box.length - 1; i++) {
            for (int j = i + 1; j < box.length; j++) {
                if (box[i].getArea() > box[j].getArea()) {
                    Shape temp = box[j];
                    box[j] = box[i];
                    box[i] = temp;
                    //getArea() là đa hình
                    //Cha không có code, tùy con là gì, qua mặt Cha theo công thức riêng
                }
            }
        }

        System.out.println("The list of shapes after sorted:");
        for (Shape x : box) {
            x.paint();
        }
    }

    public static void playWithShape() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MEGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "PINK", "MEGENTA", 6.0, 5.0);
        //Ép kiểu ((Rectangle)r2).

        Disk d1 = new Disk("MÁ", "PINK", "MEGENTA", "HIHIHI", 6.0);
        Shape d2 = new Disk("MÁ", "PINK", "MEGENTA", "HIHIHI", 7.0);

        r1.paint();     //gọi ai? --> GỌI CON, CHẠY CON -> RECTANGLE
        r2.paint();     //gọi ai? --> GỌI CHA, CHẠY CON -> RECTANGLE (QUA MẶT CHA)
        d1.paint();     //gọi ai? --> GỌI CON, CHẠY CON -> DISK
        d2.paint();     //gọi ai? --> GỌI CHA, CHẠY CON -> DISK (QUA MẶT CHA)
        //chấp Cha không có code, Con qua mặt giùm
        //Cha cứ nói để Con làm giùm

        //PAINT() CHÍNH LÀ HIỆN TƯỢNG     ĐA HÌNH       XUẤT HIỆN
        //                            (POLYMORPHISM)
        //BIẾN THỂ CỦA CÙNG 1 HÀM PAINT()

        /*
            Nếu cố tình new Cha thì sao? (Dính đến ANONYMOUS, DO CHA KHÔNG HOÀN HẢO)
            --> Không nên new, nhưng........
        */
    }

}
