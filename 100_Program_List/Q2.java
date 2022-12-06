//LeetCode:Q125

class Q2 {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int j=s.length();
        String newstr="";
        // Filter New String Without any special Character
        for(int i=0;i<j;i++){
            int ascii=(int)s.charAt(i);
            if(ascii>=97&&ascii<=122 || ascii>=48&&ascii<=57){
                newstr=newstr+s.charAt(i);
            }
        }
        // System.out.println(newstr);

        int length=newstr.length();
        String forward=" ";
        String reverse=" ";
        //
        for(int i=0;i<length;i++){
            forward=forward+newstr.charAt(i);
        }
        // System.out.println(forward);
        for(int i=length-1;i>=0;i--){
            reverse=reverse+newstr.charAt(i);
        }
        // System.out.println(reverse);
        if(forward.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}