// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MissingNumbeArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        int[] arr1={4,5,6};
        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    found=true;
                    break;

                }
            }
            if(!found){
                System.out.println(arr[i]);
            }
        }

    }
}
     