class A implements Runnable{
 String str=Thread.currentThread().getName();
     public void run(){
   try
     {
   for(int i=0;i<=3;i++)
      {
    System.out.println(str);
    Thread.sleep(2000);
      }
     }
    catch(InterruptedException e){}
}
}

class ThreadSleep{
   public static void main(String args[]){

     A a=new A();
     A a1=new A();
     A a2=new A();
     Thread t=new Thread(a);
     Thread t1=new Thread(a1);
     Thread t2=new Thread(a2);
      t.setName("uddhav");
      t1.setName("uddhav01");
      t2.setName("uddhav02");
     t.start();
     t1.start();
     t2.start();
    
}
}




 /*try{
    for(int i=0;i<=3;i++)
      {
    System.out.println(str);
    Thread.sleep(2000);
      }
      }
   catch(InterruptedException e){}
      }*/	