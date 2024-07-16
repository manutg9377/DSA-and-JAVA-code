public class FIbonanciSeriesGenerationRecursion {
    public static int fibo(int n){
        if(n<=1){
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String args[]){
        int n=10;
         for(int i=0;i<n;i++){
             int result=FIbonanciSeriesGenerationRecursion.fibo(i);
             System.out.println(result);
         }
    }
}

///0 1 1 2 3 5 8 13 21 34
