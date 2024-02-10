class A implements Runnable{
    int available=1,passanger;
    public A(int passanger)
    {
        this.passanger=passanger;
    }

     public synchronized void run()
    {
  String name=Thread.currentThread().getName();
      if(available>=passanger)
      {
         System.out.println(name+ " Reserved seat");
         available=passanger-available;
      }
      else
      {
         System.out.println("seat not available");
      }
    }
}
class SynchronizationThread{
public static void main(String args[]){
      A t=new A(1);
     Thread r=new Thread(t);
     Thread r1=new Thread(t);
     Thread r2=new Thread(t);
    
     r.setName("raju");
     r1.setName("rakesh");
     r2.setName("ramesh");

    r.start();
    r1.start();
    r2.start();

}
}