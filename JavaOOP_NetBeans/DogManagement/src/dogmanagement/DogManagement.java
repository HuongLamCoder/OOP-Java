
package dogmanagement;

import data.Dog;

public class DogManagement {

    
    public static void main(String[] args) {
        
//        //  biến  value đơn   
//        int age = 20;
//        
//        //PRIMiTIVE data type
//            //tên gọi cho thứ đơn giản, primitive
//        
//        // Lấy Khuôn Dog để bắt đầu đổ info
//        // Y chang làm thẻ CCCD: lấy thông tin, in lên thẻ, đổ mực
//        // Sau khi chờ khô, ta đc object thuộc Nhóm vừa đúc
//        // Đặt tên gọi tắt cho object để dễ dàng nói chuyện, tham chiếu đến
//
//        //Tên gọi cho thứ rất rất phức tạp, object
//        //  biến        value phức tạp, object
//        Dog chiHuaHua = new Dog("CHIHUAHUA", 2023, 5.0);
//    // object data type
//    
//        // Có object thì object sẽ biết làm gì đó (Dog biết sủa)
//        chiHuaHua.bark();
//
//        Dog ngaoDa = new Dog("Ngáo Đá", 2020, 50.0);
//        ngaoDa.bark();
//        
//        System.out.println("ChiHuaHua barks again: ");
//        chiHuaHua.bark();
//        
//        //bark(); ?? đứa nào sủa vậy? --> không biết
//        //HÀNH ĐỘNG PHẢI GẮN VỚI OBJECT, THÔNG QUA DẤU CHẤM '.'
//        
//        System.out.println("After overweight: ");
//        chiHuaHua.setWeight(10);
//        chiHuaHua.bark();
//        
//        int chiYob = chiHuaHua.getYob();
//        System.out.println("ChiHuaHua YOB: " + chiYob);
//        
//        System.out.println("NgaoDa YOB: " + ngaoDa.getYob());
        
        
        Dog chiHu = new Dog("CHIHUAHUA", 2021, 0.5);
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
        
        //Tôi muốn show toàn bộ info của tôi, theo cách toString()
        //Object có nhiều hành động
        System.out.println("Show all info by using toString() - a new behaviour");
        String chiDetails = chiHu.toString();
        System.out.println("CHDetails: "+ chiDetails);
        
        System.out.println("NĐDetails: " + ngaoDa.toString());
        
        //hàm toString() rất đặc biệt, @Override
        //Mục tiêu của nó là show ra all of info đã đổ vào hoặc chỉnh sửa
        //Y chang như mở Settings trong đt xem phần info đt
        
        System.out.println("Play with toString() - GỌI THẦM TÊN EM");
        System.out.println(chiHu);  //chiHu là biến object, lưu tọa độ vùng new
                                      //về lý thuyết in ra địa chỉ, nhưng thực tế JAVA thì gọi toString()
        System.out.println(ngaoDa);//gọi thầm tên em toString()
        
        //NẾU KHUÔN KHÔNG CÓ HÀM toString() THÌ MẶC NHIÊN KHI NÓ ĐC TRIỆU GỌI TRỰC TIẾP HAY GỌI THẦM, JVM(MÁY ẢO CỦA JAVA)
        //SẼ TỰ ĐỘNG BĂM CÁI VÙNG RAM CỦA OBJECT THÀNH MỘT CON SỐ HEXA ĐẠI DIỆN CHO VALUE VÙNG RAM ĐÓ
        //Chính là HASH NUMBER, NÉN TOÀN BỘ DATA THÀNH 1 CON SỐ, MD5, SHA-256,...
        
        
        //Xem tuổi của 1 object, tương tác, hỏi đáp, giao tiếp với object qua dấu chấm
        System.out.println("Get Age");
        System.out.println("NĐ's age: " + ngaoDa.getAge());
        
        
//        int a = 100;
//        printf("a: %d\n",a); -> 100 vùng ram có primitive mấy, value mấy
//        printf("a address: %u\n",&a); //vùng ram mi ở đâu vậy? Tọa độ, địa chỉ của mi?
//        int* p = &a; //p lưu tọa độ của a, gọi là con trỏ
//        printf("p has value of %u\n",p); ->in ra địa chỉ của a

        
    }

    // New xin vùng ram mới để đủ chứa info của 1 bạn Dog sẽ được đúc/tạo ra
    // Có 2 vùng ram dành cho 2 object --> ngaoDa không đè lên name của chiHuaHua
}
