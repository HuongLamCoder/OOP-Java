public class Main {
    public static void main(String[] args) {
        playWithStrings();
    }

    public static void playWithStrings() {
        //...
        //...
        //...
        //...
        //Có 4 dòng chữ, 4 object
        //Mô tả: rất nhiều chữ cái, độ dài dòng chữ: ???
        //       gồm các ký tự nhân loại đang dùng
        // -> thuộc 1 nhóm String, class String xuất hiện

        String s1 = new String("HELLO");
        String s2 = new String("HELLO");    //~~new Integer(2003); không khuyến khích

        String s3 = "HELLO";    //new ngầm
        String s4 = "HELLO";    //new ngầm ~~ Integer x = 2003;
        //POOL HỒ BƠI TẮM CHUNG, s4 trỏ cùng new s3, 2 chàng 1 nàng
        //POOL PHÂN BIỆT HOA THƯỜNG
        //VẤN ĐỀ BIẾN NÀO NEW TRƯỚC POOL THÌ BIẾN SAU NẾU MUỐN XÀI CHUNG DỮ LIỆU ĐÓ THÌ CHO XÀI KÉ
        //CỨ GÁN "HELLO" mày không được new, xài chung với tao, tắm chung, trỏ cùng

        String s5 = "Hello";
        String s6 = "hello";

        //s1 == s2?
        if(s1 == s2)    //2 tọa độ new khác nhau
            System.out.println("s1 == s2!");
        else
            System.out.println("s1 != s2!");
        //s3 == s4?
        System.out.println("s3 vs s4? " + (s3 == s4));
        //s2 == s3?
        System.out.println("s2 vs. s3? " + (s2 == s3));
        //s4 == s5?
        System.out.println("s4 vs. s5? " + (s4 == s5));

        //KHÔNG SO SÁNH 2 OBJECT QUA ==  MÀ PHẢI CHẤM VÀO BÊN TRONG LẤY VALUE ĐI SO
        //CÁC OBJECT NÊN LÀM SẴN HÀM SO SÁNH BÊN TRONG CHÚNG ĐỂ ĐI SO SÁNH VỚI ĐỨA KHÁC
        //SO SÁNH OBJECT PHẢI CHẤM
        //2 LOẠI CÂU HỎI: equals() và compareTo()
    }
}