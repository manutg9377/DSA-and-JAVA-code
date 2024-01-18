/*
*Write a function to find sum of all even numbers from 1 to N.

Input 1: N = 6
Output 1: 12
Explanation 1: Sum = (2 + 4 + 6) = 12

Input 2: N = 2
Output 2: 2
Constraints:
1 <= N <= 105
 */

public class SumOfNumber {
        static int solve(int n){
            int summation=0;
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    summation+=i;
                }
            }
            return summation;
        }
}
