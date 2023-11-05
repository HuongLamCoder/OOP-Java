import data.DeathRacer;
import data.Dog;
import data.Motor;
import data.Pet;

public class Main {
    public static void main(String[] args) {
        runToDead();
    }

    public static void runToDead() {
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

        DeathRacer[] racer = {d1, (Dog)d2, d3, m1, m2};
        //Toàn bộ là DeathRacer, đa hình là đa hình trên runToDead() showHowToDead()
        //Con tự lo, Motor chạy theo Motor, Con Dog chạy theo Dog

        System.out.println("The racing record:");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
    }
}