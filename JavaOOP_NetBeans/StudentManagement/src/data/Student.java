
package data;

public class Student {
    private static String id;   //nằm ở 1 vùng nhớ riêng, mà object nào cũng xài ké, chung 
    public static String name;  //vùng nhớ xài chung cho các object cùng Nhóm/Class
                                //Dữ liệu đổ vào/chỉnh sửa ăn theo thằng cuối cùng đổ/gán
    
    //CHỐT HẠ: KHÔNG DÙNG STATIC CHO NHỮNG THỨ/ĐẶC ĐIỂM/HÀM MÀ CỦA RIÊNG TỪNG OBJECT
    //Tui có mã số, bạn có mã số, bạn kia cũng có mã số NHƯNG đều là riêng của từng đứa
    //Chung đặc điểm, khác value -> Vậy phải có biến clone riêng - NON-STATIC
    
    public int yob;
    private double gpa; //grade point average   non-static

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    } //hiếm khi đổi mã số, giống như PRIMARY KEY trong database

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%-8s|%-25s|%4d|%4.1f|\n",
                            id, name, yob, gpa);
    }

    public void showProfile(){
        System.out.printf("|%-8s|%-25s|%4d|%4.1f|\n",
                            id, name, yob, gpa);
        //System.out.println("yob: " + yob);
        //NON STATIC CHƠI VỚI NON - DĨ NHIÊN CÙNG OBJECT, VÀ STATIC LUÔN, ĐỒ RIÊNG THÀNH ĐỒ CHUNG
        
    }
    
    public int getAge(){
        return 2023 - yob;
    }
    
    public static void sayHi(){
        System.out.println("Hi everyone! My name is " + name);
//        System.out.println("By the way, my yob is " + yob);
        //Static chỉ chơi với static vì cùng khu vực, không chơi với non
        //Có quá trời yob đc clone biết lấy ai bỏ ai
    }
}
