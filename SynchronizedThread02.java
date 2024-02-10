class Table {
     public void m1(int n){
      synchronized (this)
    {
      for(int i=1;i<=5;i++)
    {
      System.out.println(i*n);
    }
    }
}
}

class Thread1 extends Thread{
   Table A;
  public Thread1(Table A)
    {
       this.A=A;
    }
   
  public void run()
    {
      A.m1(100);
    }
}
class Thread2 extends Thread{
  Table A;
  public Thread2(Table A)
    {
       this.A=A;
    }
   
  public void run()
    {
      A.m1(5);
    }
}
class SynchronizedThread02{
public static void main(String args[]){
  Table  obj=new Table();

   Thread1 t=new Thread1(obj);
   Thread2 t1=new Thread2(obj);

   t.start();
   t1.start();

}
}
