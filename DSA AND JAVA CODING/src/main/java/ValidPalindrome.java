public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String ls=s.toLowerCase();
        String ns="";
        for(char c:ls.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                ns=ns+c;
            }
        }
        for(int i=0;i<ns.length()/2;i++){
            if(ns.charAt(i)!=ns.charAt(ns.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
