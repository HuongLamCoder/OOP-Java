
package basicarray;

public class BasicArray {

    public static void main(String[] args) {
//        playWithPrimitiveArrayV3();
        playWithAStudent();
    }
    
    public static void playWithAStudent(){
        //muốn có 1 sinh viên, ta cần 2 thứ: Con trỏ/biến tham chiếu = value phức tạp new ()
        Student x;
        x = new Student("3122560030", "QUỲNH HƯƠNG", 2004, 3.5);
        x.showProfile();
        
        //Chuyện hay ho
        //Vì x cần 1 tọa độ của vùng new = new Student() okie
        //x = chỉ cần số ám chỉ địa chỉ trong ram, vị trí của 1 byte nào đó
        x = null; //x hạ cánh, trỏ tới đáy ram, lưu tọa độ 0, vùng này 8 con transitor 0FFFFFFFFFF
        x.showProfile(); // bị báo lỗi do trước đó thiếu value, biến không value không chơi tiếp
    }
    
    public static void playWithPrimitiveArrayV3(){
        //int arr1[50]; //không cho kích thước khi khai báo
        int arr2[] = {5, 10, 15, 20, 25}; //có 5 biến int, thêm arr2 là biến
            //~ arr[0] [1] [2] [3] [4] ~~~ int a = 5;
            //          sĩ                  lẻ
            //new ngầm int[5] rồi gán, implicit
            
        int arr3[] = new int[]{5, 10, 15, 20, 25}; //giống cách trên, expltcit
        
        //int arr[] = new int[5]; //5 biến int trùng tên arr, arr[0], arr[1] ~~~ int x
        //int x = 10;
        
        int arr[];  // nói rằng sẽ có nhiều biến
        arr = new int[5];   //và chúng nó đây
        
        arr[0] = 5;    //em là 1 biến int - primitive
        arr[1] = 10;
        arr[2] = 15;
        
        //Phần còn lại [3] [4] là mấy??? Default 0, boolean - false
        
        System.out.println("The array has");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\n\nThe array has (using for each)");
        for (int x : arr) {
            System.out.print(x+ " ");
            //x = a[0], x = a[1], x sẽ bằng từng thành phần trong mảng
            //lôi vị trí thứ i, biến thứ i ra lấy value và in ra
        }
        
        //arr[0] chấm xổ gì? arr[1] chấm xổ ra gì?
        // --> Không xổ ra gì, vì là biến primitive, xài value luôn
        //arr chấm xổ gì?
        // --> Xổ ra length, ... vì arr là biến con trỏ
        
        //arr trỏ tới vùng new bự, có 1 đám biến primitive và còn + hàm() + length
        System.out.println("\n\nThe array has: " + arr);    //gọi toString() -> in mã hexa (mã băm)
        
    }
    
    public static void playWithPrimitiveArrayV2(){
        //float* arr = calloc(7, sizeof(float));
          //STACK         //HEAP
         //biến con trỏ     trỏ vùng RAM lớn, 28 bytes chia thành 7 cụm/7 biến
         //                 = lưu tọa độ vùng bắt đầu
         //                 = new bên JAVA
         
        double arr[] = new double[5]; //ngoặc vuông [] là mảng, xin số biến
                                      //ngoặc tròn () là gọi phễu của Khuôn
                                      //có new là có vùng nhớ lớn
                                      //có vùng RAM bự chứa đến 365 biến double
                                      //default là 0
        
        //arr[0] là một biến double, arr[i] cũng là biến double -> primitive
        //primitive là giá trị đơn --> xài luôn --> KHÔNG chấm
        
        //QUAN TRỌNG: tên mảng bản thân là 1 biến má mì, tú ông, tú bà, CON TRỎ, reference
        //trỏ vào đầu 1 dãy rất nhiều biến khác
        //nó là biến má mì vì quản lý rất nhiều lính
        //hỏi má mì có bao nhiêu lính, má mì trả lời tao có 365 lính
        //đây chính là đặc điểm của má mì, quản lý nhiều lính....
        //má mì có có bao nhiêu lính -> má mì chấm length
        
        
        //double pi = 3.14;
        
        arr[0] = 68;
        arr[1] = 79;
        arr[2] = 100;
        
        //arr[0]. -> Báo lỗi vì mi là 1 biến double bình thường
        //           Tên mi phức tạp do 365 xài chung tên, mi không khác gì double x;
        
        //In mảng bình thường
        System.out.println("The array arr has");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\n\nFOR EACH");
        for (double x : arr) {
            System.out.print(x + " ");
        }
    }
    
    public static void playWithPrimitiveArray(){
        //double vol[365]; cấm tuyệt đối trong lệnh khai báo gõ kích thước mảng, số phần tử
        
        //double v[365] = {0, 5, 15, 20, 25};

        double v[] = {0, 5, 10, 15, 20, 25, 30}; //mảng 7 phần tử, 7 biến double
        //có sẵn value v[0]=0; v[1]=5;...
        //STACK        //Nằm trên HEAP
        
        v[6] = 2023;

        System.out.println("v[0]: " + v[0] + " | v[1]: " + v[1]);
        System.out.printf("Element 0 nè: %.2f\n",v[0]);
        for(int i = 0; i < 7; i++){
            System.out.print(v[i] + " ");
        }
        
        System.out.println("\n\nThe array v has value of (using for each)");
        for (double x : v) {
            //với mọi biến double x, nó sẽ duyệt qua toàn bộ phần tử của mảng
            //x thuộc: tập hợp v, x có quyền bằng phần tử v thứ 1, x = v[0], ..... x = v[i]
            //sout(x) ~~~~~~~~~~~~~~~~~~~~~ sout(v[i])
            //Phần tử thứ i của mảng double là 1 biến double v[i] -> x biến double có gì sai
            System.out.print(x + " ");
        }
        
        //TOÁN TẬP HỢP
//        N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...}
//        V x e N (với mọi x thuộc tập N), tức là x sẽ là mấy, có value mấy? Vì tập hợp toàn là số
//        x = -5 -> sai
//        x = 0, x = 1, x = 2, x = 3, .....N
//        x chắn chắn là số tự nhiên đã, lấy value trong N
//        V x là integer và e N
//        x = N[0] = 0, x có thể số tự nhiên đầu tiên
//        x = N[1] = 1, x có thể là số tự nhiên kế tiếp
//        //Chữ với mọi (V) chính là kỹ thuật giúp ta duyệt qua toàn bộ value của 1 tập hợp, rọi đèn pin từ trái sang phải, lôi hết element phần tử/giá trị của tập hợp

    }
}
