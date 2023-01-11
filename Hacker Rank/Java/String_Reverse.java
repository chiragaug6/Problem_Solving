import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=A.length()-1;i>=0;i--){
            sb.append(A.charAt(i));
        }
        String reverseString = sb.toString();
        if(reverseString.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
