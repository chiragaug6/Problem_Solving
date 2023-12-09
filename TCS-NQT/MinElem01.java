public class MinElem01{
    public static void main(String[] args){
        int[] arr1 = {10, 8, 98, 3, 4, 7};
        System.out.println("Test Case 1: " + findMinElem(arr1)); // Expected Output: 3

        int[] arr2 = {-5, -10, -3, -8};
        System.out.println("Test Case 2: " + findMinElem(arr2)); // Expected Output: -10

        int[] arr3 = {99};
        System.out.println("Test Case 3: " + findMinElem(arr3)); // Expected Output: 99

        int[] arr4 = {5, 5, 5, 5, 5};
        System.out.println("Test Case 4: " + findMinElem(arr4)); // Expected Output: 5

        int[] arr5 = {1000000, 999999, 1000001};
        System.out.println("Test Case 5: " + findMinElem(arr5)); // Expected Output: 999999
    }

    static int findMinElem(int[] nums){
        int min=nums[0];
        for (int num : nums) {
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}