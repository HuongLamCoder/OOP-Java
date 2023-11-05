
    import java.util.Scanner;

public class bai9 {
    static Scanner inp = new Scanner(System.in);
    public static void a(String s){
        System.out.println("Do dai cua chuoi "+s+" la: "+s.length());   
    }

    public static void b(String s){       
        s = s.trim().replaceAll("\\s+", " ");
        System.out.println(s);
    }

    public static  void c(String s){
        String[] words = s.split("\\s+");
        int wordCount =  words.length;
        System.out.println("So tu cua chuoi la: " + wordCount);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void d(String s){
        int k;
        do {
            System.out.print("Nhap k: ");
            k = inp.nextInt();
        } while ((k<0) & (k>s.length()));
        String left = s.substring(0, k);
        System.out.println(k+" ki tu ben trai cua chuoi: "+left);
        String right = s.substring(s.length()-k);
        System.out.println(k+" ki  tu ben phai cua chuoi: "+right);       
    }

    public static void e(String s){
        int n, k;
        System.out.print("Nhap so ki tu n muon xuat: ");
        n = inp.nextInt();
        System.out.print("Nhap vi tri k: ");
        k = inp.nextInt();
        String newsString = s.substring(k, n+k);
        System.out.println(n+" ki tu cua chuoi tu vi tri "+k+": "+newsString);
    }
    public static void main(String[] args){
        String s;
        System.out.print("Nhap chuoi: ");
        s = inp.nextLine();
        Byte opt;
        String tieptuc="y";
        while (tieptuc.equals("y")) {
            System.out.println("Cac lua chon: ");
            System.out.println("1.Do dai cua chuoi");
            System.out.println("2.Xoa bo cac khoang trang thua");
            System.out.println("3.Dem so tu cua chuoi va xuat moi tu o tren mot dong");
            System.out.println("4.Xuat k ki tu ben trai va k ki tu ben phai cua chuoi");
            System.out.println("5.Xuat k ki tu cua chuoi tu vi tri n");
            System.out.print("Nhap lua chon cua ban: ");
            opt = inp.nextByte();
            switch (opt) {
                case 1:
                    a(s);
                    break;
                case 2:
                    b(s);
                    break;
                case 3:
                    c(s);
                    break;
                case 4:
                    d(s);
                    break;
                case 5:
                    e(s);
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;                    
            }
            System.out.println("Ban muon tiep tuc mot trong cac lua chon tren?(y/n)");
            inp.nextLine();
            tieptuc = inp.nextLine();
        }
        inp.close();
    }
}

