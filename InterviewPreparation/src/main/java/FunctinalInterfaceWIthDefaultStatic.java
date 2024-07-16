@FunctionalInterface
interface MoneyDefaultStatic{
    public void show();
     static int travel(int a , int b){
         return a+b;
     }

}



class FunctionalInterfaceWithDefaultStatic {
    public static void main(String args[]){
        int travel= MoneyDefaultStatic.travel(10,20);
System.out.println(travel);
    }
}
