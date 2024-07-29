import java.util.*;
public class PrimeFactorization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int div = 2; div*div <=n;div ++){
            while(n % div == 0){
                n = n / div;
                System.out.println(div);
            }
        }
        if(n != 1){
            System.out.println(n);
        }
    }
}
