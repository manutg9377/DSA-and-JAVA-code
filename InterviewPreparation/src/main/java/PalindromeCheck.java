public class PalindromeCheck {
    public static void main(String args[]){
        String s="MADAM";
        char[] c=s.toCharArray();
        char temp=' ';
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=s.length()-1;
        boolean check=true;
        while(i<j){
            if(c[i]!=c[j]){
                check=false;
            }
            i++;j--;
        }
        if(!check){
            System.out.println("not palindrome");
        }else{
            System.out.println("Palindrome");
        }
    }
}
