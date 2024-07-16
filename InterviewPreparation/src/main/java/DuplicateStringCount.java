import java.util.HashMap;
import java.util.Map;

public class DuplicateStringCount {
    public static void main(String args[]){
        String s1="Virat is a greate Player with a greate a vision";
        Integer count=0;
        HashMap<String,Integer> hm1=new HashMap<>();
        String[] s2=s1.split(" ");
        for(String word:s2){
                    if(hm1.containsKey(word)) {
                        hm1.put(word,hm1.get(word)+1);
                    }else{
                        hm1.put(word,1);
                    }


        }
        for(Map.Entry<String,Integer> e1:hm1.entrySet()){
            if(e1.getValue()>1){

                System.out.println(e1.getKey()+""+e1.getValue());
            }
        }

    }
}
