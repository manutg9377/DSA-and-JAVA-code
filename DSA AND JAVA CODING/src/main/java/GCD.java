/*
99. Find GCD
Math


GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the largest number that divides both of them.

Input 1: N = 36, M = 60
Output 1: 12
Explanation 1: GCD = Multiplication of common factors = 2*2*3 = 12

Input 2: N = 20, M = 28
Output 2: 4
Constraints:
1 <= N <= 106
1 <= M <= 106
 */


public class GCD {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }

}
