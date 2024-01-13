public class LeapYear {
        public static void main(String[] args) {
            int Leapyear=2000;

            if(Leapyear%4==0){
                if(Leapyear%100!=0 || Leapyear%400==0){
                    System.out.println("LEAP YEAR");
                }
                else{
                    System.out.println("NOT LEAP YEAR");
                }
            }else{
                System.out.println("NOT LEAP YEAR");
            }
        }
    }

//   /*
//   public class codefile{
//    static boolean check(int year){
//		if((year % 4)==0){
//            if((year % 100)==0 && (year % 400)==0){
//                return true;
//            }
//        }
//        return false;
//    }
//}*/

