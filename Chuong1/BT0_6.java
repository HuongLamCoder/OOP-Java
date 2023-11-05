import java.util.Scanner;
import java.lang.Math;

public class BT0_6 {
    Scanner inp = new Scanner(System.in);
    public int N;
    
    public int isPrime(int N){
        if(N<2) return 0;
        int k = (int)Math.sqrt(N); //Math.sqrt() trả về kiểu double -> ép kiểu
        for(int i=2;i<=k;i++){
            if(N%i==0)  
                return 0;
        }
        return 1;
    }
    
    public void primeCheck(){
        System.out.print("Nhập số N: ");
        N = inp.nextInt();

        if(isPrime(N)==0)
            System.out.println(N + " không phải số nguyên tố!");
        else
            System.out.println(N + " là số nguyên tố!");
    }

    
}
