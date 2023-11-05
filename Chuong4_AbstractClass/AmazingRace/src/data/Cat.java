package data;

import java.util.Random;

public class Cat extends Pet{
    public static final double MAX_SPEED = 50;

    //Constructor
    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
//        Random rd = new Random();   //rd nắm tọa độ vùng new
//                                    //trong vùng new có hàm .nextDouble() quan trọng
//        return rd.nextDouble() * MAX_SPEED;
        return new Random().nextDouble() * MAX_SPEED;
            // ANONYMOUS OBJECT, object không đặt tên, xài vùng new 1 lần bỏ luôn
            // GARBAGE COLLECTOR sẽ dọn dẹp vùng nhớ trong RAM
            // Lệnh gom rác: System.gc()
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                            "CAT",name, yob, weight, run());
    }
}
