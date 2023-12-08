public class Jump_Game {
    public static void main(String[] args) {
        int[] arr={2,3,1,1,4};
        System.out.println(canJump(arr));
    }

    public static boolean canJump(int[] nums) {
        int n=nums.length;
        int reachable=0;
        for(int i=0;i<n;i++){
            int jump=nums[i];
            if(reachable<i){
                return false;
            }
            reachable=Math.max(reachable,i+jump);
        }
        return true;
    }
}
