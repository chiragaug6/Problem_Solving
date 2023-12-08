public class Jewels_and_Stones {
    public static void main(String[] args) {
        String jewels="aA";
        String stones="AAbbbbaa";
        System.out.println(numJewelsInStones(jewels,stones));
    }

    static int numJewelsInStones(String jewels, String stones) {
        //Time Complexity : O(n^2) Space Complexity :O(1)
//        int count=0;
//        for(int i=0;i<jewels.length();i++){
//            char temp=jewels.charAt(i);
//            for(int j=0;j<stones.length();j++){
//                if(temp==stones.charAt(j)){
//                    count++;
//                }
//            }
//        }
//        return count;


        //Time Complexity : O(n) Space Complexity :O(1)
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(jewels.indexOf(stones.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
}
