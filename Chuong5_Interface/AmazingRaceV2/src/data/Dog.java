package data;

import java.util.Random;

//Dog ngoan ngoãn ban ngày, tối chủ đi ngủ, nó trốn nhà đi đua
//đi đua thì nó phải chạy vượt tốc độ bình thường, runToDeath() như mọi đua thủ
//IMPLEMENTS ALL ABSTRACT METHODS, NỘI QUY CLB, @OVERRIDE
public class Dog extends Pet implements DeathRacer{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.2f|%4.1f|\n",
                          "DOG", name, yob, weight, run());
    }

    @Override
    public double runToDead() {
        return run() * 5;   //chạy hơn 5 lần so với bình thường
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-10s|%4d|%4.2f|%4.1f|\n",
                          "DOG-RACER", name, yob, weight, run());
    }

}
