import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DescendingOrderArray {
        public static void main(String[] args) {
            Integer[] array = {1, 0, 1, 1, 0, 0, 1, 1};

            // Sort the array in ascending order
//            Arrays.sort(Comparator.reverseOrder());

//            Arrays.sort(array,Collections.reverseOrder());
//            for (int i = 0; i < array.length / 2; i++) {
//                int temp = array[i];
//                array[i] = array[array.length - 1 - i];
//                array[array.length - 1 - i] = temp;
//            }
            int countOne=0;
            int countZero=0;
            for(int i=0;i<array.length;i++){
                if(array[i]==1){
                    countOne++;
                }else{
                    countZero++;
                }
            }
            for(int i=0;i<array.length;i++){
                if(i < countOne){
                   array[i]=1;
                }else{
                    array[i]=0;
                }
            }
            System.out.println("Sorted array in descending order: " + Arrays.toString(array));
        }
}