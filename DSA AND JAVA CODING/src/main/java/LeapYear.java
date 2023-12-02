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


