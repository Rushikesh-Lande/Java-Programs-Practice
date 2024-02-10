class A implements Runnable{
      public void run()
     {
     for(int i=1;i<=3;i++){
      System.out.println(Thread.currentThread().getName());
      System.out.println(Thread.currentThread().getPriority());
     }
     }
}
class GetSetPriority{
public static void main(String args[]){
    A r=new A();
    A r1=new A();
    A r2=new A();

   Thread t=new Thread(r);
   Thread t1=new Thread(r1);
   Thread t2=new Thread(r2);

   t.setName("hi");
   t1.setName("hey");
   t2.setName("hello");

   t.setPriority(4);
   t1.setPriority(9);
   t2.setPriority(7);

   
   t.start();
   t1.start();
   t2.start();
    
}
}