/*157. Length of Last Word
String


Given a string s consisting of words and spaces, return the length of the last word in the string. A word is a maximal substring consisting of non-space characters only.

Input 1: s = "Hello World"
Output 1: 5
Explanation 1: The last word is "World" with length 5.

Input 2: s = " fly me to the moon "
Output 2: 4
Constraints:
1 <= s.length <= 10000
s consists of only English letters and spaces ' '.
There will be at least one word in s.
*/

public class LengthOfLastWord {
    static int solve(String s){
        int count=0;
        String snew=s.trim();
        for(int i=snew.length()-1;i>0;i--){
            if(snew.charAt(i) != ' '){
                count++;
            }
            else if(snew.charAt(i) == ' '){
                break;
            }
        }
        return count;

    }
}
