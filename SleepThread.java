class A extends Thread{
      public void run()
    {
    String str=Thread.currentThread().getName();
      for(int i=1;i<=2;i++)
     {
     try{
        System.out.println(str);
       Thread.sleep(2000);
        }
     catch(InterruptedException e){}
     }
    }
}
class SleepThread{
public static void main(String args[]){
      A r=new A();
      A r1=new A();
      A r2=new A();

      r.setName("hi");
      r1.setName("hey");
      r2.setName("hello");

       r.start();
       r1.start();
       r2.start();

}
}