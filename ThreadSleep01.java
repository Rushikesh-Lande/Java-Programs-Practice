class A extends Thread{

     public void run() throws InterruptedException{
     String str=Thread.currentThread().getName(); 
   for(int i=1;i<=3;i++)
      {
    System.out.println(str);
    Thread.sleep(2000);
      }
}
}

class ThreadSleep01{
   public static void main(String args[]){

     A a=new A();
     A a1=new A();
     A a2=new A();
  
      a.setName("uddhav");
      a1.setName("uddhav01");
      a2.setName("uddhav02");

     a.start();
     a1.start();
     a2.start();
    
}
}
