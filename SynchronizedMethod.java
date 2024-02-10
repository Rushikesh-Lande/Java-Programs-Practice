class A{
     public void m1(int num)
    {
       for(int i=1;i<=10;i++)
       {
         System.out.println(num*i);
       }
    }
}

class Thread1 extends Thread{
     table t;
     public Thread1(table t)
    {
            this.t=t;
    }
     public void run()
    {
      t.m1(5);
    }
}
s
class Thread2 extends Thread{
     table t
      public Thread2(table t)
    {
            this.t=t;
    }
     public void run()
    {
     
        t.m1(100);
    }
}

class SynchronizedMethod{
  public static void main(String args[]){
     A obj=new A();

     Thread1 t1=new Thread1(obj);
     Thread2 t2=new Thread2(obj);

     t1.start();
     t2.start();
}
}