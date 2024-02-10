class A implements Runnable{
       public void run()
     { 
        for(int i=1;i<=5;i++)
        {
          System.out.println("My child Threats");
        }
     }

}

class RunThreads{
 public static void main(String args[]){
      A t=new A();
     Thread r=new Thread(t);
      r.start();
         for(int i=1;i<=5;i++)
        {
          System.out.println("main Threat");
        }
}
}