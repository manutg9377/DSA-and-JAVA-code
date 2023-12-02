public class Palindrome{
    static boolean check(int n){
        int storeVar=0;
        int num=n;
        boolean palind=false;
        while(n>0){
            int remainderValue=n%10;
            storeVar=storeVar*10+remainderValue;
            n=n/10;
        }
        if(num==storeVar){
            palind=true;
        }
        return palind;
    }
}