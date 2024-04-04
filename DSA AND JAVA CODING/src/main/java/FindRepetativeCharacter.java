//import java.util.HashMap;
//import java.util.Map;
//
//public class FindRepetativeCharacter {
//    String s = "hello world";
//    HashMap<Character,Integer> hm = new HashMap<>();
//        for(int i=0;i<s.length();i++){
//        char c=s.charAt(i);
//        if(hm.containsKey(c)){
//            hm.put(c,hm.getOrDefault(c,0)+1);
//        }else{
//            hm.put(c,1);
//        }
//    }
//         for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
//        Character key = entry.getKey();
//        Integer value = entry.getValue();
//        System.out.println("Key: " + key + ", Value: " + value);
//    }
//}
