# Collections Framework

LƯU TRỮ CHƠI/XỬ LÝ VỚI NHIỀU DATA/OBJECT THÌ TA CẦN ĐI MUA CÁI TÚI, GIỎ, BALO, THÙNG, PHÒNG ĐỂ ĐỰNG NHIỀU ĐỒ.

MUA CÁI TỦ, XÂY CÁI PHÒNG VỀ BẢN CHẤT LÀ PHẢI NEW CÁI TỦ(), NEW CĂN PHÒNG().

PHẢI CÓ 1 THÙNG CHỨA THẬT ĐƯỢC TẠO RA ĐỂ TA BỎ ĐỒ VÀO, DO ĐÓ PHẢI NEW THÙNG-CHỨA LÀ ĐÚNG RỒI!

QUAN ĐIỂM LẬP TRÌNH: NEW ĐỂ CÓ VÙNG RAM LƯU TRỮ INFO + HÀM XỬ LÝ INFO THEO ENCAPSULATION.

Object trong RAM chính là tương đương món đồ thật ngoài đời.

Mình trừu tượng hóa món đồ thật thành object trong lập trình thì cần new để có vùng RAM có data + hành động.

MUA TỦ ĐỰNG ĐỒ TA CẦN NEW TỦ() CÓ KHÔNG GIAN ĐỰNG ĐỒ VÀ CÁC HÀNH ĐỘNG TƯƠNG ỨNG.

```Java
TU tuCuaTui = new TU(); //trong RAM sẽ có 1 vùng không gian để đựng đồ
                        //Ngoài đời Tủ chiếm 1 góc phòng để ta đựng đồ
//Cái tủ cho mình làm gì thì mình làm đó
//Nguyên tắc ENCAPSULATION/ABSTRACTION
//Đóng gói hành động đi kèm object
```

```Java
tuCuaTui.addDoVao(món đồ đưa vào trong tủ); //tủ cho phép mình bỏ đồ vô
//y chang lò nướng cho mình bỏ đồ ăn vào, để nướng

LoNuong loCuaTui = new LoNuong();   //mua lò về, chiếm góc bếp
loCuaTui.addDoNuong(con-gà để nướng);
```

**TỦ LÀ OBJECT CHỨA NHIỀU ĐỒ ĐẠC KHÁC:**
1. Mua tủ
2. Mua đồ add vào tủ

```Java
tuCuaTui.addMonDo(mua món đồ bỏ vào túi - new món đồ());
```
-----------------------------------------------------------------------------

## CÓ 2 LOẠI TỦ:
**1. TỦ LOẠI 1:** ***FIX CỨNG SỐ ĐỒ ĐỂ VÔ, CHỈ ĐỂ BỎ VÔ 1 SỐ GIỚI HẠN MÓN ĐỒ*** 
- CHÍNH LÀ MẢNG [SỐ ĐỒ ĐỂ VÔ]
- MẢNG LÀ KHAI BÁO NHIỀU BIẾN NHIỀU CHỖ CHỨA [FIX SỐ CHỖ]
- CHỨA TOA ĐỘ VÙNG NEW MÓN ĐỒ
  [I] = NEW MÓN-ĐỒ(), CỨ THOẢI MÁI NẰM ĐÂU ĐÓ, TA LƯU TỌA ĐỘ

  ```Java
  Student arr[] = new Student[100];
  //sẽ có 100 chỗ ngồi cho sv, nhưng chưa có bạn nào cụ thể
  //arr chính là biến má mì, tên gọi tắt cho 1 cái tủ có 100 chỗ

  //tên mảng chính là tên gọi cho 1 cái tủ FIX số chỗ vì nó trỏ đến new [số chỗ]
  
  //bỏ đồ vào mảng thì không cần dùng hàm, hành động của tủ, sờ TRỰC TIẾP CHỖ ĐỂ

  arr[0] = new Student();   //món đồ bỏ vô, new món đồ bỏ vô
  //~~ tuCuaTui.addMonDo(new món đồ)
  //tuCuaTui vị trí 0 được cất món đồ, new món đồ

  //món đồ new nằm trong HEAP, nằm bên ngoài tủ, tủ chỉ lưu danh sách tham chiếu
  //tủ chứa ds bệnh nhân, còn bệnh nhân vẫn nằm trong phòng điều trị
  ```

* DÙ TỦ LOẠI 1 HAY 2 THÌ ĐỀU CHỨA NHIỀU ĐỒ: ĐỒ ĐỂ THẬT SỰ VÀO TỦ HAY CHỈ GIỮ DANH SÁCH THAM CHIẾU ĐỀU OKIE!
    - Tủ hồ sơ giữ danh sách tham chiếu
    - Google Meet giữ danh sách tham chiếu

    - Tủ chứa đồ thật luôn - Mảng **PRIMITIVE VALUE** lấy xài luôn

**2. TỦ LOẠI 2:** ***CO GIÃN SỐ ĐỒ ĐỂ VÔ, THOẢI MÁI ĐỂ ĐỒ VÔ, CẦN THÊM THÌ CÓ THÊM CHỖ, KHÔNG CẦN XIN, CỨ ĐỂ VÔ LÀ CÓ THÊM CHỖ***
* Có 3 loại tủ:
    - ArrayList, Vector
    - HashSet, TreeSet
    - HashMap, TreeMap
* Đặc điểm:
    - Ban đầu không có chỗ nào cả
    - Cứ thêm vào là có thêm chỗ
    - Không sờ [i] vào vị trí chỗ
    - Xin qua dây kéo, khóa, ngăn, cánh cửa, mở ra nhét đồ vô

    ```Java
    tuCuaTui[i] = món đồ bỏ vô; -> mảng
    tuCuaTui.add(món đồ bỏ vô) //bỏ đồ vô qua hành động của tủ, không sờ trực tiếp ngăn chứa [i]
    ```

    -  VẪN CODE NHƯ XƯA NAY: NEW TỦ, . GỌI HÀM HÀNH ĐỘNG CỦA TỦ ĐỒ NEW RIÊNG ĐỂ MUA TỦ VÀ MUA ĐỒ, CẤT ĐỒ

    - NEW 3 LOẠI TỦ NÀY
    - ADDĐỒ(MÓN ĐỒ KHÁC ĐI MUA) VÀO TỦ Ở NGĂN THỨ [I] NÀO ĐÓ NHÌN THEO KIỂU MẢNG

    - ĐỀU CHỨA THAM CHIẾU, LINH HOẠT TRONG VIỆC ĐỂ CÁC MÓN ĐỒ

- Tủ thật túi thật mua về xài, NEW ĐƯỢC, KHÔNG PHẢI ABSTRACT, HOÀN HẢO ĐỂ ĐÙNG, FULL CODE HÀNH ĐỘNG

Con: &ensp; ArrayList, Vector   &ensp;  | &ensp;  HashSet, TreeSet  &ensp;  |  &ensp; HashMap, TreeMap

Phân loại cao hơn cho cái tủ, giỏ cụ thể:
```txt
Cha                     LIST                        |              Set                  |               Map
abs, intf             danh sách                                  tập hợp                        bộ ánh xạ, từ này ra kia
                                                                                                 KEY, MÓN ĐỒ - VALUE
                vào thứ tự nào ra                           HashSet lộn xộn thứ tự
                thứ tự nấy.                                 TreeSet sắp xếp tự động
                mảng nâng cao                               Không được lặp lại món đồ
                co giãn kích thước                          lần thứ 2
                vào trước, ngồi [0]
                vào sau, ngồi [1]

ngoài đời
                thống kê số vé bán                          đếm số người thực sự xem
                số lượt người mua                           không đếm lượt
                1 người có thể đến nhiều                    mỗi người xuất hiện 1 lần,
                lần                                         dù xem 2 3 lần

```
```txt
CÁC TỦ LIST(ARRAYLIST, VECTOR,...)
       SET (HASHSET, TREESET)                   ĐỀU CHỨA BÊN TRONG, CO DÃN NGĂN TỦ, THÍCH THÊM THÌ THÊM
       MAP (HASHMAP, TREEMAP)                   CHỈ LƯU THAM CHIẾU, LƯU CON TRỎ, ADD CON TRỎ VÀO, VÙNG NEW MÓN ĐỒ THOẢI MÁI Ở HEAP
                                                ADD VÀ LẤY QUA HÀNH ĐỘNG MỞ DÂY KÉO, NGĂN

                                                MẢNG OBJECT Y CHANG VẬY LUÔN
                                                CHỨA THAM CHIẾU, LƯU CON TRỎ ADD LẤY QUA [I]
                                                VÙNG NEW MÓN ĐỒ THOẢI MÁI TRONG HEAP
```




