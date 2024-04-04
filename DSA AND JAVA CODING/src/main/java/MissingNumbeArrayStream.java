// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class MissingNumbeArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        int[] arr1={4,5,6};
        Arrays.stream(arr).filter(a->Arrays.stream(arr1).noneMatch(x->x.arr)).
                forEach(System.out.print(arr));


    }
}
     