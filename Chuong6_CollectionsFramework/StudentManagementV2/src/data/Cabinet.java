package data;

import java.util.*;

public class Cabinet {
    //Tủ thì sẽ có nhiều ngăn chứa nhiều món đồ
    //Ta xài mảng, ArrayList, Collections nói chung để lưu nhiều đồ
    //từ từ các sinh viên đến nhập học, nộp hồ sơ, và ta cất vào tủ arr
    private List<Student> arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    //làm biếng làm phễu luôn, mọi thứ sẽ là default
    //Túi từ từ được add() vào
    //mình không mua cái Tủ có sẵn luôn 1 cái Túi, trong Túi có sẵn hồ sơ
    //nếu muốn làm thì new sẵn túi bên ngoài, có sv sẵn đưa vào trong tủ

    //Default/empty constructor
    //Không làm gì cả
    public Cabinet() {
    }

    //hành động của cái Tủ là: thêm hồ sơ, tìm hồ sơ, sắp xếp hồ sơ, xóa hồ sơ, cập nhật hồ sơ
    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;
        System.out.println("Input student profile: #" + (arr.size() + 1));

        //DÙNG LẠI HÀM SEARCH ĐỂ KIỂM TRA COI ID HỒ SƠ SV MỚI LIỆU RẰNG CÓ TỒN TẠI CHƯA?
        //CẤM TRÙNG ID - BÊN DATABASE GỌI LÀ PRIMARYKEY (KHÓA CHÍNH)
        //TƯƠNG ĐƯƠNG ĐĂNG KÝ MEMBER, ACCOUNT NAME
        while(true) {
            System.out.print("Input ID: ");
            id = sc.nextLine().trim().toUpperCase();    //cắt khoảng trắng dư và chuyển thành chữ in hoa
                                //String là object, vùng new
            Student xxx = searchAStudent(id);   //id vừa gõ kiểm tra liền
            if(xxx == null)     //id không tồn tại trong giỏ, đi tiếp
                break;
            else
                System.out.println("Duplicated ID. Try with another one!!!");
        }

        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();

        System.out.print("Input year of birth: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input GPA: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr.add(new Student(id, name, yob, gpa));
        System.out.println("The new student has been added successfully!");
    }

    public void printStudentList() {
        if(arr.isEmpty()) {
            System.out.println("The student list is empty, nothing to print!");
            return;
        }
        System.out.println("There is/are " + arr.size() + " student(s).");
        for (Student student : arr) {
            student.showProfile();
        }
    }

    //ta làm hàm tìm kiếm sinh viên, đóng 2 mục đích
    //1. Phục vụ tính năng tìm 1 sv theo ID
    //2. Phục vụ thêm cho việc kiểm tra ID có trùng hay không khi tạo mới 1 hồ sơ
    //hàm search() có 2 cách trả về: trả về vị trí tìm thấy trong Túi/int position
    //                               trả về tọa độ 1 object/tọa độ 1 object/tham chiếu
    public Student searchAStudent(String id) {
        if(arr.isEmpty()) {
            return null;
        }
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getId().equalsIgnoreCase(id))
                return arr.get(i);
        }       //nếu thấy sv, thì trả ngay về cái thẻ thứ i tham chiếu vùng new có chứa id tìm thấy
        //đi hết cả for mà không rẽ ở trên được thì không tìm thấy -> null
        return null;
    }

    //Hàm bao hàm search ở trên
    public void searchAStudent () {
        String keyword;
        System.out.print("Input the id to search: ");
        keyword = sc.nextLine();
        Student xxx = searchAStudent(keyword);
        if(xxx == null) {
            System.out.println("NOT FOUND!!!");
        }
        else {
            System.out.println("FOUND! Here is he/she:");
            xxx.showProfile();
        }
    }

    public void updateAStudent(Student x, double newGPA) {
        x.setGpa(newGPA);
    }

    public void updateAStudent(String id, double newGPA) {
        Student x = searchAStudent(id);
        if(x == null) {
            System.out.println("NOT FOUND!!! Nothing to update!");
            return;
        }
        //x.setGpa(newGPA);
        updateAStudent(x, newGPA);
    }

    public void updateAStudent() {
        String keyword;
        double newGPA;

        System.out.print("Input the id you want to update info: ");
        keyword = sc.nextLine();

        Student xxx = searchAStudent(keyword);
        if(xxx == null) {
            System.out.println("NOT FOUND!!! NOTHING TO UPDATE");
        }
        else {
            System.out.println("FOUND! Here is he/she before updating:");
            xxx.showProfile();
            System.out.print("Input new GPA: ");
            newGPA = Double.parseDouble(sc.nextLine()); //MyToys
            updateAStudent(xxx, newGPA);
        }
    }

//    public void updateAStudent() {
//        String keyword;
//        double newGPA;   //GIÁ TIỀN KHÔNG KIỂU INT
//        System.out.print("Input the id you want to update info: ");
//        keyword = sc.nextLine();
//        Student xxx = searchAStudent(keyword);
//        if(xxx == null) {
//            System.out.println("NOT FOUND!!! NOTHING TO UPDATE");
//        }
//        else {
//            System.out.println("FOUND! Here is he/she before updating:");
//            xxx.showProfile();
//            System.out.print("Input new GPA: ");
//            newGPA = Double.parseDouble(sc.nextLine()); //MyToys
//            xxx.setGpa(newGPA);
//
//            System.out.println("The student profile after updating new GPA:");
//            xxx.showProfile();
//        }
//    }
}

//CRUD - CREATE - RETRIEVE/READ - UPDATE - DELETE
