public class LastLengthOfString{
    static int solve(String s){
        int length=0;
        boolean foundNonSpace=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                length++;
                foundNonSpace=true;
            }else{
                if (foundNonSpace) {
                    break;
                }
            }
        }
        return length;
    }
}

//class Solution {
//    public int lengthOfLastWord(String s) {
//        int count=0;
//        String ss[]=s.split(" ");
//        return ss[ss.length-1].length();
//    }
//}