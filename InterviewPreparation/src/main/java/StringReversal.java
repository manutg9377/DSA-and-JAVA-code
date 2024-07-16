public class StringReversal {
    public static void main(String args[]){
         String s="TESTING";
         char[] c=s.toCharArray();
         char temp=' ';
        StringBuilder sb=new StringBuilder();
//         for(int i=s.length()-1;i>=0;i--){
//             sb.append(c[i]);
//         }
//         System.out.println(sb.toString());
//
        int i=0;
        int j=s.length()-1;
        while(i<j){
            temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;j--;
        }
        for(char ch:c){
            sb.append(ch);
        }
        System.out.println(sb.toString());

    }
}
