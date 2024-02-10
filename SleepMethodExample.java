class JoinExp extends Thread{

    public void run()
   {
 String str= Thread.currentThread().getName();
     for(int i=1;i<=3;i++)
    {
      System.out.println(str);
      try{
      Thread.sleep(1000);
         }
      catch(Exception e){}
    }
   }
}
class SleepMethodExample{
public static void main(String args[])throws InterruptedException{
   JoinExp a=new JoinExp();
   JoinExp a1=new JoinExp();
   JoinExp a2=new JoinExp();

    a.setName("hi");
    a1.setName("hey");
    a2.setName("hello");

     a.start();
     a1.start();
     a2.start();
     a2.join();

}
}