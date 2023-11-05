package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;

import java.util.Random;

public class AmazingRace {
    public static void main(String[] args) {
        //showRecords();
        showRecordsWithTakeAway();
    }

    public static void showRecordsWithTakeAway() {
        //Đường đua đông vui, có nhiều race và có 1 con gì đó không nhìn rõ bay theo/ 1 vật gì đó bay theo, tức là tốc độ
        //không biết, không xác định được nhóm của nó là gì, chưa biết class
        //nhưng vì mày muốn nhập hội thì chơi trò take-away, "mượn gió bẻ măng", mượn Pet để new Object
        Pet ufo = new Pet("UFO", 2021, 0.3) {
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }

            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                                    "XXX", name, yob, weight, run());
            }
        };

        Hamster xx = new Hamster("NHẮT", 2023, 0.3);

        Pet[] racer = new Pet[] {
                new Dog("CHIHUHU", 2021, 0.5),
                new Dog("VÀNG ƠI", 1950, 10.0),
                new Cat("TOM", 1960, 15.0),
                new Cat("KITTY", 1990, 5.0),
                new Hamster("JERRY", 1960, 0.5),
                xx,
                ufo     //object tạo từ Anonymous thì vẫn là object
        };

        System.out.println("The records table:");
        for (Pet x : racer) {
            x.showRecord();
        }


        for (int i = 0; i < racer.length -1; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if(racer[i].run() > racer[j].run()) {
                    //tốc độ chạy sẽ bị thay đổi sau mỗi lần so sánh
                    //S, P, GPA cố định nên thoải mái gọi getS(), getP(), getGPA()...

                }
            }
        }
    }

    public static void showRecords() {
        Hamster xx = new Hamster("NHẮT", 2023, 0.3);
        Pet racer[] = new Pet[] {
                                    new Dog("CHIHUHU", 2021, 0.5),
                                    new Dog("VÀNG ƠI", 1950, 10.0),
                                    new Cat("TOM", 1960, 15.0),
                                    new Cat("KITTY", 1990, 5.0),
                                    new Hamster("JERRY", 1960, 0.5),
                                    xx
                                };
        //Phần tử mảng Pet thì phải gán 1 con Pet nào đó (Cat, Dog, Hamster)
        //gán = new Dog(...); [i] - cần tọa độ vùng new Con Nào Đó()
        //new Dog() ....; bố trí vùng RAM trong HEAP, gọi phễu đổ vào, lấy mốc tọa độ vùng new đưa cho ai đó

        //Đa hình quay trở lại
        //Vì mảng Pet, mọi việc CHẤM LÀ CỦA CHA, CỦA PET, CHA TOÀN LÀ ABSTRACT
        //HOÀN TOÀN KHÔNG ĐÁNG LO, VÌ CON ĐÃ IMPLEMENT
        //CHA QUẤT ROI: "CHẠY ĐI CHÚNG MÀY" -> THẾ LÀ 3 ĐỨA CON CHẠY THEO TỐC ĐỘ CỦA RIÊNG CHÚNG
        //ĐA HÌNH XUẤT HIỆN: @OVERRIDE QUA MẶT CHA
        System.out.println("The records table:");
        for (Pet x : racer) {
            x.showRecord();
        }

        //TẠI THỜI ĐIỂM VIẾT CODE THẾ NÀY, KHÔNG SORT THÀNH TÍCH CHẠY ĐƯỢC
        for (int i = 0; i < racer.length -1; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if(racer[i].run() > racer[j].run()) {
                    //Đa hình
                    //Hàm Cha nhưng chạy Con tương ứng: Hamster, Dog, Cat
                    //Mỗi lần gọi run() để so sánh thì sẽ có tốc độ khác -> không so sánh kiểu này được
                    //bài AmazingRace phải bắt tụi nhỏ chạy 1 lượt để ghi nhận thành tích và ta so sánh trên thành tích này
                }
            }
        }
    }
}