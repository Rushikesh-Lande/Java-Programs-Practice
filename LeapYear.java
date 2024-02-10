import java.util.Scanner;
class LeapYear{
public static void main(String rgs[]){
     Scanner sc=new Scanner(System.in);
          System.out.println("Enter a year to check Leap year");
     int year=sc.nextInt();
     
     if(year%4==0 && year%100!=0)
       {
         if(year%100==0 && year%400==0)
       {
          System.out.println("its an leap year");
       }
       }
     else
       {
          System.out.println("its not an leap year");   
       }
     
    
}
}