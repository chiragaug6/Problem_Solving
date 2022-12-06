// WAP to find a sum of even number into 1D array

public class Q1{
    public static void main(String[] args) {
        int[] arr={15,14,54,47,45,24};
        int sum=0;
        for(int x:arr){
            if(x%2!=0){
                sum=sum+x;
            }
        }
        System.out.println("sum of even number :"+sum);
    }
}