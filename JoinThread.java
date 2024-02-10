class A extends Thread{
      public void run()
    {
    String str=Thread.currentThread().getName();
      for(int i=1;i<=3;i++)
     {
        System.out.println(str);
     }
    }
}
class JoinThread{
public static void main(String args[]){
      A r=new A();
      A r1=new A();
      A r2=new A();

      r.setName("hi");
      r1.setName("hey");
      r2.setName("hello");

       r.start();
 
     try{
      r.join();
        }
     catch(InterruptedException e)
        {
        }
       r1.start();
       r2.start();

}
}