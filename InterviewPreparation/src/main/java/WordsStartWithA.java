import java.util.Locale;

public class WordsStartWithA {
    public static void main(String args[]){
        String[] s={"MAnu","RanJu","Akshay","arun","SOorya"};

        for(String s1:s){
            String sL=s1.toLowerCase();
            if(sL.startsWith("a")){
                System.out.println(s1);
            }
        }
    }
}
