//Date 02-01-2022
public class Detect_Capital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Leetcode"));
    }

    static boolean detectCapitalUse(String word) {
        boolean isLower=true;
        boolean isUpper=true;
        boolean isCamelCase=true;

        for(int i=0;i<word.length();i++){
            if(!Character.isLowerCase(word.charAt(i))) {
                isLower=false;
            }

            if(!Character.isUpperCase(word.charAt(i))){
                isUpper=false;
            }
        }

        for(int i=1;i<word.length();i++){
            if(!Character.isLowerCase(word.charAt(i))){
                isCamelCase=false;
            }
        }

        if(!(isCamelCase && Character.isUpperCase(word.charAt(0)))){
            isCamelCase=false;
        }

        return isLower || isUpper || isCamelCase;
    }
}
