import java.lang.*;

public class Main {
    public static void main(String[] args) {
//        playWithInteger();
//        playWithIntegerPointers();
        playWithPool();
    }

    //CHỐT HẠ: KHÔNG SO SÁNH 2 BIẾN OBJECT DÙNG < > =
    //                      CHẤM VÀO BÊN TRONG ĐỂ SO SÁNH CÁC ĐẶC ĐIỂM LÕI
    //TA PHẢI VIẾT HÀM SO SÁNH 2 OBJECT() VÌ SAU NÀY CHẤM LẤY VALUE LÕI MÀ SO SÁNH

    public static void playWithPool() {
        Integer num1 = 2001;
        Integer num2 = 2001;
        //num1 = num2? -> Không
        //lõi num1 = lõi num2? -> Có
        if(num1.equals(num2)) {
            System.out.println("Hai thằng bằng nhau trong lõi!");
        }
        else {
            System.out.println("Đến cả lõi còn khác nhau!");
        }

        //VI DIỆU
        Integer num3 = -127;    //trỏ lõi -127
        Integer num4 = -127;    //trỏ cùng, không tạo new mới
        //Integer pool hồ bơi cho vùng new lõi có giá trị nằm trong đoạn [-128, 127]
        System.out.println("num3 vs. num4: " + (num3 == num4));
        //vẫn so con trỏ nhe

        //RIÊNG CHO boxing từ -128 đến +127 thì
        //gói những thằng primitive/boxing trong đoạn này thì chúng chỉ xài 1 vùng new Chung nếu chung lõi
        Integer num5 = new Integer(-129);
        //KHÔNG TẮM CHUNG HỒ BƠI VÌ NEW RÕ RÀNG TƯỜNG MINH
        System.out.println("num3 vs. num5: " + (num3 == num5));

        //NẾU TA SO SÁNH 2 BIẾN WRAPPER, Integer a Integer b
        //a == b lúc đúng lúc sai, do có xài POOL hay không
        //SO SÁNH 2 BIẾN OBJECT LÀ ĐIỀU KHÔNG NÊN, KHÔNG ĐƯỢC LÀM VÌ NÓ KHÔNG MANG Ý NGHĨA GÌ CẢ
        //KHI SO SÁNH 2 BIẾN OBJECT/MÌNH PHẢI CHẤM ĐỂ LẤY DATA BÊN TRONG MÀ MÌNH SO SÁNH
        //GỌI HÀM TRONG OBJECT

        //POOL CHỈ XẢY RA CHO WRAPPER, STRING
        //CHỈ XẢY RA HẠN CHẾ Ở MỘT SỐ TÌNH HUỐNG
        //NEW NGẦM MAY RA XẢY RA POOL KHI MÌNH CHƠI GÁN PRIMITIVE -> OBJECT
        //                                              BOXING TRỰC TIẾP
        //                                              VÀ MIỀN GIÁ TRỊ

        //SO SÁNH 2 OBJECT CHÍNH LÀ SO SÁNH 2 VALUE BÊN TRONG
        //DATA Ở ĐÂU, HÀM Ở ĐÓ
        //DO ĐÓ MỖI OBJECT SẼ NÊN CÓ HÀM SO SÁNH VỚI KẺ KHÁC TRÊN 2 CÂU HỎI: EQUALS()   COMPARETO()
        //tớ.soVoi(cau)     to.coBang(cậu không)
        Double pi = 3.14;   //boxing
    }

    public static void playWithIntegerPointers() {
        Integer num1 = new Integer("2004");
        Integer num2 = new Integer(2003);
        Integer num3 = 2003;
        //3 lệnh này tương đương value lõi
        //Hỏi: num1 có bằng num2 hay không?
        boolean result = num1 == num2;  //kết quả phép toán so sánh là true/false
        System.out.println("num1 == num2? " + result);

        //num2 và num3 thì sao?
        if(num2 == num3)
            System.out.println("num2 bằng num3 nhé!");
        else
            System.out.println("num2 không bằng num3 vì đi so sánh tọa độ 2 vùng new!");

        Integer num4 = 2004;
        if(num3 == num4)
            System.out.println("num3 bằng num4 nhé!");
        else
            System.out.println("num3 không bằng num4 vì đi so sánh tọa độ 2 vùng new!");

        //KẾT LUẬN, KHÔNG SO SÁNH 2 BIẾN OBJECT DÙNG TOÁN TỬ TRUYỀN THỐNG   < > <= >= !=
        //VÌ CÁC BIẾN OBJECT BẢN THÂN NÓ CHỈ LÀ TỌA ĐỘ THAM CHIẾU 1 VÙNG NEW CÓ NHIỀU INFO
        //MUỐN SO SÁNH 2 BIẾN OBJECT MÀ DÙNG CÁC TOÁN TỬ TRÊN THÌ ~~ SO SÁNH 2 ĐỊA CHỈ (VỚ VẨN)
        //PHẢI VÀO NEW INTEGER LẤY VALUE LÕI RA ĐỂ SO SÁNH
        //MUỐN SO SÁNH 2 OBJECT/ BIẾN OBJECT TA SẼ CHẤM ĐỂ ...
        //                                                  GỌI HÀM SO SÁNH VALUE BÊN TRONG

        //INTEGER phải có hàm so sánh cái lõi với nhau
        //hàm nằm trong Integer thì lấy value lõi
        //Ai có nhiều info, gã đó phải xử lý
        System.out.println("num3 vs. num4 (core value): " + num3.equals(num4));
        System.out.println("num3 vs. num4 (core value): " + num3.compareTo(num4));
        System.out.println("num4 vs. num3 (core value): " + num4.compareTo(num3));
    }

    public static void playWithInteger() {
        int     num0 = 2003;    //tốn 1 vùng RAM 4 bytes tên là num0, ONOFF 2003
        Integer num1 = new Integer("2004");     //2 vùng RAm, con trỏ, và new...
                                                    //lõi vùng new có int value = 2003
        Integer num2 = new Integer(2005);
        Integer num3 = 2006;    //cách viết tiện nhất, gọn nhất, tự nhiên nhất
                                //thực tế là vẫn new Integer(2003);
        //cách ta lấy con số literal (số xuất hiện trong code) chính là primitive
        //gói lại thành 1 vùng new mà nhân chính là primitive
        //cách này được gọi là ĐÓNG GÓI/ĐÓNG HỘP PRIMITIVE - BOXING A PRIMITIVE VALUE
        //BOXING: PRIMITIVE -> WRAPPER OBJECT, THỨ ĐƯỢC ĐÓNG GÓI

        //sử dụng như bình thường
        System.out.println("num0 = " + num0);   //xài trực tiếp vùng RAM
        
        System.out.println("num1 = " + num1);   //gọi thầm tên em
        System.out.println("num2 = " + num2.toString());    //mở hộp lấy value int ra xài, UNBOXING
        System.out.println("num3 = " + num3.intValue());
        
        int num4 = num1;    //HIỆN TƯỢNG MỞ HỘP, KHÔNG PHẢI ÉP KIỂU
                            //UNBOXING: OBJECT -> PRIMITIVE
                            //MỞ VÙNG NEW LẤY VALUE/NHÂN/LÕI GỐC PRIMITIVE
        System.out.println("num4 = " + num4);
        
        Integer num5 = num0;    //hiện tượng BOXING, new ngầm Integer(2003)
        System.out.println("num5 = " + num5);

        //num0 đang bằng 2003
        num0 = 20210726;
        //gán giá trị mới cho biến primitive như bình thường, ghi đè vào là xong
        System.out.println("num0 again = " + num0);

        //num5 là biến con trỏ trỏ vùng new Integer(2003)
        num5 = 20210711;    //trong RAM điều gì diễn ra?
        //biến Integer mỗi lần = value mới primitive => new Integer(value mới);

        //VÙNG INTEGER ĐƯỢC NEW KHÔNG CÓ HÀM SET() CHỈ CÓ HÀM GET()
        //MUỐN THAY ĐỔI NHÂN THÌ NEW CÁI MỚI
        //INTEGER LÀ OBJECT READ-ONLY
        //CLASS KHÔNG CÓ HÀM SỬA, CHỈ NEW XONG XÀI VALUE ĐÃ ĐỔ MÃI MÃI, ĐỔ 1 LẦN, KHÔNG SỬA GÌ CẢ
        //READ-ONLY OBJECT, ĐỌC ĐÚNG CHUẨN: IMMUTABLE CLASS/OBJECT

        //CÓ 8 WRAPPER CLASS (IMMUTABLE CLASS)
        //Byte, Short, Integer, Long, Float, Double, Boolean, Character
        //byte, short, int,     long, float, double, boolean, char
        //xài new cũng được, gán trực tiếp cũng okie (new ngầm)
    }
}