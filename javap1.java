import java.util.Scanner;
 public class javap1{ 
    public static void main(String[] args){ 
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter n numbers to be print:");
        int n = Sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
         sum+=i;
         i++;
        }
        System.out.println("sum of first " + n + " natural numbers is: " + sum);
        }
}
