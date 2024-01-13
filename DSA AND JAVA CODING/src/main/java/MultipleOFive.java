/*
* 227. Multiple of Five
Math


Print all numbers from 1 to N (inclusive) which are multiple of 5.

Input 1: N = 15
Output 1: [5, 10, 15]
Explanation 1: 5, 10, 15 are multiples of five.

Input 2: N = 7
Output 2: [5]
Constraints:
5<=N<=10000
* */


public class MultipleOFive {
        static int[] solve(int n){
            int j=0;
            int[] store =new int[n/5];
            for(int i=1;i<=n;i++){
                if(i%5==0){
                    store[j++]=i;
                }
            }
            return store;
        }
}
