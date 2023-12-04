/*
* 2021. Fibonacci
Math


Write a program to print Fibonacci series of n terms where n is input by user -->> 0 1 1 2 3 5 8 13 21 ....

-> Fibonacci series in which each number is the sum of the two preceding ones.

Input 1: N = 4
Output 1: [0, 1, 1, 2]
Explanation 1: First four numbers of Fibonacci Series are 0, 1, 1 and 2

Input 2: N = 2
Output 2: [0, 1]*/

public class Fibonanci {
    static int[] solve(int n){
        int a=0;
        int b=1;
        int[]  fibo=new int[n];
        for(int i=0;i<n;i++){
            fibo[i]=a;
            int c=a+b;
            a=b;
            b=c;
        }
        return fibo;
    }
}
