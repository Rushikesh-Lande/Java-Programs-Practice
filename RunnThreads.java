class A implements Runnable{
       public void run()
     { 
          System.out.println("My child Threats");
      
     }

}

class RunnThreads{
 public static void main(String args[]){
      A t=new A();
      A t1=new A();
      A t2=new A();

     Thread r=new Thread(t);
     Thread r1=new Thread(t1);
     Thread r2=new Thread(t2);

      r.start();
      r1.start();
      r2.start();
        
    System.out.println("main Threat");
        
}
}