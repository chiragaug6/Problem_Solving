public class minCostToMoveChips {
    public static void main(String[] args) {

    }

    static int minCostToMoveChips(int[] position) {
        int even=0,odd=0;
        for(int x:position){
            if(x%2==0) {
                even++;
            }else {
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}
