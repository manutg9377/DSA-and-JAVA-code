public class SecondLargest {
    public static int findSecondMax(int[] array) {
        int max = 0;
        int secondMax = 0;
        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            }            else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }return secondMax;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 6, 3, 2};
        int[] array2 = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Second largest in array1: " + findSecondMax(array1));
        System.out.println("Second largest in array2: " + findSecondMax(array2));
    }
}
