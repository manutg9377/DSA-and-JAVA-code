/*Find Factorial value of the given Integer.



Input: N = 2
Output: 2

Input: N = 5
Output: 120

Constraints:
1 <= N <= 104 */


public class Factorial {
        static int solve(int n){
            int muly=1;
            for(int i=n;i>0;i--){
                muly*=i;
            }
            return muly;
        }
}
