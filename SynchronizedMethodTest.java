class Table{
     public synchronized void m1(int num) 
    {
       for(int i=1;i<=5;i++)
       {
         System.out.println(num*i);
       try{
        Thread.sleep(1000);
          }
       catch(InterruptedException e){}
       }
    }
}

class Thread1 extends Thread{
     Table t;
     public Thread1(Table t)
    {
            this.t=t;
    }
     public void run() 
    {
      t.m1(5);
    }
}
class Thread2 extends Thread{
     Table t;
      public Thread2(Table t) 
    {
            this.t=t;
    }
     public void run()
    {
     
        t.m1(100);
    }
}

class SynchronizedMethodTest{
  public static void main(String args[]){
     Table obj=new Table();

     Thread1 t1=new Thread1(obj);
     Thread2 t2=new Thread2(obj);

     t1.start();
     t2.start();
}
}