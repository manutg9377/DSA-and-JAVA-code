import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupByLength {

    public static void main(String args[]){
        List<String> word= Arrays.asList("apple","mango","Banana","Grapes","KIWI","PEERS");
        Map<Integer,List<String>> m1= word.stream().collect(Collectors.groupingBy(String::length));
        m1.forEach((e1,l1)->{
            System.out.println("Length "+e1+" LIST"+l1);
        });
    }
}
