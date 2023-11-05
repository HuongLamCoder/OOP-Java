public class Main {
    public static void main(String[] args) {
        //Tạo một đối tượng nông trại
        NongTrai nongTrai = new NongTrai();

        //Cho chủ nhập vào số lượng ban đầu của mỗi loại gia súc
        nongTrai.nhapSoLuong();

        //Xuất số lượng ban đầu của mỗi gia súc
        System.out.println("\nSố lượng ban đầu của mỗi loại gia súc là:");
        nongTrai.xuatSoLuong();

        //a. Một hôm người chủ nông trại đi vắng, tất cả gia súc trong nông trại đều đói. Hãy cho biết những tiếng kêu nghe được trong nông trại.
        System.out.println("\nMột hôm người chủ nông trại đi vắng, tất cả gia súc trong nông trại đều đói. Các loại gia súc đều kêu:");
        nongTrai.keu();

        //b. Chương trình sẽ đưa ra thống kê các thông tin người chủ mong muốn (nêu trên) sau một lứa sinh và một lược cho sữa của tất cả gia súc.
        System.out.println("\n\n===============THỐNG KÊ NÔNG TRẠI===============");
        System.out.println("Số lượng con mà các loại gia súc đã sinh:");
        nongTrai.sinhCon();
        //thống kê số lượng gia súc sau 1 lứa sinh và tổng lít sữa sau 1 lượt cho sữa
        nongTrai.thongKeNongTrai();
        System.out.println("================================================");
    }
}
