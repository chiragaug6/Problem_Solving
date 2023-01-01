public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
//      time complexity = O(n^2)
        int max=nums[0],sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum>max){
                    max=sum;
                }
            }
            sum=0;
        }
//        return max;

//        kadane algorithm , time complexity = O(n)

        int currentSum=0;
        int maxSum=nums[0];
        for(int i=0;i< nums.length;i++){
            currentSum=currentSum+nums[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}
