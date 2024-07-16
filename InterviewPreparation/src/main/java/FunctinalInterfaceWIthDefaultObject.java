@FunctionalInterface
interface MoneyDefaultObject{
    public int travel(int a , int b);

    default public void expenses(){
        System.out.println("EST expense");
    }
}

class Check implements MoneyDefaultObject{
    @Override
    public int travel(int a , int b) {
        return 0;
    }

    public void expenses(){
        System.out.println("EST expense extended");
    }
}

class FunctionalInterfaceWithDefault {
    public static void main(String args[]){
        MoneyDefaultObject money=new Check();
          money.expenses();
        Money trav=(a,b)->a+b;
        int result= trav.travel(10,20);
        System.out.println(result);
    }
}
