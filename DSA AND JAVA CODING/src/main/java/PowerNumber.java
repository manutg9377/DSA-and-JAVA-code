public class PowerNumber {
        static int pow(int x,int n){
            int powerNum=x;
            for(int i=2;i<=n;i++){
                powerNum=powerNum*x;
            }
            return powerNum;
        }
}
