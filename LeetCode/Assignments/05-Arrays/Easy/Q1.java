import java.util.Arrays;
//DONE
public class Q1 {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
    public static int[] twoSum(int[] nums,int target){
        int[] ans={-1,-1};
        int first=0,second=0,sum=0;
        for(int i=0;i<nums.length-1;i++){
            first=nums[i];
            for(int j=i+1;j<nums.length;j++){
                second=nums[j];
                sum=first+second;
                if(sum==target){
                    ans= new int[]{i, j};
                    return ans;
                }
            }
        }
       return ans;
    }
}
