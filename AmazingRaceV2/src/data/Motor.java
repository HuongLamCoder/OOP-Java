package data;

import java.util.Random;

//chơi thêm kế thừa, Motor is a kind of vehicle (abstract class)

//MOTOR MUA VỀ CHẠY ĐI HỌC, CHUYỆN BÌNH THƯỜNG, HÀM RUN()
//NHƯNG TRÊN ĐƯỜNG CÓ NGƯỜI NÀO ĐÓ NẸT PÔ, MÌNH KÉO TAY GA MẠNH HƠN, BỐC ĐẦU, VỌT XE
//TỐC ĐỘ PHẢI DỮ HƠN BÌNH THƯỜNG, NGOÀI VIỆC MOTOR THÔNG THƯỜNG, MÀ TA CÒN LÀ ĐUA THỦ
//GIA NHẬP HỘI ĐUA, CHỈ ĐUA THÔI
//TỚ CÒN LÀ 1 ĐUA THỦ, KHÔNG DÙNG TỪ KHÓA EXTENDS, XÀI TỪ LÀ 1 MEMBER CỦA,
//                                                             IMPLEMENTS
//                                                             THAM GIA CLB, TRIỂN KHAI VIỆC ĐUA
//THAM GIA CLB NÀO THÌ PHẢI CÓ HÀNH ĐỘNG CỦA CLB ĐÓ
//IMPLEMENTS ALL ABSTRACT METHODS BÊN CLB, CHỌN ĐI ĐUA MÀ KHÔNG CHỊU ĐUA SAO
//@OVERRIDE
//CLASS CHÍNH CỨ CÓ ĐẶC ĐIỂM VÀ HÀNH VI NHƯ BÌNH THƯỜNG
//CHÚNG TA THAM GIA CLB NÀO THÌ CÓ THÊM HÀNH ĐỘNG CỦA CLB ĐÓ THÔI, @OVERRIDE HÀNH ĐỘNG ĐÓ
//TRONG TA CÓ NHIỀU HÀNH ĐỘNG ỨNG VỚI TỪNG CLB TA THAM GIA
//VỀ LOGIC THA CÓ THỂ THAM GIA N CLB, NHƯNG TA CHỈ CÓ 1 DÒNG HỌ
//TRONG JAVA, 1 CON TỐI ĐA 1 CHA (ĐƠN KẾT THỪA)
//            1 CON THAM GIA N CLB, SẼ CÓ HÀNH ĐỘNG CỦA N CLB

//C++, 1 CON NHIỀU CHA LUÔN
public class Motor implements DeathRacer{
    public static final double MAX_SPEED = 180;

    private String model;   //Exciter 2021, Winner 2020
    private String volume;  //150.0cm3
    private String vin;     //biển số, số khung (Vehicle Indentifier Number)

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "model='" + model + '\'' +
                ", volume='" + volume + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }


    //hành vi của xe máy là chạy, có tốc độ được ghi nhận
    public double run() {
        //chạy ngẫu nhiên và không quá 180 km/h
        return new Random().nextDouble() * MAX_SPEED;
    }

    //quay video gáy để đời
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%-8s|%11s|%5.1f|\n",
                          "MOTOR", model, volume, vin, run());
    }


    @Override
    public double runToDead() {
        //CHẠY TỐC ĐỘ CAO
        return run() * 3;
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-15s|%-8s|%11s|%5.1f|\n",
                          "MOTOR-RACER", model, volume, vin, runToDead());
    }
}
