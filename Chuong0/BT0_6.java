import java.util.Scanner;
import java.lang.Math;

public class BT0_6 {
    public int isPrime(int N){
        if(N<2) return 0;
        int k = (int)Math.sqrt(N); //Math.sqrt() trả về kiểu double -> ép kiểu
        for(int i=2;i<=k;i++){
            if(N%i==0)  
                return 0;
        }
        return 1;
    }
    
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int N = inp.nextInt();

        BT0_6 function = new BT0_6(); 

        if(function.isPrime(N)==0)
            System.out.println(N + " không phải số nguyên tố!");
        else
            System.out.println(N + " là số nguyên tố!");

        inp.close();
    }

    
}
