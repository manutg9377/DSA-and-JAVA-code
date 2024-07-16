import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareRun1 {

    public static void main(String args[]){
        List<Military> l1=Arrays.asList(new Military(20,"Manu"),new Military(80,"RanJu"),new Military(30,"Baby"));
        Collections.sort(l1);
        Military m1=new Military();
        Collections.sort(l1,m1);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i).age);
            System.out.println(l1.get(i).name);
        }

    }
}
