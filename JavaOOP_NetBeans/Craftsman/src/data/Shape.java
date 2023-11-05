
package data;

//Hình học là Ông Tổ, class Cha mà từ đây có 1 đàn con
//đều thỏa câu IS-A MỘT CHIỀU
//TƯ DUY PHIÊN BẢN,MỘT BẢN GỐC CÓ N BIẾN THỂ

//KHI 1 CLASS CHỨA HÀM ABSTRACT, KHÔNG CODE, CHỈ NÓI MÀ KHÔNG LÀM => BẢN THÂN CLASS CŨNG PHẢI LÀ ABSTRACT
//mang ý nghĩa khái niệm, chưa hoàn hảo
//Khuôn này chỉ là bản phác thảo, concept, chưa chạy được
public abstract class Shape {
    //đặc điểm và hành vi và phễu như truyền thống
    protected String owner;
    protected String color;
    protected String borderColor;
    //các biến dưới có để ở class nào? Cha hay Con?
    //-> KHÔNG được để ở class CHA vì các CON sẽ THỪA KẾ HẾT
    /*protected double a, b, c, d, e, f, radius;*/
    //TÓM LẠI, CẠNH LÀ CỦA TỪNG ĐỨA MỚI HỢP LÝ, DỊ BIỆT: TG LÀ 3 CẠNH...
    //KHI CHA CÓ NHIỀU CON, NHIỀU DỊ BIỆT XH, DỊ BIỆT Ở CON, GOM LÊN CHA -> CẢ ĐÁM DỊ BIỆT
    //CHA: NHÂN TỬ CHUNG CỦA ĐÁM CON, ab + ac + ad + af -> a(b+c+d+f)
    
    
    //phễu và S, P

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }
    
    //Diện tích và chu vi
    //Không nên là 1 đặc điểm, KHÔNG nên là DERIVED FIELD/ BIẾN ĐƯỢC TÍNH TỪ NHỮNG BIẾN KHÁC
    //NÊN ĐƯỢC TÍNH TOÁN TỪ CÁC KÍCH THƯỚC, DO ĐÓ HỢP LÝ NHẤT NÓ PHẢI LÀ HÀM
    //HÀM TÍNH DIỆN TÍCH S,P ĐẶT Ở ĐÂU?
    
    /*OOP: ĐẶC TÍNH VÀ HÀNH VI -> MÔ TẢ MỘT OBJECT
           tính hợp lý của hành động, hành động thuộc về object mà nó có nhiều info
                            ENCAPSULATION
    */
    
    // => HÀM S, P ở CON là hợp lý, vì ở đó nó có kích thước
    //Ở CHA có được không?
    //BẮT BUỘC PHẢI Ở CHA
    //Tính tự nhiên của 1 object: một hình học thì phải có diện tích và chu vi, THỨ ĐI KÈM VỚI HÌNH HỌC TỪ XƯA
    //BÀN VỀ TÍNH HỢP LÝ CỦA ĐỊNH NGHĨA HÌNH HỌC
//    public double getArea() {
//        //phải return 1 cái value nào đó
//        //nhưng không biết return mấy vì không có value để tính
//        //đưa cạnh lên thì KHÔNG ĐC vì cạnh là DỊ BIỆT, phải ở CON
//        return 0;   //return đại 1 con số nào đó, KHÔNG hợp lý
//                    //vì nếu NEW SHAPE(...), getArea() ra 0, không có hình nào S == 0
//                    //default 50, 100 tùy, vô lý luôn, default không hợp
//                    //hình chưa biết loại gì, thì tính gì cũng vô nghĩa
//                    
//    }
//    
//    public double getPerimeter() {
//        
//    }
    //S VÀ P CHỈ LÀ Ý TƯỞNG, KHÁI NIỆM THÔI MÀ, ĐỊNH NGHĨA RA 1 THỨ MÀ OBJECT CẦN PHẢI CÓ NHƯNG CHƯA NÓI CỤ THỂ
    //TỒN TẠI MÀ LẠI VÔ HÌNH
    //DT VÀ CV là 1 khái niệm nói về độ rộng, độ dài, đường bo cạnh
    //cụ thể thế nào để hình cụ thể tính
    //TỒN TẠI ĐỂ NÓI VỀ KHÁI NIỆM, HỮU MÀ LẠI VÔ, GỌI LÀ TRỪU TƯỢNG => ABSTRACT
    //KHIẾN CHO OBJECT VẪN RÕ RÀNG Ý NGHĨA MÔ TẢ, NHƯNG NÓ LẠI ĐỦ CHUNG CHUNG, NHƯNG CHƯA CẦM NẮM RÕ ĐƯỢC
    //MANG TÍNH CHẤT MÔ TẢ LÀ CHỦ YẾU
    
    //Khi ta chỉ mô tả ý tưởng, khái niệm, ta đang nói về cái trừu tượng, nêu ra không nói chi tiết hơn
    //ABSTRACT, HÀM CHỈ MANG TÍNH CHẤT BIỂU TRƯNG, Đ/N TRỌN VẸN VỀ VIỆC MÔ TẢ CÁI GÌ ĐÓ, HÀM ABSTRACT, HÀM KHÔNG CÓ CODE
    //KHUÔN TƯƠNG ỨNG/CHỨA HÀM ABSTRACT NÓ ĐẠI DIỆN CHO 1 Đ/N, Ý TƯỞNG -> KHUÔN ABSTRACT
    //NÓ CHÍNH LÀ HÌNH THỨC GOM NHÓM, GOM CLASS, PHÂN LOẠI MỨC CAO
    
    //CLASS LÀ GOM OBJECT THÌ ABSTRACT LÀ DẠNG GOM CLASS (NHỮNG CLASS CÓ ĐIỂM TƯƠNG ĐỒNG)
    //CÀNG GOM CÀNG CHUNG Ý TƯỞNG
    
    public abstract double getArea();       //không cần phải viết code, chỉ là ý tưởng
    public abstract double getPerimeter();
    
    //bổ sung thêm paint() như là một hàm abstract vì việc vẽ mỗi hình là khá khác nhau, việc in cũng khác nhau luôn: RECT, SQR...
    //chỉ nói là cần vẽ thôi, ai vẽ thế nào thì tùy
    
    //TẠI SAO KHÔNG DÙNG IF Ở ĐÂY?
    // => KHÔNG DÙNG VÌ: KHIẾN CHO CLASS SHAPE THIẾU TÍNH LINH HOẠT, TÍNH MỞ RỘNG
    //SOLID trong OOP
    public abstract void paint();   //dị biệt cho mỗi hình
}
