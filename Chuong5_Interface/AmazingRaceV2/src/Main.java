import data.DeathRacer;
import data.Dog;
import data.Motor;
import data.Pet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        runToDead();
    }

    public static void playAnonymous() {
        //List list = new ArrayList();
        //abstract, inetface, khoảng 20 hàm không có code
        List list = new List() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public Object set(int index, Object element) {
                return null;
            }

            @Override
            public void add(int index, Object element) {

            }

            @Override
            public Object remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator listIterator() {
                return null;
            }

            @Override
            public ListIterator listIterator(int index) {
                return null;
            }

            @Override
            public List subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }

    public static void runToDead() {
        //CÓ QUYỀN CÓ AI ĐÓ CHẠY NGANG NHẢY VÀO ĐUA CHUNG
        //MỸ NHÂN NGƯ CỦA CHÂU TINH TRÌ NHẢY VÀO
        //Người cá đúng chuẩn - class Mermaid thì chuyên ngồi mỏm đá dụ thủy thủ đến để bắt ăn thịt
        //Nếu ta làm class Mermaid rời - concrete (tạo 1 class Mermaid), viết code bình thường, trong code này có hàm bắt thủy thủ và ăn thịt
        //bắt Mermaid implements DeathRacer, bắt người cá đi đua là chuyện quá đáng, không phù hợp logic
        //Người cá không thích di chuyển trên cạn, đi đua

        //Nhưng có nàng người cá thích ăn chay, lên bờ chơi với con người
        //không theo logic chung của người cá là ăn thịt người thủy thủ
        //object lẻ không nhập chung đoàn Mermaid truyền thống
        //không bắt Mermaid implements DeathRacer
        //Mỹ nhân ngư của CTT phá đoàn, tham gia đua dưới kênh Nhiêu Lộc cho vui
        //không bắt cả họ Người Cá đi đua
        //object đánh lẻ, đáng lẻ đua, thì chỉ cần đua tốc độ là được rồi
        //Anonymous class, không thèm tạo 1 class rời, mà vẫn tham gia CLB
        //Chỉ cần có hành động của CLB là okie rùi, ghé ngang nhưng cũng phải hành động. Implements all abstract methods on the go

        //Làm class riêng rẽ để nhân bản được nhiều member
        //làm on the go dành cho vãng lai ghé ngang
        //CẢ 2 ĐỀU PHẢI IMPLEMENTS, @OVERRIDE VÌ CHA, CLB KHÔNG HOÀN HẢO

        //OBJECT ON THE GO, CẦN CÓ HÀM ĐUA VÀ GÁY THÀNH TÍCH LÀ XONG, KHÔNG LÀM CLASS RỜI
        //KHÔNG LÀM CLASS CÓ SẴN ĐỂ NHÂN BẢN
        //DeathRacer mnnCTT = new Mermaid();        //class rời sẽ phải có @Override đầy đủ
                                                    //2 hàm runToDead() showHowToDead()
                                                    //y chang Motor????
        //Mượn gió bẻ măng, không có Khuôn sẵn thì phải code @Override từ đầu cho mỗi lần chơi trò làm biếng tạo Khuôn
        //ON THE GO @Override
        DeathRacer mnnCTT = new DeathRacer() {
            //VÙNG KHÔNG GIAN CLASS RỜI MERMAID MÀ TA LÀM BIẾNG LÀM RIÊNG
            //VÙNG NÀY CHÍNH LÀ PHẦN MỞ RỘNG CỦA CHA/CLB
            //Ba sẽ là cánh chim (new/super() new DeathRacer) đưa con extends/implements thật xa thật nhiều @Override
            //Ta có quyền làm như truyền thống, thêm đặc điểm....
            //Đừng lạm dụng, on-the-go thì nên quan tâm phần đang tham gia
            public static final double MAX_SPEED = 50.0;

            @Override
            public double runToDead() {
                return new Random().nextDouble() * MAX_SPEED * 3;
            }

            //nếu chơi Anonymous, làm biếng tạo class rời cho cả abstract class và interface
            //thì bên Abstract còn có đặc điểm của Cha cho để dùng
            //anonymous của Interface, đua thì đua đi, hỏi làm chi, không có đặc điểm/info
            @Override
            public void showHowToDead() {
                System.out.printf("|%-20s|%-15s|2015|%5.1f|\n",
                                  "MERMAID-RACER", "MỸ NHÂN NGƯ", runToDead());
            }
        };  //nhớ chấm phẩy nghen


        Dog d1 = new Dog("NGÁO ĐÁ", 2021, 50.0);
        //chấm full hàm của Con, đủ code hàm Cha, hàm CLB

        Pet d2 = new Dog("VÀNG ƠI", 1950, 10.0);
        //nếu chấm chỉ có full hàm của Cha (khai Cha), chạy thì đa hình (Con qua mặt)
        //tổ lái con trỏ được, new Dog
        //đang dùng "danh nghĩa Cha" thì chỉ sổ Cha thôi

        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20.0);
        //ngộ nhỡ dấu chấm thì sao?
        //chấm chỉ sổ full CLB, 2 hàm runToDead() và showHowToDead()
        //t là đua thủ thì chỉ quan tâm đua thôi
        //chạy thì Con qua mặt, có đủ hàm @Override đã làm rồi, đa hình tiếp
        //ép con trỏ được

        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");

        //mnnCTT vẫn là 1 Racer, có hành động đua gấp 3 lần giới hạn vật lý người cá, e xứng đáng gia nhập CLB đua, vào mảng để đua
        DeathRacer[] racer = {mnnCTT, d1, (Dog) d2, d3, m1, m2};
        //Toàn bộ là DeathRacer, đa hình là đa hình trên runToDead() showHowToDead()
        //Con tự lo, Motor chạy theo Motor, Con Dog chạy theo Dog

        System.out.println("The racing record:");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
    }
}