public class LargeElem02 {
    public static void main(String[] args) {
        int[] arr1 = {10, 8, 98, 3, 4, 7};
        System.out.println("Test Case 1: " + findMaxElem(arr1)); // Expected Output: 98

        int[] arr2 = {-5, -10, -3, -8};
        System.out.println("Test Case 2: " + findMaxElem(arr2)); // Expected Output: -3

        int[] arr3 = {99};
        System.out.println("Test Case 3: " + findMaxElem(arr3)); // Expected Output: 99

        int[] arr4 = {5, 5, 5, 5, 5};
        System.out.println("Test Case 4: " + findMaxElem(arr4)); // Expected Output: 5

        int[] arr5 = {1000000, 999999, 1000001};
        System.out.println("Test Case 5: " + findMaxElem(arr5)); // Expected Output: 1000001
    }

    static int findMaxElem(int[] nums){
        int max=nums[0];
        for (int num : nums) {
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}
