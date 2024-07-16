import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class groupByStreamAPI {

     public static void main(String args[]){

         List<EmployeeData> e1= Arrays.asList(new EmployeeData(20,"manu","male"),
                 new EmployeeData(20,"Ranghu","female"),
                 new EmployeeData(20,"redbay","male"),
                 new EmployeeData(20,"test1","female"),
                 new EmployeeData(20,"test2","male"));

         Map<String,List<EmployeeData>> gG= e1.stream().collect(Collectors.groupingBy(EmployeeData::getGender));
//          for(Map.Entry<String, List<EmployeeData>> e2:gG.entrySet()){
//              System.out.println(e2.getValue()+""+e2.getKey());
//          }

         gG.forEach((g,e)->{
             System.out.println("Gender"+g);
             e.forEach(System.out::println);
             System.out.println();
         });


//         gG.forEach((gender,emplist)->{
//             System.out.println("tested"+gender);
//             emplist.forEach(System.out::println);
//             System.out.println();
//         });

     }
}
