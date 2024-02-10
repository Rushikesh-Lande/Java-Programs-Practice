import java.util.Scanner;
interface client{
         void input();
         void output();

}

class Rushi implements client{
       String Name;
       double Sal;
          public void input()
          {
       Scanner sc=new Scanner(System.in);
       System.out.println("Eneter Name of Person");
          String Name=sc.nextLine();
       System.out.println("Eneter sallary of Person");
          double Sal=sc.nextDouble();
          }
          
          public void output()
          {
       System.out.println(Name+" : "+Sal);
          }
public static void main(String args[]){
       client c=new Rushi();
       c.input();
       c.output();
}
}