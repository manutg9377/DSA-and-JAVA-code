/*266. Pattern
Implementation


Print the Square Star Pattern for the given value of N.

Input 1: N = 4
Output 1:
****
****
****
****

Explanation 1: Square of 4*4 will be formed.

Input 2: N = 2
Output 2:
**
**
Constraints:
1 <= N <= 10
*/


import java.util.ArrayList;
import java.util.List;

public class Star1 {
        static List<String> solve(int n){
            List<String> ls=new ArrayList<String>();

            for(int i=1;i<=n;i++){
                String s="";
                for(int j=1;j<=n;j++){
                    s=s.concat("*");
                }
                ls.add(s);
            }

            return ls;
        }
}
