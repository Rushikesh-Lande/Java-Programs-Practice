class A extends Thread{
    int available=1,passanger;
    public A(int passanger)
    {
        this.passanger=passanger;
    }
 String name=Thread.currentThread().getName();
     public void run()
    {
      if(available>=passanger)
      {
         System.out.println(name+ " Reserved seat");
      }
      else
      {
         System.out.println("seat not available");
      }
    }
}
class SyncronyzationThread{
public static void main(String args[]){
      A r=new A(1);
    
     r.setName("raju");
     r.setName("rakesh");
     r.setName("ramesh");

    r.start();
    r.start();
    r.start();

}
}