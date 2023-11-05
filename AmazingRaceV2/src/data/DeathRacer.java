package data;

//CLB CỦA NHỮNG GÃ THÍCH ĐUA ĐẾN CHẾT, gom những class/object có chung hành động đua
//không care chuyện gì khác
//CLB LÀ NƠI TẬP TRUNG NHỮNG NGƯỜI CÓ CHUNG TIẾNG NÓI, HÀNH ĐỘNG, GIAO TIẾP/ INTERFACE
//CŨNG LÀ HÌNH THỨC GOM KHUÔN, GOM OBJECT PHÂN LOẠI VỀ CÁI GÌ ĐÓ, NHÓM GÌ ĐÓ LỎNG LẺO HƠN KẾ THỪA
//KHÔNG CARE ĐẶC ĐIỂM, DI TRUYỀN ĐẶC ĐIỂM, CHUNG HÀNH ĐỘNG VÀO CHƠI CHUNG
//MOTOR, DOG, ... IS A MEMBER OF, IS A DEATHRACER
//ANH EM MÌNH LÀ STUDENT, SINH RA LÀ SV
//ANH EM MÌNH CÒN LÀ CẦN THỦ, CỜ THỦ, CẦU THỦ....
// 1 OBJECT, KHUÔN HỘI NHẬP THEO 2 CÁCH: DÒNG HỌ BÀ CON, HỘI NHÓM XÃ HỘI
//HỘI BÀ CON: DI TRUYỀN VÀ KẾ THỪA
//HỘI XÃ HỘI: CÙNG NHAU CHIẾN

//CLB chỉ quan tâm hành động, trong đây chỉ chứa hành động
//CLB để anh em tự hành động theo cách của mình
//Interface/CLB để mọi người tự chơi theo cách của mình - chơi - hành động là abstract
//CHỈ NÓI NỘI QUY CLB, MỌI NGƯỜI THEO ĐÓ MÀ LÀM, TỰ MỖI NGƯỜI LÀM THEO CÁCH RIÊNG
//CHỐT HẠ: INTERFACE CHỨA HÀM ABSTRACT, không cần ghi ra từ khóa "ABSTRACT" ở cả tên của CLB và tên hàm
//VÌ CLB HÀM Ý NGẦM HIỂU LÀ CHỈ NÓ NỘI QUY ĐỂ MỌI NGƯỜI THEO
//NỘI QUY CHUNG CHUNG ĐỂ MỌI NGƯỜI THEO - IMPLEMENT - NGẦM HIỂU INTERFACE LÀ ABSTRACT
//ABSTRACT LÀ NÊU Ý TƯỞNG

//NHỮNG PHIÊN BẢN JDK SAU CHO PHÉP INTERFACE CÓ HÀM CÓ CODE NHƯNG.....

public interface DeathRacer {
    //phàm ai đã chọn nghề đua thủ, thì phải đua!
    public double runToDead();      //không cần từ abstract
    public void showHowToDead();    //gáy bằng Tổ quốc ghi công
}
