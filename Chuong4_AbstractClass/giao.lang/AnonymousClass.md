CÓ 2 LOẠI KHUÔN:

1. KHUÔN/CLASS HOÀN CHỈNH, KHÔNG CHỨA HÀM ABSTRACT, CONCRETE, CỤ THỂ/RỜI RẠC

   - Các hành động có đủ code
   - Nếu nó có Con, thì Con không cần IMPLEMENT gì cả vì Cha đã đủ code. Nếu Con thích thì @Override.

2. KHUÔN/CLASS KHÔNG HOÀN CHỈNH, CHỨA HÀM ABSTRACT, HÀM KHÔNG CODE

   - Bản thân nó không hoàn chỉnh vì chỉ có tên hàm mà không có code
   - Nó có quyền có hàm khác mà không có code
   - Về mặt lý thuyết, khi new abstract class thì khi chấm cái hàm không code, KHÔNG CÓ CODE ĐỂ CHẠY
   - new Cha abstract thì không cí code để CHẠY!
     VD: new Shape(...), new Pet(...) .run() .paint() .getArea() -> không có code lấy gì chạy?
   - KHÔNG NEW CLASS CÓ HÀM ABSTRACT VÌ KHÔNG ĐỦ CODE/KHÔNG HOÀN THIỆN ĐỂ CHẠY

   * TRỪ PHI .... NẾU VẪN NGOAN CỐ NEW ABSTRACT CLASS THÌ...

   - Nếu nó có Con, thì CON CÓ 2 PHƯƠNG ÁN (đã học):
     - VÔ SINH LUÔN (ABSTRACT, KHÔNG NEW)
     - PHẢI IMPLEMENT VIẾT HẾT CODE CHO HÀM CHA (@Override)
   - Giả bộ ta tập trung phần IMPLEMENT HÀM CHA, CHA NÓI CON LÀM
   - Con @Override hết hàm abstract của Cha, CON có quyền làm thêm dị biệt như bình thường...

* * VÙNG NHỚ CỦA CON, VÙNG NEW CỦA CON SẼ CHIẾM THẾ NÀO TRONG RAM (không care Con kế thừa Cha cụ thể hay Cha trừu tượng)?

    - VÙNG NEW CỦA CHA - SUPER(), KHÔNG QUAN TÂM CHA CỤ THỂ HAY TRỪU TƯỢNG (CHA SẼ LÀ CÁNH CHIM, ĐƯA CON BAY/EXTENDS THẬT XA)
    - VÙNG NHỚ CON BAO GỒM VÙNG NHỚ CHA, ĐỂ CON ĐƯỢC KẾ THỪA, CÓ SẴN MÀ DÙNG ĐỒ CHA

    - PHẦN MỞ RỘNG/EXTENDS, TRONG ĐÂY CHỨA:
        + DỊ BIỆT HOÀN TOÀN CỦA CON: HÀM, BIẾN/ĐẶC ĐIỂM RIÊNG CỦA CON.
        + PHẦN @OVERRIDE (CON TRÙNG TÊN HÀM VỚI CHA): KHÔNG BẮT BUỘC NẾU CHA CỤ THỂ (THÍCH THÌ LÀM) VÌ ĐẰNG NÀO CŨNG CÓ CHA ĐỦ ĐỂ XÀI.

    - PHẦN @OVERRIDE (CON TRÙNG TÊN HÀM CHA): BẮT BUỘC PHẢI CÓ NẾU CHA LÀ ABSTRACT (CHA KHÔNG HOÀN HẢO, CON PHẢI VIẾT CODE)
        --> PHẢI VIẾT CODE CHO CHA NẾU CHA LÀ ABSTRACT

* * *  TỔNG KẾT "CON CHƠI VỚI CHA TRỪU TƯỢNG":
CON = NEW CHA()/SUPER() CHA +++++++++ @OVERRIDE CHO TẤT CẢ HÀM CỦA CHA

* CÂU HỎI: LÀM SAO ĐỂ CÓ ĐƯỢC 1 OBJECT - VÙNG NEW??? TRONG OOP
  1. Ta cần 1 Khuôn/Class
  2. Gọi new + phễu để xin vùng RAM/clone vùng RAM từ Khuôn + gọi phễu đổ vật liệu vào new xong là có object, tọa độ object luôn
  3. Đặt tên cho object, biến object trỏ vùng new

  VD: NẾU TA MUỐN CÓ 1 HCN:
    1. Ta cần Khuôn Rectangle - KHUÔN ĐỦ CODE MỚI HÀNH XỬ ĐƯỢC, CHẤM ĐƯỢC CHẠY ĐƯỢC
    2. new Rectangle(???)
    3. Rectangle x = new Rectangle(???);

* LIÊN QUAN ĐẾN HÌNH HỌC: BIẾT THỪA NHỮNG HÌNH BIẾT RÕ NHÓM CON (VUÔNG, TRÒN, TAM GIÁC) VÀ THUỘC NHÓM CHA (SHAPE)
  - CÓ NHỮNG HÌNH CHỈ BIẾT NÓ LÀ HÌNH, KHÔNG BIẾT GỌI TÊN NHÓM CON, NHÓM CHI TIẾT, CHỈ BIẾT LÀ HÌNH, VẪN LÀ SHAPE MÀ, AREA() LÀM SAO?, TÍNH BẰNG CÁCH ĐO, VÌ MÀY KHÔNG LÀ DẠNG HÌNH QUEN THUỘC (NẾU QUEN THUỘC THÌ ĐÃ ĐẶT ĐƯỢC TÊN NHÓM)
  - CÓ XUẤT HIỆN ĐỐI TƯỢNG LẠC LOÀI, KHÔNG HÌNH DẠNG QUEN THUỘC, HÌNH CẮT NGẪU NHIÊN -> KHÔNG BIẾT XẾP VÀO NHÓM NÀO NGOẠI TRỪ NHÓM CHA

  * THEO quan điểm object, thì đã có object được tạo ra, có 1 hình, mà không biết Khuôn là gì, chỉ biết nó thuộc Khuôn Cha, vì là hình học
    -> TA SẼ CÓ CÁCH TẠO OBJECT VÔ ĐỊNH, KHÔNG QUEN THUỘC, KHÔNG PHÂN NHÓM CON ĐƯỢC, TA NHÌN NÓ THEO DẠNG ĐÚC TỪ KHUÔN CHA (VÌ LÚC NÀY TA GỌI NÓ LÀ "HÌNH HỌC") -> NÓ PHẢI XUẤT PHÁT TỪ KHUÔN HÌNH HỌC => NEW SHAPE() 

* * * DÙNG KỸ THUẬT "MƯỢN GIÓ BẺ MẢNG", MƯỢN SHAPE TẠO OBJECT, VÌ TA THIẾU 1 CÁI KHUÔN CON CỤ THỂ
  - NẾU CÓ KHUÔN CỤ THỂ (FULL CODE) NEW NGAY KHUÔN NÀY RA HÌNH MÌNH CẦN
  - CÓ HÌNH, NHƯNG KHÔNG RÕ, KHÔNG BIẾT TÊN KHUÔN, NHƯNG CHẮC CHẮN LÀ 1 DẠNG CON CỦA CHA, LẤY CHA NEW LUÔN CHO RỒI
    CON = NEW CHA/SUPER() CHA + EXTENDS @OVERRIDE

    HÌNH KHÔNG BIẾT -> LÀ OBJECT CON RỒI (VÌ LÀ HÌNH) --> NEW CHA + PHẦN @OVERRIDE VIẾT CODE CHO ĐỦ THÌ VẪN ĐẢM BẢO CÔNG THỨC CỦA CON...

* NEW CHA + CODE @OVERRIDE THÌ VẪN ĐẢM BẢO CÔNG THƯC 1 VÙNG RAM CON NHƯ XƯA NAY - CON ĐỦ CODE
    - TẠO OBJECT MÀ KHÔNG CẦN CLASS RIÊNG, MƯỢN CHA MÀ LÀM, CLASS RIÊNG MÀ KHÔNG CẦN ĐỀ CẬP => CLASS ẨN DANH (CLASS LÀM BIẾNG, CLASS KHÔNG THÈM LÀM CỤ THỂ RA) ==> ANONYMOUS CLASS
    -> VẪN NEW ĐƯỢC OBJECT CON CỦA SHAPE MÀ KHÔNG CẦN 1 CLASS CON CỤ THỂ, VẬY THÌ VÙNG RAM CON NÀY CHÍNH LÀ ĐẠI DIỆN CHO 1 CLASS LÀM BIẾNG LÀM RIÊNG/ĐẶT TÊN/ẨN DANH.
    ==> GỌI LÀ "TẠO OBJECT ON THE GO", LÀM BIẾNG TẠO CLASS CON CÓ SẴN!!!
        KHÔNG CHỈ ĐỊNH RÕ TÊN CLASS CON MÀ VẪN CÓ OBJECT CON

* KHAI CHA NEW CHA, NẾU CHA ABS, MƯỢN GIÓ BẺ MĂNG, CHA NEW ĐỠ CHO CON MỞ RỘNG RA ĐI CON, VIẾT CODE ON THE GO
  - ĐỪNG QUÊN CHẤM PHẨY
  - MÀY LÀM BIẾNG TẠO CLASS CON ĐỂ CLONE CHO NHANH, MÀY CHƠI TRÒ NEW TAO NGAY, TAO HỖ TRỢ VÙNG EXTENDS HOÀN THIỆN CODE OVERRIDE CHO TAO, BA SẼ LÀ CÁNH CHIM, ĐƯA CON NEW 'ON THE GO'
    --> ANONYMOUS CLASS: VÙNG RAM VẪN BỰ NHƯ LÀM CLASS RỜI, LÀM BIẾNG ĐẶT TÊN VÙNG RAM BỰ, VÙNG RAM ANONYMOUS
  