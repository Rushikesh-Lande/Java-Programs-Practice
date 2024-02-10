class A extends Thread{
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
class SynchronizationThread02{
public static void main(String args[]){
      A r=new A(1);
      A r1=new A(1);
      A r2=new A(1);
   
    
     r.setName("raju");
     r1.setName("rakesh");
     r2.setName("ramesh");

    r.start();
    r1.start();
    r2.start();

}
}