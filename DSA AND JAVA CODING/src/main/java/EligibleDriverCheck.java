/*
Write a function that takes in a number as age (an integer) and returns whether that user is eligible for driving. (Assume if the user's age is greater than or equal to 18 years, then the user is eligible for driving otherwise not).


Input 1: age = 29
Output 1: true
Explanation 1: Given age is more than 18.

Input 2: age = 12
Output 2: false

Constraints:
1<=age<=100
*/

public class EligibleDriverCheck {

        static boolean check(int age){
            if(age>=18){
                return true;
            }
            return false;
        }

}
