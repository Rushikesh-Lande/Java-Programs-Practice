class A extends Thread{
     public void run()
    {
 String str=Thread.currentThread().getName();
       for(int i=1;i<=3;i++)
      System.out.println(str);
      
    }
}
class SleepTest{
 public static void main(String args[]){
   A t=new A();

   t.setName("raju");
  
   t.run();
   
}
}