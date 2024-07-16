public class FibonanciSeriesGenration {
    public static void main(String args[]){
        int a=0;
        int b=1;
        int n=10;
        int c=0;
        for(int i=0;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
///0 1 1 2 3 5 8 13 21 34