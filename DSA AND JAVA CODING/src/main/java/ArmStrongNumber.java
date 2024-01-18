public class ArmStrongNumber {

        static boolean check(int n){
            int varia=n;
            int temp=0;
            while(n>0){
                int value=n%10;
                n=n/10;
                int valuefianl=1;
                for(int i=1;i<=3;i++){
                    valuefianl=valuefianl*value;
                }
                temp=temp+valuefianl;
            }
            if(varia==temp){
                return true;
            }else{
                return false;
            }
        }

}
