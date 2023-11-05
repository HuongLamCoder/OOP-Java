package Chuong2;

import java.util.Scanner;

public class MyString {
    Scanner sc = new Scanner(System.in);
    
    private String str;

    //Khởi tạo không có tham số truyền vào
    public MyString(){
        this.str = null;
    }

    //Khởi tạo có tham số truyền vào
    public MyString(String str){
        this.str = str;
    }

    //Phương thức set 
    public void setString(String str){
        this.str = str;
    }

    //Phương thức get
    public String getString(){
        return this.str;
    }

    //Phương thức nhập chuỗi
    public void nhapChuoi(){
        System.out.print("Nhập chuỗi (không dấu): ");
        str = sc.nextLine();
    }

    //Phương thức xóa khoảng trắng thừa giữa các chữ
    public void trimWhiteSpace(){
        str = str.trim().replaceAll("\\s+", " ");
    }

    //Phương thức đếm số lượng từ của chuỗi
    public int countWords(){
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }

    //Phương thức đếm số lượng kí tự của chuỗi
    public int countChar(){
        return str.length();
    }

    //Phương thức đếm số lượng câu của chuỗi
    public int countSentences(){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '.'){
                count++;
            }
        }
        return count;
    }

    //Phương thức tách k kí tự bên trái của chuỗi
    public String left(int k){
        if(k>=0 && k <= str.length()){
            return str.substring(0, k);
        }
        else{
            return null;
        }
    }

    //Phương thức tách k kí tự bên phải của chuỗi
    public String right(int k){
        if(k >= 0 && k <=str.length()){
            return str.substring(str.length()-k);
        }
        else{
            return null;
        }
    }

    //Phương thức so sánh chuỗi
    public boolean compareStr(String otherStr){
        return str.equals(otherStr);
    }

    //Phương thức viết hoa kí tự đầu tiên của mỗi từ
    public String capitalize(){
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for(String word : words){
            if(!word.isEmpty()){
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }

    //Phương thức tìm kiếm chuỗi con của chuỗi
    public int indexOf(String subStr){
        return str.indexOf(subStr);
    }

    //Phương thức tách và in mỗi từ trên một dòng
    public void splitStr(){
        String[] words = str.split("\\s+");
        for(String word : words){
            System.out.println(word);
        }
    }

    //Phương thức thay thế chuỗi con thành 1 chuỗi khác
    public String replaceString(String subStr, String replaceStr){
        return str.replace(subStr, replaceStr);
    }

    //Tạo menu
    public void menu(){
        int choice;
        do{
            System.out.println();
            System.out.println("1 - Xóa các khoảng trắng dư thừa.");
            System.out.println("2 - Đếm số lượng từ của chuỗi.");
            System.out.println("3 - Đếm số lượng kí tự của chuỗi.");
            System.out.println("4 - Đếm số lượng câu của chuỗi.");
            System.out.println("5 - In k kí tự bên trái của chuỗi.");
            System.out.println("6 - In k kí tự bên phải của chuỗi.");
            System.out.println("7 - So sánh chuỗi với chuỗi khác.");
            System.out.println("8 - Viết hoa kí tự đầu tiên của mỗi từ.");
            System.out.println("9 - Tìm kiếm chuỗi con trong chuỗi.");
            System.out.println("10 - Tách và in mỗi từ của chuỗi trên một dòng.");
            System.out.println("11 - Thay thế chuỗi con trong chuỗi thành một chuỗi khác.");
            System.out.println("0 - Trở về.");

            System.out.print("\nNhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            System.out.println();
            
            if(choice == 0){
                System.out.println("Menu chọn bài:");
                break;
            }

            if(choice<0 || choice>11){
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }

            switch(choice){
                case 1:
                    System.out.println("Chuỗi sau khi xóa các khoảng trắng dư thừa:");
                    trimWhiteSpace();
                    System.out.println(getString());
                    break;
                case 2:
                    System.out.println("Số từ của chuỗi là: " + countWords());
                    break;
                case 3:
                    System.out.println("Số kí tự của chuỗi là: " + countChar());
                    break;
                case 4:
                    System.out.println("Số câu của chuỗi là: " + countSentences());
                    break;
                case 5:
                    System.out.print("Nhập k: ");
                    int k = sc.nextInt();
                    System.out.println(k + " kí tự bên trái của chuỗi là: " + left(k));
                    break;
                case 6:
                    System.out.print("Nhập k: ");
                    k = sc.nextInt();
                    System.out.println(k + " kí tự bên phải của chuỗi là: " + right(k));
                    break;
                case 7:
                    System.out.print("Nhập chuỗi cần so sánh: ");
                    sc.nextLine();
                    String sub_str = sc.nextLine();
                    if(compareStr(sub_str)==true){
                        System.out.println("Hai chuỗi giống nhau!");
                    }
                    else{
                        System.out.println("Hai chuỗi khác nhau!");
                    }
                    break;
                case 8:
                    System.out.println("Chuỗi sau khi viết hoa kí tự đầu mỗi từ:");
                    System.out.println(capitalize());
                    break;
                case 9:
                    System.out.print("Nhập chuỗi con cần tìm: ");
                    sc.nextLine();
                    String childStr = sc.nextLine();
                    int index = indexOf(childStr);
                    if(index >= 0){
                        System.out.println("Vị trí của chuỗi con là: " + index);
                    }
                    else{
                        System.out.println("Không tìm thấy chuỗi!");
                    }
                    break;
                case 10:
                    splitStr();
                    break;
                case 11:
                    System.out.print("Nhập chuỗi con cần thay thế: ");
                    sc.nextLine();
                    childStr = sc.nextLine();
                    System.out.print("Nhập chuỗi thay thế: ");
                    String replaceStr = sc.nextLine();
                    System.out.println("Chuỗi sau khi thay thế: " + replaceString(childStr, replaceStr)); ;
                    break;
            }
        }while(choice != 0);
    }

}
