
class RunableThreadClass implements Runnable{

       public synchronised void run(){
          for(int i=0;i<10;i++){System.out.println(i);}
        }

     public static void main(String args[]){
 
     RunableThreadClass rn=new RunableThreadClass();

      Thread t=new Thread(rn);   

      t.start();
    
}   
}