
package studentmanagement;

import data.Student; //~ mượn đồ để dùng, tìm đến nơi cất
import java.util.Scanner;
//~~ #include <stdio.h>

public class StudentManagement {

    public static void main(String[] args) {
//        saveAStudent();
//        inputAStudent();
        saveStudents();
    }
    
    //Nhập từ bàn phím
    //Cần Scanner object bàn phím. OOP cái gì cũng object, class
    //Máy Cam, Scanner tiệm photo, Webcam, Bàn Phím, Touchpad -> nhóm quét dữ liệu đưa vào máy tính
    //Class Scanner xuất hiện. Xài phải new để cho nó hành xử
    //Từ bàn phím đi vào ram, do đó phải có biến hứng value
    public static void inputAStudent(){
        String id, name;
        int yob;
        double gpa;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input ID: ");
        id = sc.nextLine();
        System.out.print("Input Name: "); //chuỗi trước số ko bị trôi lệnh
        name = sc.nextLine();
        System.out.print("Input YOB: ");
        yob = sc.nextInt();
        System.out.print("Input GPA: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
//        x.setId(id); //nguy hiểm
    }
    
    //hard-code
    public static void saveStudents(){
        Student cuong = new Student("003", "CƯỜNG VÕ", 2001, 3.5);
        Student an = new Student("001", "AN NGUYỄN", 2004, 8.5);
        Student binh = new Student("002", "BÌNH LÊ", 2002, 0.4);
        
        
        
        an.showProfile();
        binh.showProfile();
        
        //Chấm xổ gì, Access Modifier/Access Specifier
        System.out.println("AN's name (directly): " + an.name); //y chang cầu thủ in tên sau lưng áo
        System.out.println("BÌNH's name (directly): " + binh.getName());
        
        //Vì sờ đc trực tiếp cái name/biến/instance variable, ta có thể get() và set()
        //an.name = "KHÔNG HỌC BÀI";
        Student.name = "CÀY RANK KHÔNG CÀY CODE";
        
        System.out.println("BÌNH's name (directly): " + binh.name);
        System.out.println("AN's name again: " + an.name);
        an.showProfile();
        
        System.out.println("Student's name (directly): " + Student.name);
        
        an.showProfile();
        cuong.showProfile();
        
        //sayHi() mà sayHi() đang là static
        System.out.println("USING STATIC");
        an.sayHi(); //không tư hữu theo kiểu của riêng mình cho static
        binh.sayHi();
        
        Student.sayHi();    //Tên Class chấm static vì là đồ chung multiple objects 
        
        //2 loại dấu chấm
        //Chấm trực tiếp qua tên class tức là chạm/sờ STATIC
        //Chấm qua con đường new tức là bạn đang hàm ý chơi với non-static
        //                                  đồ của riêng từng object
        
        
    }
}

//STATIC ĂN THEO THẰNG CUỐI CÙNG
