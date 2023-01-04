import java.util.Scanner;

// WAP to find a Factor of a given number
// iterative Method
/*
 * factor of 26=1,2,13,26
 */
public class Q3_M1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number :");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
