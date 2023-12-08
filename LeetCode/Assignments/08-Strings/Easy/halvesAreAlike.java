import java.util.Arrays;

public class halvesAreAlike {
    public static void main(String[] args) {
        String str="book";
        System.out.println(String_Halves_Are_Alike(str));
    }

    static boolean String_Halves_Are_Alike(String s) {
        //Time Complexity : O(n) Space Complexity :Omega(n)
//        int first=0,second=0;
//        s=s.toLowerCase();
//        String[] arr=s.split("");
//        for(int i=0;i<(arr.length/2);i++){
//            if(arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")){
//                first++;
//            }
//        }
//
//        for(int i=(arr.length)/2;i<arr.length;i++){
//            if(arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")){
//                second++;
//            }
//        }
//        if(first==second){
//            return true;
//        }
//        return false;

        //Time Complexity : O(n) Space Complexity :O(1)
        int first=0,second=0;
        String vowels="aeiouAEIOU";
        for(int i=0;i<s.length()/2;i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                first++;
            }

            if(vowels.indexOf(s.charAt((s.length()/2)+i))!=-1){
                second++;
            }
        }
        if(first!=second){
            return false;
        }
        return true;
    }
}
