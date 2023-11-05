
package basicarray;

import java.util.Scanner;

public class Sorting {
    //main() bên kia là main() default, đúng ở bất kỳ class nào F6 đều chạy main() default
    //main() thứ 2 muốn chạy bắt buộc phải mở nó lên, Shift F6
    //Có thể đổi default bằng cách Right Click BasicArray -> Properties -> Run -> đổi Main Class
    public static void main(String[] args) {
//        sortPrimitiveArray();
//        sortStudentList();
        inputStudentList();
    }
    
    //CHƯA OOP, MỌI THỨ PHẢI THUỘC VỀ OBJECT, ĐI QUA OBJECT CHẤM!!!
    public static void inputStudentList(){
        Student arr[]; //chưa biết bao nhiêu sinh viên??
                       //có thể khai báo mảng 500 sinh viên
                       //có thể hỏi muốn bao nhiêu thì new bấy nhiêu
                       //có cách không cần hỏi bao nhiêu -> đưa new Student() vào là có chỗ, mảng linh hoạt, co giãn kích thước, Collections Framework
        String id, name;
        int count, yob;
        double gpa;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students do you want to input? ");
        //count = sc.nextInt();   //trôi lệnh, try-catch, MyToys
        count = Integer.parseInt(sc.nextLine());
        arr = new Student[count];
        
        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            
            System.out.print("Input ID: ");
            id = sc.nextLine();

            System.out.print("Input name: ");
            name = sc.nextLine();

            System.out.print("Input YOB: ");
            yob = Integer.parseInt(sc.nextLine());

            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());
            
            arr[i] = new Student(id, name, yob, gpa);
        }
        
        System.out.println("\nThe student list");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    public static void sortStudentList(){
//        Student arr[] = new Student[5];
//        arr[0] = new Student("ST9", "HƯƠNG", 2004, 3.5);
//        arr[1] = new Student("ST5", "QUỲNH", 2002, 3.0);
//        arr[2] = new Student("ST8", "KIM ANH", 1976, 2.5);
//        arr[3] = new Student("ST2", "MINH BẮC", 1975, 4.0);
//        arr[4] = new Student("ST7", "HAHA", 2004, 3.2);

        Student arr[] = new Student[]{
                new Student("ST9", "HƯƠNG", 2004, 3.5),
                new Student("ST5", "QUỲNH", 2002, 3.0),
                new Student("ST8", "KIM ANH", 1976, 2.5),
                new Student("ST2", "MINH BẮC", 1975, 4.0),
                new Student("ST7", "HAHA", 2004, 3.2)
        };
        
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        
        //Sắp xếp
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i].getGpa() > arr[j].getGpa()){
                    Student tmp = arr[i];   //điểm ko ổn, thì đổi gọi tên, trỏ
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }   //Hoán đổi việc trỏ đúng vào vùng new có data điểm phù hợp
                    //thứ tự, đổi việc/thứ tự gọi tên sinh viên
                    //thay vì gọi điểm cao, gọi điểm thấp trước, vẫn gọi từ [0] đầu danh sách
            }
        }
        
        System.out.println("\nThe student list after sorting ascending by GPA");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    public static void sortPrimitiveArray(){
        int arr[] = new int[]{1000, -1000, 20, -20, 1000, 30, -3000};
        //sắp xếp tăng dần
        System.out.println("The array before sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        //Sắp xếp tăng dần, phần tử đứng trước phải nhỏ hơn phần tử đứng sau, bất kì vị trí trên mảng
        //if(thằng trước > thằng sau) --> sau
        
        //cần [0] nhỏ nhất trong cả mảng
        //lấy [0] đi so với tất cả phần tử còn lại, if ko ổn thì đổi
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){    //i luôn nhỏ hơn j, trước j trong mảng
                    int tmp = arr[i];   //đứng trước mà bày đặt đòi lớn
                    arr[i] = arr[j];    //thì swap
                    arr[j] = tmp;
                }
            }
        }
        
        System.out.println("\nThe array after sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
