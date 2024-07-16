import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlamap {

    public static void main(String args[]){
        List<String> l1= Arrays.asList("ust1","ust2","ust3");
        List<String> l2= l1.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(l2);

        List<List<String>> l3=Arrays.asList(Arrays.asList("test1","test2"),Arrays.asList("test3","test4"),Arrays.asList("test5","test6"));
        List<String> l4= l3.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(l4);

    }
}
