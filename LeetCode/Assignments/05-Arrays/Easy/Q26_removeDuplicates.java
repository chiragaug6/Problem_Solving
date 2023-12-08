//DONE
import java.util.Arrays;
public class Q26 {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        System.out.println(removeDuplicates(arr));
    }

//    return distinct element count
//    Input: nums = [0,0,1,1,1,2,2,3,3,4]
//    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

    static int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(leftUnique(nums,i)){
                swap(nums,count,i);
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
//        return nums;
    }

    static boolean leftUnique(int[] nums,int index){
        int value=nums[index];
        int x=index-1;
        while(x>=0){
            if(value==nums[x]){
                return false;
            }
            x--;
        }
        return true;
    }
    static void swap(int[] nums,int index1,int index2){
        int temp=0;
        temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}


//FINAL:: solution // array is sorted in non-decreasing order.

class Solution {
    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for(int i = 1; i < nums.length; i++){
            // We skip to next index if we see a duplicate element
            if(nums[i - 1] != nums[i]) {
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}