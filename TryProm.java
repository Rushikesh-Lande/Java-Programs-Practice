public class TryProm{

          int a=10;
        static int b=20;
   public static void main(String... arg){

    TryProm t1=new TryProm();

          t1.a=100;
          t1.b=200;

     TryProm t2=new TryProm();

      System.out.println("t1.a = "+t1.a+"  t1.b = "+t1.b);
      System.out.println("t2.a = "+t2.a+"  t2.b = "+t2.b);
}
}