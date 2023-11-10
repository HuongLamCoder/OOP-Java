import data.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
//    public static void main(String[] args) {
//        //playWithArrayList();
//        //sortArrayListManually();
//        //playWithSet();
////        Student xxx = getAStudent("3122570017");
////        if(xxx != null)     //không trỏ null tức là trỏ vùng tìm thấy
////            xxx.showProfile();
////        else
////            System.out.println("NOT FOUND!");
//        //sortStudentList();
////        List<Student> result = initData();
//        System.out.println("The student list:");
////        for (Student x : result) {
////            x.showProfile();
////        }
//        for (Student x : initData()) {
//            x.showProfile();
//        }
//    }

    public static void main(String[] args) {
        List<Student> arr = initData();
        //gọi hàm search với 4 bạn SV đã có trong arr, mà thực ra do hàm initData() đã tạo
        Student xxx = searchStudent(arr, "3122570036");
        if(xxx == null) {
            System.out.println("NOT FOUND!!!!");
        }
        else {
            //LỠ TÌM THẤY THÌ UPDATE CÁI ĐIỂM SỐ
            xxx.showProfile();      //xxx đang trỏ vùng new bạn HÀ 9.0
            xxx.setGpa(10.0);
        }

        //RA HẲN NGOÀI IF KIỂM TRA ĐIỂM CÓ 10.0 HAY CHƯA?
        System.out.println("Checking student list after updating info of 3122570036 student:");
        for (Student student : arr) {
            student.showProfile();
        }
    }

    //--------------------------
    //LÀM TỬ TẾ HÀM SEARCH VÀ SORT, VÀ UPDATE
    //--------------------------

    public static List<Student> initData() {
        //hàm trả về 1 cái túi có sẵn bên trong 1 nhóm SV
        //trả về tọa độ 1 cái túi, vẫn new Túi mà, trong Túi chứa thẻ bài sv là 1 chuyện khác nữa
        List<Student> arr = new ArrayList();
        Student huong = new Student("3122560030", "NGUYỄN PHẠM QUỲNH HƯƠNG", 2004, 8.0);

        arr.add(new Student("3122570036", "TRẦN THỊ HÀ", 2004, 9.0));
        arr.add(huong);
        arr.add(new Student("3122570066", "TRẦN NGUYỄN ANH THƯ", 2004, 7.5));
        arr.add(new Student("3122560063", "TRẦN NGUYỄN MINH QUAN", 2004, 5.5));

        return arr;     //initData() = arr;     ~~arr ơi, mày đang trỏ new Bự nào?
                        //cho tên hàm tao trỏ với
    }

    //Tìm kiếm 1 hồ sơ SV dựa theo mã số. Có thể nhận vào danh sách luôn cũng được
    //arr là 1 cái túi đã new đâu đó rồi, tên biến là con trỏ
    //trong túi này có 1 nhóm SV sẵn rồi
    public static Student searchStudent(List<Student> arr, String id) {
        if(arr.isEmpty())   //Túi không có thẻ bài, tức là size() trả về 0
            return null;    //không sv nào được tìm thấy, trả về tọa độ đáy RAM
        //CPU chạy xuống đây, Túi có thẻ bài rồi, ds có người điền tên rồi
        //for hỏi từng thẻ một, [i] có id là gì? Coi có bằng id cần tìm không?
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getId().equalsIgnoreCase(id)){
                return arr.get(i);  //return thẻ bài thứ i có trỏ vùng id tìm thấy
            }
        }
        //đi hết for mà không return được thì chắc chắn là không thấy --> NULL
        return null;
    }


    //                                có thể đưa Giỏ từ ngoài vào
    public static void sortStudentList() {
        List<Student> arr = new ArrayList();
        Student huong = new Student("3122560030", "NGUYỄN PHẠM QUỲNH HƯƠNG", 2004, 8.0);

        arr.add(new Student("3122570036", "TRẦN THỊ HÀ", 2004, 9.0));
        arr.add(huong);
        //arr.add(huong); //danh sách thống kê bị trùng, 2 thẻ bài, 2 con trỏ
        arr.add(new Student("3122570066", "TRẦN NGUYỄN ANH THƯ", 2004, 7.5));
        arr.add(new Student("3122560063", "TRẦN NGUYỄN MINH QUAN", 2004, 5.5));

        System.out.println("The student list:");
        for (Student x : arr) {
            x.showProfile();
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }   //set() là thay đổi info con trỏ, trỏ chỗ khác
                    //lấy thẻ bài ra khắc lại thông tin
            }
        }

        System.out.println("The student list after sorting ascending by GPA:");
        for (Student x : arr) {
            x.showProfile();
        }
    }


    //THỬ NGHIỆM HÀM TRẢ VỀ 1 OBJECT (THỰC CHẤT LÀ TRẢ VỀ TỌA ĐỘ VÙNG NEW) - XEM LẠI BÀI INSIDE-OUT
    //đưa vào mã số SV muốn tìm, ta sẽ tìm trong túi thẻ bài, coi có ai mà có cùng mã số
    //thì trả về thẻ bài, hồ sơ bạn SV đó, trả về tọa độ hồ sơ bạn sv đó
    public static Student getAStudent(String id) {
        List<Student> arr = new ArrayList();
        Student huong = new Student("3122560030", "NGUYỄN PHẠM QUỲNH HƯƠNG", 2004, 8.0);

        arr.add(new Student("3122570036", "TRẦN THỊ HÀ", 2004, 9.0));
        arr.add(huong);

        Student tmpStudent = arr.get(0);   //lấy được tọa độ SV 0
        //hỏi xem bạn i id là gì?
        String tmpId = tmpStudent.getId();  //~~arr.get(0).getId();

//        if(tmpId == id)
//            return tmpStudent;  //arr.get(0)
                                //trả về tọa độ trong thẻ
                                //trả về thẻ bài 0
        if (tmpId.equalsIgnoreCase(id))
            return tmpStudent;  //arr.get(0)
        //HOÀN TOÀN KHÔNG CÓ SV MỚI XUẤT HIỆN, CHỈ THAM CHIẾU TỌA ĐỘ VÙNG NEW
        //RETURN GET(0), THẺ BÀI 0 TRỎ VÙNG NEW HÀ 9.0
        return null;    //KHÔNG TÌM THẤY
    }

    //Set: loại giỏ không cho phép đựng trùng món
    //tức là không có món nào xuất hiện quá 1 lần
    //không cho phép trỏ trùng 1 vùng NEW
    //ĐẾM SỐ NGƯỜI XEM PHIM, ĐẾM MỖI NGƯỜI 1 LẦN
    //LIST: CỨ VÀO LÀ ĐẾM, VỀ RỒI, QUAY LẠI VẪN ĐẾM - SỐ LƯỢT XEM
    public static void playWithSet() {
        Set<Student> arr = new HashSet();   //mua 1 cái túi Doraemon
                                            //mở khóa để thao tác .hàm()

        Student ha = new Student("3122570036", "TRẦN THỊ HÀ", 2004, 9.0);

        arr.add(ha);
        arr.add(ha);    //add trùng

        arr.add(new Student("3122560030", "NGUYỄN PHẠM QUỲNH HƯƠNG", 2004, 8.0));
        arr.add(new Student("3122560030", "NGUYỄN PHẠM QUỲNH HƯƠNG", 2004, 8.0));   //KHÔNG TRÙNG
        //CÓ NEW CÓ VÙNG RAM MỚI, OBJECT MỚI, TRÙNG INFO TRONG NEW KHÔNG PHẢI LÀ VẤN ĐỀ
        //SET LÀ KHÔNG CHẤP NHẬN CON TRỎ TRÙNG VÙNG NEW
        //MỖI THẺ BÀI ĐƯỢC ADD VÀO GIỎ KHÔNG TRỎ LẠI 1 VÙNG NEW NÀO ĐÓ


        //không có hàm get(0) vì giỏ này đưa đồ vào thì có 2 tình huống xảy ra
        //HashSet: để "lộn xộn" thẻ bài
        //         để thẻ bài "có thứ tự" theo cách riêng
        //thẻ bài đưa vô không giữ nguyên thứ tự như lúc đưa vào
        //lấy thì FOR EACH, QUÉT HẾT GIỎ

        //KHÁC HOÀN TOÀN THỨ TỰ KIỂU ARRAYLIST
        //ARRAYLIST ADD TRƯỚC THÌ NGỒI TRƯỚC, VÀO SAU NGỒI SAU

        //GIỎ CHỨA MẤY THẺ BÀI? ADD 3 LẦN. ARRAYLIST: ADD BAO NHIÊU CHỨA BẤY NHIÊU
        System.out.println("The student list:");
        for (Student x : arr) {     //duyệt qua từng con trỏ, lấy tọa độ
                                    //từng thẻ bài gán vào con trỏ x
            x.showProfile();
        }
    }

    //ta tự sort danh sách sinh viên làm bằng tay
    //còn 1 cơ chế ta không cần dùng vòng for tự viết
    //hàm static: Collections.sort(), dùng Interface mới đc
    public static void sortArrayListManually() {
        List<Student> arr = new ArrayList();    //đi mua 1 cái túi Doraemon
        Student huong = new Student("3122560030", "NGUYỄN PHẠM QUỲNH HƯƠNG", 2004, 8.0);

        arr.add(new Student("3122570036", "TRẦN THỊ HÀ", 2004, 9.0));
        arr.add(huong); //đưa tạo độ vùng new
        arr.add(huong); //add trùng vùng new
        //có 2 tọa độ trong túi, có 2 thẻ bài
        //get() từng thẻ bài thì được tọa độ vùng new
        //[i] thì được tọa độ vùng new, y chang mảng, mỗi phần tử mảng là 1 tọa độ

        System.out.println("The student list:");
        //mảng đang giảm dần về điểm
        //thẻ bài 1: trỏ vùng điểm cao, thẻ bài 2: trỏ vùng điểm thấp
        for (Student x : arr) {
            x.showProfile();
        }
        System.out.println("The student list (using for i):");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
            //NHỚ CÂU: CÓ TỌA ĐỘ THÌ CHẤM LUÔN
        }

        //MẢNG CHƠI [I] SỜ NGAY CON TRỎ THỨ I
        //túi phải mở ra, gọi hàm .hàm()

        //đổi được 2 thằng thì đổi được cả giỏ, 2 vòng for
        Student tmp = arr.get(0);   //tmp trỏ cùng HÀ 9.0
        arr.set(0, arr.get(1));     //con trỏ thứ 0 trong giỏ phải trỏ vào HƯƠNG 8.0
        arr.set(1, tmp);            //con trỏ 1 thay cách trỏ, trỏ vào vùng tmp đang trỏ (tmp đang trỏ HÀ 9.0)
        //vùng new Student() vẫn nằm im, chỉ có thẻ bài trong giỏ trỏ vào vùng new

        System.out.println("The student list after sorting ascending by gpa:");
        for (Student x : arr) {
            x.showProfile();
        }

        arr.remove(1);
        System.out.println("The student list after removing:");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    public static void playWithArrayList() {
        //Student[] arr = new Student[500];
        //arr là 1 cái túi chứa sẵn 500 chỗ, 500 món đồ có thể bỏ vô
        //món đồ phải đi mua, new, thảy vào
        //tên mảng chính là má mì, quản lý nhiều đồ, tên túi luôn

        //List arr = new ArrayList(); //đựng lộn xộn đủ loại con trỏ
        //đúng nghĩa túi Doraemon, món gì cũng đựng, đựng tham chiếu thôi nha
        //nhét được NhanVien, GiangVien, Animal, Dog,....

        //túi đồng nhất chỉ lưu con trỏ Student
        List<Student> arr = new ArrayList();    //túi đựng đồng nhất 1 loại GENERATE

        //List<Student> arr = new ArrayList<>();
        //List<Student> arr = new ArrayList<Student>();
        //arr là 1 cái túi chứa vô hạn chỗ, vô hạn con trỏ
        //nhét đồng nhất món đồ dễ chấm chung được, đa hình được

        //MỞ NGĂN TỦ/TÚI NHÉT ĐỒ VÔ
        //arr.add(new Student(...));     //lưu con trỏ thôi, new Student() cứ nằm thoải mái bên ngoài vùng HEAP
        Student s1 = new Student("3122570036", "TRẦN THỊ HÀ", 2004, 9.0);
        Student s2 = new Student("3122560030", "NGUYỄN PHẠM QUỲNH HƯƠNG", 2004, 8.0);
        arr.add(s1);    //giỏ, vùng new ArrayList, tủ có thêm 1 con trỏ, sinh ra 1 con trỏ
        //2 chàng 1 nàng
        arr.add(s2);    //sinh ra thêm con trỏ nữa
                        //add() vô tận; mảng[length - 1] hết mức
        //add() mở khóa kéo, khóa dây, nhét đồ vô, nhét tham chiếu
        //sinh ra con trỏ
        arr.add(s1);    //add trùng 1 tên người vào danh sách
        //Set không báo lỗi, chỉ lấy 1...đừng đi vào chi tiết vội
        arr.add(new Student("3122560099", "NGUYỄN PHẠM NHƯ QUỲNH", 2002, 7.0));
        //          new cứ lên HEAP mà nằm, Bệnh nhân cứ về phòng, bệnh viện nắm thẻ bài
        //1 con trỏ nữa lại được add vào

        //hỏi xem túi đang có bao nhiêu đồ
        System.out.println("Danh sách có: " + arr.size() + " sinh viên");
        //4 sv in ra nhưng thực ra chỉ có 3 sv, do có người đếm trùng

        //In danh sách sv ra
        //tủ có gì? Chứa bên trong 1 đống con trỏ
        //Tủ ArrayList[con-trỏ-1, con-trỏ-2, con-trỏ-3,...nếu add thêm]
        //add() đẩy vào 1 con trỏ, tọa độ, thẻ bài
        //get(vị trí thẻ bài muốn lấy), trả về tọa độ của con trỏ thứ i
        //                              trả về địa chỉ vùng new đang trỏ
        //[i] lấy được tham chiếu bạn thứ i
        //get(i) lấy được chỗ ngồi tham chiếu con trỏ thẻ bài thứ i

        //in bạn đầu
        //arr[i].showProfile();
        Student xx = arr.get(0); //trả về tọa độ con trỏ thẻ bài của bạn thứ 0
        //trả về tọa độ thì gán vào biến Student khác nắm cùng tọa độ
        xx.showProfile();

        //bạn 1 get(1), có tọa độ thì chấm luôn cho rồi, thêm biến con trỏ trỏ cùng làm gì?
        arr.get(1).showProfile();   //trả về con trỏ

        System.out.println("In xịn xò");
        for (Student x : arr) { //không sợ NULL POINTER vì add() đến đâu thêm con trỏ đến đó
            x.showProfile();
        }

        System.out.println("In xịn xò for truyền thống:");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }

        //có hành động xóa 1 con trỏ, loại bỏ 1 món đồ, gạch tên 1 người khỏi danh sách
        //vùng new Student có bị mất hay không thì còn tuy vào mấy con trỏ trỏ nó
        //size() giảm liền; mảng không có vì cố định số con trỏ
        //set() đảo con trỏ, trỏ sang vùng khác (get() và set() xưa nay của các object)
    }
}