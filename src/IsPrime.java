import java.util.*;
public class IsPrime {
    public static void main(String[] args){
        int t, n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i=0; i<t;i++){
            n=sc.nextInt();
            int count = 0;
            for(int div = 2; div*div<=n;div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }

    }
}
