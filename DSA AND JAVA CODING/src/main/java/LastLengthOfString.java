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