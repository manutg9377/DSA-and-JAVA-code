import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComapareRun {
    public static void main(String args[]){
        List<Student> students= Arrays.asList(new Student(90,"manu"),new Student(40,"Ranju"),new Student(50,"baby"));
        Collections.sort(students);
        for(int i=0;i<students.size();i++){
            System.out.println(students.get(i).age);
        }


        List<Lactures> lactures= Arrays.asList(new Lactures(70,"manu"),new Lactures(40,"Ranju"),new Lactures(50,"baby"));
        Lactures l1=new Lactures();

        Collections.sort(lactures,l1);
        for(int i=0;i<lactures.size();i++){
            System.out.println(lactures.get(i).score);
        }
    }
}
