interface Money{
    public int travel(int a , int b);

//    default public void expenses(){
//        System.out.println("EST expense");
//    }
}

//class Check implements Money{
//    @Override
//    public int travel(int a , int b) {
//        return 0;
//    }
//
//    public void expenses(){
//        System.out.println("EST expense extended");
//    }
//}

public class FunctionalInterfaceWithLamda {
      public static void main(String args[]){
//          Money money=new Check();
//          money.expenses();
          Money trav=(a,b)->a+b;
          int result= trav.travel(10,20);
         System.out.println(result);
      }
}
